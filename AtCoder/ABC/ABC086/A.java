package AtCoder.ABC.ABC086;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int x = a * b;
        if (x % 2 == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}