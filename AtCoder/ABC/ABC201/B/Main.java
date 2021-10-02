package AtCoder.ABC.ABC201.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String topName = "";
        int topHeight = 0;
        String secondName = "";
        int secondHeight = 0;
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int height = Integer.parseInt(sc.next());
            if (height > topHeight) {
                secondHeight = topHeight;
                secondName = topName;
                topHeight = height;
                topName = name;
            } else if (height > secondHeight) {
                secondHeight = height;
                secondName = name;
            }
        }
        System.out.println(secondName);
    }
}