package AtCoder.ABC.ABC194.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int minA1 = 100000;
        int minA1i = 0;
        int minA2 = 100000;
        int minB1 = 100000;
        int minB1i = 0;
        int minB2 = 100000;

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            if (a < minA1) {
                minA2 = minA1;
                minA1 = a;
                minA1i = i;
            } else if (a < minA2) {
                minA2 = a;
            }
            if (b < minB1) {
                minB2 = minB1;
                minB1 = b;
                minB1i = i;
            } else if (b < minB2) {
                minB2 = b;
            }
        }
        if (minA1i != minB1i) {
            System.out.println(Math.max(minA1, minB1));
        } else {
            System.out.println(Math.min(minA1 + minB1, Math.max(Math.max(minA1, minB1), Math.min(minA2, minB2))));
        }
    }
}
