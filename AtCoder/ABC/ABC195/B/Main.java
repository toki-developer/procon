package AtCoder.ABC.ABC195.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next()) * 1000;
        int minCount = W / B;
        int maxCount = W / A;
        if (W % B != 0) {
            minCount++;
        }
        if ((W % B == 0 || W % B + minCount * (B - A) < A) && W % A > maxCount * (B - A)) {
            System.out.println("UNSATISFIABLE");
            return;
        }
        System.out.print(minCount + " " + maxCount);
    }

}
