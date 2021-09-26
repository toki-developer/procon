package AtCoder.ABC.ABC201.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        boolean isYes = false;
        isYes = A - B == B - C || isYes;
        isYes = A - C == C - B || isYes;
        isYes = B - A == A - C || isYes;
        System.out.println(isYes ? "Yes" : "No");
    }
}
