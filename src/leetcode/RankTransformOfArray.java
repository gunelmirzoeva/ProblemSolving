package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class RankTransformOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    public static int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        HashMap<Integer, Integer> rankMap= new HashMap<>();
        int rank = 1;
        for (int num : sorted) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }
        return result;
    }
}
