public class Laptop extends Perangkat{
    protected boolean webcam;
    Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    @Override 
    public void informasi() {
        if (webcam) {
            System.out.printf("Laptop ini memiliki drive tipe %s dengan ram sebesar %d GB dan processor secepat %.2f Ghz. Selain itu laptop ini juga memiliki webcam \n",
            this.drive, this.ram, this.processor);
        }else {
            System.out.printf("Laptop ini memiliki drive tipe %s dengan ram sebesar %d GB dan processor secepat %.2f Ghz. Laptop ini TIDAK memiliki webcam \n",
            this.drive, this.ram, this.processor);
        }
    }
    public void bukaGame(String nama_game) {
        System.out.printf("Laptop berhasil membuka game %s", nama_game);
    }

    public void kirimEmail(String email) {
        System.out.printf("Laptop berhasil mengirim Email ke %s", email);
    }

    public void kirimEmail(String email1, String email2) {
        System.out.printf("Laptop berhasil mengirim Email ke %s dan %s", email1, email2);
    }
}
