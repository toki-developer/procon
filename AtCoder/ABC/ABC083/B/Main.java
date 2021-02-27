package AtCoder.ABC.ABC083.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int ans = 0;
        int I = 0;
        int t = 0;

        for(int i = 1;i <= N; i++){
            I = i;
            t = 0;
            while(I > 0){
                t += I % 10;
                I = I /10;
            }
            if (t >= A && t <= B) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}