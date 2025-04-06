package leetcode;

import java.util.Arrays;
import java.util.Scanner;

// https://leetcode.com/problems/keyboard-row/description/?envType=problem-list-v2&envId=hash-table

public class KeyboardRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        System.out.println(Arrays.toString(findWords(words)));
    }

    public static String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        String[] result = new String[words.length];
        int k = 0;

        for (String word : words) {
            String lowercaseWord = word.toLowerCase();


            if (isFromSingleRow(lowercaseWord, firstRow)||
                isFromSingleRow(lowercaseWord, secondRow)||
                isFromSingleRow(lowercaseWord, thirdRow)) {
                result[k++] = word;
            }
        }

        return Arrays.copyOf(result, k);
    }

    private static boolean isFromSingleRow(String word, String row) {
        for (char c : word.toCharArray()) {
            if (!row.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
}
