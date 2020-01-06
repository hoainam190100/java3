import java.util.Scanner;

public class giatritrongmang {
    public static void main(String[] args) {
        int size;
        int[] arry;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter a size:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("kich thuoc ko vuot qua 20");
        }
        while (size > 20);
        arry = new int[size];
        int i = 0;
        while (i < arry.length) {
            System.out.println("nhap phan tu" + (i + 1)+":");
            arry[i] = sc.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < arry.length; j++) {
            System.out.print(arry[j] + "\t");
        }
        int max = arry[0];
        int index = 1;
        for (int j = 0; j < arry.length; j++) {
            if (arry[j] > max) {
                max = arry[j];
                index = j + 1;
            }
            System.out.println("The largest property value in the list is " + max + " ,at position " + index);
        }
    }
}

