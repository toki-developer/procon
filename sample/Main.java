package sample;

import java.util.Scanner;

// 100円のコーラしかない自販機のサンプル
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("お金を入れてください。");
        int total = Integer.parseInt(scanner.next());
        while (total < 100) {
            System.out.println("お金が足りていません。お金を入れてください。");
            int y = Integer.parseInt(scanner.next());
            total += y;
        }
        System.out.print("コーラを購入しました。");
        total -= 100;
        if (total > 0) {
            System.out.println(total + "円のおつりです。");
        }
        scanner.close();
    }
}
