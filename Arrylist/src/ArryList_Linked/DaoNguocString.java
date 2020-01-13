package ArryList_Linked;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        System.out.println("nhap kick thuoc chuoi");
        String n = sc.nextLine();
        String[] arStr = n.split("\\s");
        for (String item : arStr) {
            System.out.println(item);
        }
        for(int i= 0;i<arStr.length;i++){
            stack.push(arStr[i]);
        }
        System.out.println("Mang Da bi Dao nguoc");
        for (int i=0;i<arStr.length;i++){
            arStr[i]=stack.pop();
        }
        for(String W:arStr){
            System.out.println(W);
        }
    }
}