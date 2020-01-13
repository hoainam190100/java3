package ArryList_Linked;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("nhap so phan tu ban muon");
        int leng =sc.nextInt();
        for (int i=0; i<=leng;i++){
            System.out.println("nhap so phan tu"+(i+1)+ ":");
            stack.push(sc.nextInt());
        }
        for (int i=0;i<=leng;i++){
            System.out.println(stack.pop());
        }
    }
}
