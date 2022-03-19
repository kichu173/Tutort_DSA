package tutort.arrays;

import java.util.Arrays;
/*
19/03/2022 - classroom
*/
public class BuildArrayFromPermutation {// https://leetcode.com/problems/build-array-from-permutation/

    public static void main(String[] args) {
        int[] res = buildArray(new int[]{0, 2, 1, 5, 3, 4});// 5,0,1,2,3,4
    }

    private static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        System.out.println(Arrays.toString(ans));
        return ans;
    }

    private static int[] buildArrayOptimal(int[] nums) {
        // find the optimal way (Follow-up: Can you solve it without using an extra space (i.e., O(1) memory)?)
        return new int[]{};
    }
}
