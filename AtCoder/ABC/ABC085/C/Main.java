package AtCoder.ABC.ABC085.C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        int m1 = -1;
        int m2 = -1;
        int m3 = -1;

        loop: for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N - i; j++) {
                for (int k = 0; k <= N - i - j; k++) {
                    if (Y == i * 10000 + j * 5000 + k * 1000 && i + j + k == N) {
                        m1 = i;
                        m2 = j;
                        m3 = k;
                        break loop;
                    }
                }
            }
        }
        System.out.println(m1 + " " + m2 + " " + m3);
    }
}
