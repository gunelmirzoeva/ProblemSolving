package leetcode;

import java.util.HashMap;
import java.util.Scanner;

//https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/description/
public class MaxSumOfPair {
    public static int maximumSum(int[] nums) {
        int maxValue = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int digitSum = calculateDigitSum(num);
            if(map.containsKey(digitSum)){
                maxValue = Math.max(maxValue, map.get(digitSum) + num);
                map.put(digitSum, Math.max(map.get(digitSum), num));
            } else {
                map.put(digitSum, num);
            }
        }
        return maxValue;
    }
    private static int calculateDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(maximumSum(nums));
    }
}