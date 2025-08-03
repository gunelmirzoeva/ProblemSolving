package leetcode;

import java.util.Scanner;

//https://leetcode.com/problems/perfect-number/description/
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(checkPerfectNumber(num));
    }
    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }
        if(num == sum) return true;
        else return false;
    }
}
