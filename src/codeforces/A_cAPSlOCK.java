package codeforces;
import java.util.Scanner;
public class A_cAPSlOCK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String c = "";
        for (int i = 1; i < a.length(); i++) {
            c += a.charAt(i);
        }
        String b = a.toUpperCase();
        String d = "";
        String e = "";
        for (int i = 1; i < b.length(); i++) {
            d += b.charAt(i);
        }
        if (a.equals(b) || c.equals(d)) {
            for (int i = 0; i < a.length(); i++){
                if(Character.isUpperCase(a.charAt(i))){
                    e += Character.toLowerCase(a.charAt(i));
                }
                else if(Character.isLowerCase(a.charAt(i))){
                    e += Character.toUpperCase(a.charAt(i));
                }
            }
            System.out.println(e);
        }
        else {
            System.out.println(a);
        }
    }
}

