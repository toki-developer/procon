package AtCoder.ABC.ABC081.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = Integer.parseInt(sc.next());

        int count = 0;
        while(s1 > 0) {
            if(s1 % 10 == 1) {
                count ++;
            }
            s1 /= 10;
        }
        System.out.println(count);

    }
}