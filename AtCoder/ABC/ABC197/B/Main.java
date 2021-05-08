package AtCoder.ABC.ABC197.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        String[][] S = new String[H][W];
        for (int i = 0; i < H; i++) {
            String s = sc.next();
            for (int j = 0; j < W; j++) {
                S[i][j] = s.substring(j, j + 1);
            }
        }
        int count = -3;
        for (int y = Y - 1; y < W && S[X - 1][y].equals("."); y++)
            count++;
        for (int y = Y - 1; y >= 0 && S[X - 1][y].equals("."); y--)
            count++;
        for (int x = X - 1; x < H && S[x][Y - 1].equals("."); x++)
            count++;
        for (int x = X - 1; x >= 0 && S[x][Y - 1].equals("."); x--)
            count++;
        System.out.println("");
        System.out.println(count);
    }
}
