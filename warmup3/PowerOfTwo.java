package tutort.warmup3;

import java.util.Scanner;

public class PowerOfTwo {// https://leetcode.com/problems/power-of-two/
    // https://www.youtube.com/watch?v=fQJ5iWfsqjw -> bitwise and shift operators
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:: ");
        int n = sc.nextInt();
        boolean result = isPowerOfTwo(n);
        System.out.println("Power of two for given " + n + " is " + result);
    }

    public static boolean isPowerOfTwo(int n) {
//        while (n % 2 == 0) {
//            n = n / 2;
//        }
//        return (n == 1);
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return (count==1);
    }
}
