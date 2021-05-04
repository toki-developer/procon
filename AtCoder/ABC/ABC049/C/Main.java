package AtCoder.ABC.ABC049.C;

import java.util.Scanner;

public class Main {
    static String[] strs = { "dream", "dreamer", "erase", "eraser" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        while (true) {
            boolean endsWithStr = false;
            for (String str : strs) {
                if (S.endsWith(str)) {
                    endsWithStr = true;
                    S = S.substring(0, S.length() - str.length());
                    break;
                }
            }
            if (!endsWithStr) {
                System.out.println("NO");
                break;
            }
            if (S.length() <= 0) {
                System.out.println("YES");
                break;
            }
        }

        // S = S.replaceAll("eraser", "-");
        // S = S.replaceAll("erase", "-");
        // S = S.replaceAll("dreamer", "-");
        // S = S.replaceAll("dream", "-");
        // S = S.replaceAll("-", "");
        // if (S.length() == 0)
        // System.out.println("YES");
        // else
        // System.out.println("NO");
    }
}
