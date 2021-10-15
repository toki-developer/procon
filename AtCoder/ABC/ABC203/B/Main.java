package AtCoder.ABC.ABC203.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                ans += i * 100 + j;
            }
        }
        System.out.println(ans);
    }
}