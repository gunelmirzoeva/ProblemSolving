package leetcode;
//https://leetcode.com/problems/remove-all-occurrences-of-a-substring/description/?envType=daily-question&envId=2025-02-11

import java.util.Scanner;

public class RemoveAllOccurrences {
    public static String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String part = sc.nextLine();
        System.out.println(removeOccurrences(s, part));
    }
}

