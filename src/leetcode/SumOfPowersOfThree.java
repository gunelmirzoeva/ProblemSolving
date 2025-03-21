package leetcode;

import java.util.Scanner;

//https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/description/?envType=daily-question&envId=2025-03-04
public class SumOfPowersOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPowersOfThree(n));

    }
    public static boolean checkPowersOfThree(int n) {
        while(n!=0) {
            if (n % 3 == 2) {
                return false;
            }
            n /= 3;
        }
        return true;
    }
}
