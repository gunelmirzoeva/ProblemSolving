package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class FindFirstAndLastPositionOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ansFirst = -1, ansLast = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) {
                ansFirst = mid;
                high = mid - 1;
            }
            else if(nums[mid] > target) {
                high = mid - 1;
            }
            else low = mid + 1;
        }
        low = 0;
        high = nums.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) {
                ansLast = mid;
                low = mid + 1;
            }
            else if(nums[mid] > target) {
                high = mid - 1;
            }
            else low = mid + 1;
        }


        return new int[] {ansFirst, ansLast};
    }
}