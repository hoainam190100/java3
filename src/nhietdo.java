import java.util.Scanner;

public class nhietdo {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);        double C;
        double F;
        int chon;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            chon = input.nextInt();

            switch (chon) {
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    System.exit(0);
            }
        } while (chon != 0);
    }

    public static double CtoF(double C){
        double F =(9.0/5)* C+ 32;
        return F;
    }
    public static double FtoC(double F){
        double C=(5.0 / 9) * (F - 32);
        return C;
    }
}
