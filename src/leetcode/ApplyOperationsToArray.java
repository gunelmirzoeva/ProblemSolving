package leetcode;

import java.util.Arrays;
import java.util.Scanner;
// https://leetcode.com/problems/apply-operations-to-an-array/description/?envType=daily-question&envId=2025-03-01
public class ApplyOperationsToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(applyOperations(arr)));
    }
    public static int[] applyOperations(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
                i++;
            }
        }
        for (int num : nums) {
            if (num != 0) {
                result[index] = num;
                index++;
            }
        }
        return result;
    }
}
