package tutort.warmup3;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {// https://leetcode.com/problems/happy-number/

    public static void main(String[] args) {// https://www.youtube.com/watch?v=Egw03gI-Tf0 -> algorithm
        boolean happyNumRes = isHappy(29);// 29 - false | 19 - true | 2 - false
        System.out.println(happyNumRes);
    }

    public static boolean isHappy(int n) {
        Set<Integer> mySet = new HashSet<>();
        while (n > 0) {
            mySet.add(n);
            int a = n;
            int rem = 0;
            int sum = 0;
            while (a != 0) {
                rem = a % 10;
                sum = sum + (rem * rem);
                a = a / 10;
            }
            if (sum == 1) {
                return true;
            } else if (mySet.contains(sum)) {
                return false;
            }
            n = sum;
        }
        return false;
    }
}
