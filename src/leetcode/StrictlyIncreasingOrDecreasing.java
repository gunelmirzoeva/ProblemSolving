package leetcode;

import java.util.Scanner;

//https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/description/?envType=daily-question&envId=2025-02-03
public class StrictlyIncreasingOrDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(longestMonotonicSubarray(arr));
    }
    public static int longestMonotonicSubarray(int[] nums) {
        return nums[0];
    }
}
