package tutort.arrays;

import java.util.Arrays;

public class ConcatenationOfArray {// class solved - 27/Mar
    public static void main(String[] args) {// https://leetcode.com/problems/concatenation-of-array/
        int[] res = getConcatenation(new int[]{1, 2, 1});
        System.out.println(Arrays.toString(res));
    }

    public static int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length * 2];
        for (int i = 0; i < length; i++) {
            ans[i] = nums[i];
            ans[i + length] = nums[i];
        }
        return ans;
    }
}
