package tutort.warmup2;

import java.util.Arrays;

public class RunningSum { // https://leetcode.com/problems/running-sum-of-1d-array/
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = runningSum(nums);
        System.out.println(Arrays.toString(res));
    }

    static int[] runningSum(int[] nums) {
        int temp = 0;
        int sums[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp = temp + nums[i];
            sums[i] = temp;
        }
        return sums;
    }
}
