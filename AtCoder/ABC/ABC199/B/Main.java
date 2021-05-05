package AtCoder.ABC.ABC199.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int maxA = 0;
        int minB = 1000;

        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(sc.next());
            if (maxA < tmp)
                maxA = tmp;
        }
        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(sc.next());
            if (minB > tmp)
                minB = tmp;
        }
        int ans = minB - maxA + 1;
        if (ans > 0) {
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
    }
}
