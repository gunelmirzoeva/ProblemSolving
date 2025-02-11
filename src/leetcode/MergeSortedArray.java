package leetcode;
import java.util.Arrays;
import java.util.Scanner;

//88. Merge Sorted Array
public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int n = sc.nextInt();
        int[] nums1 = new int[m + n];
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        sc.close();
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}
