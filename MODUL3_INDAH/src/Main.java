import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        int side;
        try {
            System.out.println("""
                ===Menu Program===
                1. Square
                2. Circle
                3. Trapezoid""");
        System.out.println("Enter length of the side of the square: ");
        side = input.nextInt();
        }catch(Exception e) {
            System.out.println("Something worng");
        }

    

    }
}
