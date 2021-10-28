package AtCoder.ABC.ABC205.C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        System.out.println(calc(a, b, c));
    }

    public static String calc(int a, int b, int c) {
        boolean isEvenC = c % 2 == 0;

        if (isEvenC) {
            a *= a;
            b *= b;
        }
        if (a < b) {
            return "<";
        } else if (a > b) {
            return ">";
        }
        return "=";
    }
}
