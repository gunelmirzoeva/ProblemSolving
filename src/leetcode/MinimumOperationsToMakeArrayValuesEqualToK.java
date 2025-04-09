package leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//https://leetcode.com/problems/minimum-operations-to-make-array-values-equal-to-k/description/?envType=daily-question&envId=2025-04-09
public class MinimumOperationsToMakeArrayValuesEqualToK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(minOperations(arr, k));
    }
    public static int minOperations(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums) {
            if(num < k) {
                return -1;
            }
            if(num > k) {
                set.add(num);
            }
        }
        return set.size();
    }
}
