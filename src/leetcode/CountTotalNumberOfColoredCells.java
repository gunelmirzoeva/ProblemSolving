package leetcode;

import java.util.Scanner;

//https://leetcode.com/problems/count-total-number-of-colored-cells/?envType=daily-question&envId=2025-03-05
public class CountTotalNumberOfColoredCells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(coloredCells(n));
    }
    public static long coloredCells(int n) {

        return (long) n * (n + (n - 2)) + 1;
    }
}
