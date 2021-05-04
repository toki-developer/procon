package AtCoder.ABC.ABC086.C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int t = 0, x = 0, y = 0;
        for (int i = 0; i < N; i++) {
            int ti = Integer.parseInt(sc.next());
            int xi = Integer.parseInt(sc.next());
            int yi = Integer.parseInt(sc.next());
            int T = ti - t;
            int D = Math.abs(xi - x) + Math.abs(yi - y);
            if (!(T >= D && (T - D) % 2 == 0)) {
                System.out.println("No");
                return;
            }
            t = ti;
            x = xi;
            y = yi;
        }
        System.out.println("Yes");
    }
}