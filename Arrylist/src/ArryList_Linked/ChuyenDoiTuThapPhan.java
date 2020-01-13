package ArryList_Linked;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiTuThapPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
            while (N != 0) {
                stack.push(N % 2);
                N = N / 2;

            }
            for (int x : stack) {
                System.out.println(x);
            }
        }
    }
