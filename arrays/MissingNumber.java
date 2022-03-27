package tutort.arrays;

import java.util.Arrays;

public class MissingNumber {// 26/Mar - class Solved

    public static void main(String[] args) {// https://leetcode.com/problems/missing-number/
        int res = missingNumber(new int[]{0, 1});
        System.out.println(res);// 2
        int res1 = missingNumberUsingSort(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
        System.out.println(res1);// 8
        int res2 = missingNumber_sum(new int[]{3, 0, 1});
        System.out.println(res2);// 2
        int res3 = missingNumber_xor(new int[]{3, 0, 1});
        System.out.println(res3);// 2
    }

    public static int missingNumber(int[] nums) {// TC: O(n^2) SC: 1 Brute Force
        int size = nums.length;
        boolean isFound;
        for (int i = 0; i <= size; i++) {// calculate the range
            isFound = false;
            for (int j = 0; j < size; j++) {// check whether every element in range is in i/p array
                if (nums[j] == i) {
                    isFound = true;
                }
            }
            if (isFound == false) {
                return i;
            }
        }
        return -1;
    }

    public static int missingNumberUsingSort(int[] nums) {// TC: O(nlogn) SC: 1 (Better than brute force)
        Arrays.sort(nums);// Best sorting is merge sort or quick sort to get above Time Complexity - O(nlogn)
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

    public static int missingNumber_sum(int[] nums) {// TC: O(n) SC: 1 - Using Summation | disadvantage: data type overflow error(if sum value goes too large)
        int len = nums.length;
        int sum = len * (len + 1) / 2;// sum of all elements in range/ Sum of first n natural numbers (if you dnt know this formula simply loop and add numbers)
        int arraySum = 0;
        for (int x : nums) {
            arraySum += x;
        }
        return sum - arraySum;
    }

    public static int missingNumber_xor(int[] nums) {//TC: O(n) SC: 1 class-(1:28:00)
        int x = 0, y = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {// XOR(^) for all elements in i/p array
            x ^= nums[i];
        }

        for (int i = 0; i <= len; i++) {// XOR(^) for all elements in range
            y ^= i;
        }

        return x ^ y;
    }
}
