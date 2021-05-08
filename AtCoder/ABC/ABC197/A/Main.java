package AtCoder.ABC.ABC197.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String ans = S.substring(1) + S.charAt(0);
        System.out.println(ans);
    }
}
