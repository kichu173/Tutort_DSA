package tutort.arrays;

import java.util.*;

public class ProductArrayExceptItself {// https://leetcode.com/problems/product-of-array-except-self/

    public static void main(String[] args) {
        int[] ints = productExceptSelf(new int[]{-1, 1, 0, -3, 3});// -1,1,0,-3,3 | 1, 2, 3, 4
        System.out.println(Arrays.toString(ints));
        int[] ints1 = productExceptSelfOptimal(new int[]{4, 1, 5, 3, 2});// -1,1,0,-3,3 | 1, 2, 3, 4
        System.out.println(Arrays.toString(ints1));
    }

    public static int[] productExceptSelf(int[] nums) {//BrutForce approach-TC:O(n^2),SC:n
        int[] newArr = new int[nums.length];
        int temp = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    temp = temp * nums[j];
                }
            }
            newArr[i] = temp;
            temp = 1;
        }
        return newArr;
    }

    public static int[] productExceptSelfOptimal(int[] nums) {//TC: O(3n)->O(n),SC:3n
        int[] lhs = new int[nums.length];
        int[] rhs = new int[nums.length];
        lhs[0] = 1;
        rhs[nums.length - 1] = 1;
        int[] res = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            lhs[i] = lhs[i - 1] * nums[i - 1];
        }
        for (int i = nums.length - 2; i >= 0;i--) {
            rhs[i] = rhs[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = lhs[i] * rhs[i];
        }
        return res;
    }
}
