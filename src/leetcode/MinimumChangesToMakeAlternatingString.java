package leetcode;

import java.util.Scanner;

//https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/description/
public class MinimumChangesToMakeAlternatingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(minOperations(s));
    }
    public static int minOperations(String s) {
        int size = s.length();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if(i % 2 == 0) {
                s1.append('1');
                s2.append('0');
            } else {
                s1.append('0');
                s2.append('1');
            }
        }
        int count1 = 0, count2 = 0;
        for (int i = 0; i < size; i++) {
            if(s.charAt(i) != s1.charAt(i)) count1++;
            if(s.charAt(i) != s2.charAt(i)) count2++;
        }

        return Math.min(count1, count2);
    }
}
