package tutort.warmup3;

import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:: ");
        int n = scanner.nextInt();
        boolean ugly = isUgly(n);// 14 -> false
        System.out.println(ugly);
    }
    public static boolean isUgly(int n) { // 80 -> 2^4 * 5^1 => true
        if (n < 1) {
            return false;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        while (n % 3 == 0){
            n = n / 3;
        }
        while (n % 5 == 0) {
            n = n / 5;
        }
        return n == 1;
    }
}
