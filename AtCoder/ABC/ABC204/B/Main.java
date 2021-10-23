package AtCoder.ABC.ABC204.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int total = 0;
        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(sc.next());
            if(a > 10) {
                total += a -10;
            }
        }
        System.out.println(total);
    }
}
