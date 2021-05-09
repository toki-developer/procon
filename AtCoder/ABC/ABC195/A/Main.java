package AtCoder.ABC.ABC195.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = Integer.parseInt(sc.next());
        int H = Integer.parseInt(sc.next());

        if (H % M == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
