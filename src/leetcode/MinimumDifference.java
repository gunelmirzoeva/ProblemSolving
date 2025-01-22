package leetcode;
import java.util.Arrays;
// https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/description/
public class MinimumDifference {
    public int minDifference(int[] nums) {
        if(nums.length <= 3) return 0;
        else {
            Arrays.sort(nums);
            int[] nums1 = Arrays.copyOfRange(nums, 3, nums.length);
            int[] nums2 = Arrays.copyOfRange(nums, 0, nums.length - 3);
            int num1Difference = nums1[nums1.length - 1] - nums1[0];
            int num2Difference = nums2[nums2.length - 1] - nums2[0];
            return Math.min(num1Difference, num2Difference);
        }

    }

    public static void main(String[] args) {
        MinimumDifference md = new MinimumDifference();
        System.out.println(md.minDifference(new int[]{3,100,20}));
    }
}
