package leetcode;

import java.util.Arrays;
import java.util.Scanner;
//https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i/description/?envType=daily-question&envId=2025-03-19
public class MakeBinaryArrayElementsEqualOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minOperations(arr));

    }
    public static int minOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] == 0) {
                if(n - i > 2) {
                    nums[i] = 1;
                    nums[i+1] = (nums[i+1] == 0) ? 1 : 0;
                    nums[i+2] = (nums[i+2] == 0) ? 1 : 0;
                    count++;
                }
            }
        }
        boolean containsZero = Arrays.stream(nums).anyMatch(num -> num == 0);
        if(!containsZero) {
            return count;
        } else {
            return -1;
        }
    }
}
