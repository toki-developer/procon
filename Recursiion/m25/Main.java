package Recursiion.m25;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("A" == s.middleSubstring("A"));
        System.out.println("A".equals(s.middleSubstring("AB")));
        System.out.println("B".equals(s.middleSubstring("ABC")));
        System.out.println("BC".equals(s.middleSubstring("ABCD")));
        System.out.println("BC".equals(s.middleSubstring("ABCDE")));
        System.out.println("CDE".equals(s.middleSubstring("ABCDEF")));
        System.out.println("CDE".equals(s.middleSubstring("ABCDEFG")));
        System.out.println("CDEF".equals(s.middleSubstring("ABCDEFGH")));
    }

}

// 文字列 string を受け取り、文字数の半分を文字列の真ん中から返す、middleSubstring という関数を定義してください。
// （文字数が 2 以下の場合は、最初の文字を返します。）

class Solution {
    public String middleSubstring(String stringInput) {

        int i = stringInput.length() / 2;
        int j = (int) Math.ceil(i / 2.0);
        if (stringInput.length() < 3) {
            return stringInput.substring(0, 1);
        }
        return stringInput.substring(j, j + i);

    }
}
