package tutort.arrays;

public class MaxConsecutiveOnes {//https://leetcode.com/problems/max-consecutive-ones/

    public static void main(String[] args) {
        int res = findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1});//1, 1, 0, 1, 1, 1 | 1,0,1,1,0,1
        System.out.println(res);// 3 | 2
    }

    public static int findMaxConsecutiveOnes(int[] nums) {// Brute force TC: O(n)
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                count++;
                max = Math.max(max, count);
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return max;
    }

    public static int findMaxConsecutiveOnesUsingSlidingWindow(int[] nums) {// Using sliding window
        //TODO
        return -1;
    }
}
