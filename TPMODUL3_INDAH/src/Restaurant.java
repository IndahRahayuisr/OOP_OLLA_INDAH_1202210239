public class Restaurant implements Runnable{
    private boolean waitingForPickup = false;
    private static final Object food = new Object();
    private static int foodNumber = 1;

    @Override
    public void run() {
        while (true) {
            makeFood();
            try{
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean WaitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getFoodNumber () {
        return foodNumber;
    }

    public void makeFood() {
        synchronized(Restaurant.food) {
            if (this.waitingForPickup) {
                try {
                    System.out.println("Restaurant: Waiting for the waiter to deliver the food");
                    Restaurant.food.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            waitingForPickup = true;
            System.out.println("Restaurant: Making food number " + foodNumber++);
            Restaurant.food.notifyAll();
            System.out.println("Restaurant: Telling the waiter to get the coffee\n");
        }
    }

    public static Object getFood() {
        return food;
    }
}
