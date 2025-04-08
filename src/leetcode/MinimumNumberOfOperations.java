package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//https://leetcode.com/problems/minimum-number-of-operations-to-make-elements-in-array-distinct/description/?envType=daily-question&envId=2025-04-08
public class MinimumNumberOfOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minimumOperations(arr));
    }
    public static int minimumOperations(int[] nums) {
        int count = 0;
        while(nums.length > 0) {
            Set<Integer> set = new HashSet<>();
            for (int num: nums) {
                set.add(num);
            }
            if(set.size() == nums.length) {
                break;
            }
            count++;
            if(nums.length < 3) {
                nums = new int[0];
            } else {
                nums = Arrays.copyOfRange(nums, 3, nums.length);
            }

        }
        return count;
    }
}
