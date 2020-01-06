import java.util.Scanner;

public class mm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("dien gia tri");
        int number = sc.nextInt();
        int cout=0;
        boolean a=true;
        int n=2;
        int x=2;
        for(;n<=number;n++){
            double sqrt=Math.sqrt(n);
            for(;x<=sqrt;x++){
                if(n % x !=0){
                    System.out.println();
                }
            }
        }

    }
}