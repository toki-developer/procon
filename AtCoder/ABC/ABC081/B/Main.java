package AtCoder.ABC.ABC081.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[n];
        int count = 0;
        boolean check = true;

        for(int i = 0 ; i < n ; i++){
           N[i] = sc.nextInt();
        }

        while(check){

        for(int t : N ){
           if(t % 2 == 1){
             check = false;
             count --;
             break;
           }
        }
        for(int i = 0 ; i < n ; i++) {
        	N[i] /= 2;
        }
        count ++;
        }
      System.out.println(count);
    }

}