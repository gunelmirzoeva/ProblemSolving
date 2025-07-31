package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//https://leetcode.com/problems/find-all-lonely-numbers-in-the-array/description/
public class FindAllLonelyNumbersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(findLonely(nums));
    }
    public static List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        List<Integer> lonelyNumbers = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            boolean isLonely = true;

            if (i > 0 && (nums[i] == nums[i - 1] || nums[i] - 1 == nums[i - 1])) {
                isLonely = false;
            }

            if (i < nums.length - 1 && (nums[i] == nums[i + 1] || nums[i] + 1 == nums[i + 1])) {
                isLonely = false;
            }

            if (isLonely) {
                lonelyNumbers.add(nums[i]);
            }
        }

        return lonelyNumbers;
    }

}
