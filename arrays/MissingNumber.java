package tutort.arrays;

public class MissingNumber {// 26/Mar - class Solved

    public static void main(String[] args) {// https://leetcode.com/problems/missing-number/
        int res = missingNumber(new int[]{3, 0, 1});
        System.out.println(res);// 2
    }

    public static int missingNumber(int[] nums) {// TC: O(n^2) SC: O(1)
        int size = nums.length;
        boolean isFound;
        for (int i = 0; i <= size; i++) {
            isFound = false;
            for (int j = 0; j < size; j++) {
                if (nums[j] == i) {
                    isFound = true;
                }
            }
            if (!isFound) {
                return i;
            }
        }
        return -1;
    }
}
