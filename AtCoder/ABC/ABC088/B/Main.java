package AtCoder.ABC.ABC088.B;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        Integer[] a = new Integer[N];
        int A = 0;
        int B = 0;

        for(int i = 0;i < N; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(a,Comparator.reverseOrder());
        for(int i = 0;i < N; i++) {
            if(i % 2 == 0) {
                A += a[i];
            } else {
                B += a[i];
            }
        }
        System.out.println(A - B);
    }
}