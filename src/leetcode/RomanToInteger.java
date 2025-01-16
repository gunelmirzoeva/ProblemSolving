package leetcode;

import java.util.Scanner;

//https://leetcode.com/problems/roman-to-integer/description/
public class RomanToInteger {

    public static int romanToInt(String s) {
        int number = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'M') {
                if(i > 0 && s.charAt(i - 1) == 'C'){
                    number += 900;
                    i--;
                }
                else number += 1000;
            }
            else if (s.charAt(i) == 'D') {
                if(i > 0 && s.charAt(i - 1) == 'C'){
                    number += 400;
                    i--;
                }
                else number += 500;
            }
            else if (s.charAt(i) == 'C') {
                if (i > 0 && s.charAt(i - 1) == 'X') {
                    number += 90;
                    i--;
                } else number += 100;

            }
            else if (s.charAt(i) == 'L') {
                if (i > 0 && s.charAt(i - 1) == 'X') {
                    number += 40;
                    i--;
                } else number += 50;
            }
            else if (s.charAt(i) == 'X') {
                if (i > 0 && s.charAt(i - 1) == 'I') {
                    number += 9;
                    i--;
                } else number += 10;
            }
            else if (s.charAt(i) == 'V') {
                if (i > 0 && s.charAt(i - 1) == 'I') {
                    number += 4;
                    i--;
                } else number += 5;
            }
            else if (s.charAt(i) == 'I') {
                number += 1;
            }
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.nextLine();
        System.out.println(romanToInt(roman));
    }
}

