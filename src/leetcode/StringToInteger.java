package leetcode;

import java.util.Scanner;

//https://leetcode.com/problems/string-to-integer-atoi/description/
public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(myAtoi(a));
    }
    public static int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty()) return 0;
        int i = 0, sign = 1;
        long result = 0L;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }
        while(i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            if (sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }
        return (int) (sign * result);
    }
}
