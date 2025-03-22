package leetcode;

import java.util.Scanner;
//https://leetcode.com/problems/delete-characters-to-make-fancy-string/description/?envType=daily-question&envId=2024-11-01
public class DeleteCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(makeFancyString(s));
    }

    public static String makeFancyString(String s) {
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i - 1) == s.charAt(i) && s.charAt(i) == s.charAt(i + 1)) {
                continue;
            }
            else {
                answer.append(s.charAt(i));
            }
        }
        if(s.length() == 1) return s;
        else
            return s.charAt(0) + answer.toString() + s.charAt(s.length() - 1);
    }
}
