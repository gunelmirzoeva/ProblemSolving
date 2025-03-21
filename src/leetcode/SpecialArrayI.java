package leetcode;

import java.util.Scanner;

public class SpecialArrayI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isArraySpecial(arr));
    }
    public static boolean isArraySpecial(int[] nums) {
        if (nums.length == 1) return true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0) {

                return false;
            }
            if( nums[i] % 2 == 0 && nums[i + 1] % 2 == 0) return false;
        }
        return true;
    }

}
