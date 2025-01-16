package eolymp;
//https://basecamp.eolymp.com/en/problems/20
import java.util.Scanner;

public class HowManyTimesToRepeat {
    public static int sum(int n) {
        int sum = 0;
        while (n != 0) {
            int s = n % 10;
            sum += s;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while (n > 0) {
            int numSum = sum(n);
            n = n - numSum;
            count++;
        }
        System.out.print(count);
    }
}