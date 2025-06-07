package leetcode;

// https://leetcode.com/problems/intersection-of-two-arrays/?envType=problem-list-v2&envId=array
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums1 = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int [] nums2 = new int[m];
        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(intersection(nums1, nums2)));

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        return intersectionSet.stream().mapToInt(Integer::intValue).toArray();
    }

}
