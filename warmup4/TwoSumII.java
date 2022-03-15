package tutort.warmup4;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
        int[] arr = {-1, 0};// 2,3,4 | 2,7,11,15 | -1,0
        int target = -1;// 6 | 9 | -1
        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{};
    }
}
