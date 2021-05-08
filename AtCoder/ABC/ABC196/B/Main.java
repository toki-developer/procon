package AtCoder.ABC.ABC196.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.next();

        if (X.indexOf(".") == -1) {
            System.out.println(X);
        } else {
            System.out.println(X.substring(0, X.indexOf(".")));
        }
    }
}
