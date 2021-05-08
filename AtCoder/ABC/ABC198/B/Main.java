package AtCoder.ABC.ABC198.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        while (N > 0) {
            if (N % 10 == 0) {
                N = N /= 10;
            } else {
                break;
            }
        }
        StringBuilder strb = new StringBuilder(String.valueOf(N));
        int R = Integer.parseInt(strb.reverse().toString());
        if (N == R) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
