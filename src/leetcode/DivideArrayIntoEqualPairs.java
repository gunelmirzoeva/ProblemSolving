package leetcode;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/divide-array-into-equal-pairs/description/?envType=daily-question&envId=2025-03-17
public class DivideArrayIntoEqualPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(divideArray(arr));
    }
    public static boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=2) {
            if(nums[i] != nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
