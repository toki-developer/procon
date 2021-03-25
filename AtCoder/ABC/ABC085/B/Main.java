package AtCoder.ABC.ABC085.B;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(sc.next()));
        }

        list = list.stream().distinct().collect(Collectors.toList());
        Collections.sort(list);
        System.out.println(list.size());

    }
}
