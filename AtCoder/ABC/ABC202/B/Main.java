package AtCoder.ABC.ABC202.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numsStr = sc.next();
        String[] numsStrArray = numsStr.split("");
        String ans = "";
        for (String s : numsStrArray) {
            ans = rotateNumStr(s) + ans;
        }
        System.out.println(ans);
    }

    public static String rotateNumStr(String num) {
        if (num.equals("6"))
            return "9";
        if (num.equals("9"))
            return "6";
        return num;
    }
}