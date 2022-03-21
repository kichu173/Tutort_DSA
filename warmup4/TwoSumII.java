package tutort.warmup4;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
        int[] arr = {-1, 0};// 2,3,4 | 2,7,11,15 | -1,0
        int target = -1;// 6 | 9 | -1
        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));

        int[] result1 = twoSumOptimal(arr, target);
        System.out.println(Arrays.toString(result1));
    }

    public static int[] twoSum(int[] nums, int target) {// brut force TC:O(n^2)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i + 1, j + 1};// (1-index based)
                }
            }
        }
        return new int[]{};
    }

    //algorithm: https://www.youtube.com/watch?v=cQ1Oz4ckceM
    public static int[] twoSumOptimal(int[] nums, int target) {// TC: O(n) | two pointers approach(i/p array is sorted)
        int p1 = 0;// assign indices to pointer(start)
        int p2 = nums.length - 1;// end
        while (p1 < p2) {
            int curSum = nums[p1] + nums[p2];
            if (curSum > target) {
                p2--;
            } else if (curSum < target) {
                p1++;
            } else {
                return new int[]{p1 + 1, p2 + 1};
            }
        }
        return new int[]{};
    }
}
