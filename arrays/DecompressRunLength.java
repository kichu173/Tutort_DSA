package tutort.arrays;

import java.util.Arrays;

public class DecompressRunLength {// 26/Mar - class solved
    public static void main(String[] args) {// https://leetcode.com/problems/decompress-run-length-encoded-list/
        int[] res = decompressRLElist(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(res));// [2,4,4,4]
    }

    public static int[] decompressRLElist(int[] nums) { // TC: O(n) SC: n
        int totalLength = 0;
        for (int i = 0; i < nums.length; i += 2) {// understand why we use this array to calculate length here:https://leetcode.com/submissions/detail/667410450/, freq always in even position
            totalLength += nums[i];// calculate sum of all freq
        }
        int[] newArr = new int[totalLength];
        int freq = 0;
        int val = 0;
        int pointer = 0;
        for (int i = 0; i < nums.length; i += 2) {
            freq = nums[i];
            val = nums[i + 1];
            for (int j = 0; j < freq; j++) {
                newArr[pointer++] = val;
            }
        }
        return newArr;
    }

    // TODO - Find the Optimal Approach (solve without having new Array, try with same i/p array)
}
