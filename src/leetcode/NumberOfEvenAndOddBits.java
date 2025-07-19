package leetcode;

import java.util.Arrays;
import java.util.Scanner;
//https://leetcode.com/problems/number-of-even-and-odd-bits/description/
public class NumberOfEvenAndOddBits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Arrays.toString(evenOddBit(n)));
    }
    public static int[] evenOddBit(int n) {
        //decimal to binary
        String binary = Integer.toBinaryString(n);

        int even = 0, odd = 0;
        for (int j = binary.length() - 1; j >= 0; j--) {
            int position = binary.length() - 1 - j;
            if(binary.charAt(j) == '1') {
                if(position % 2 == 0) even++;
                else odd++;
            }
        }
        return new int[]{even, odd};
    }
}
