package tutort.arrays;

public class MaxConsecutiveOnes {//https://leetcode.com/problems/max-consecutive-ones/

    public static void main(String[] args) {
        int res = findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1});//1, 1, 0, 1, 1, 1 | 1,0,1,1,0,1
        System.out.println(res);// 3 | 2
        System.out.println("-----------");
//        int res1 = findMaxConsecutiveOnesUsingSlidingWindow(new int[]{1, 0, 1, 1, 0, 1});
//        System.out.println(res1);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {// TC: O(n)
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max, count);
        }
        return max;
    }

//    public static int findMaxConsecutiveOnesUsingSlidingWindow(int[] nums) {// Sliding window approach
//        int start = 0, max = 0;
//        for (int end = 0; end < nums.length; end++) {
//            int num = nums[end];
//            max = Math.max(max, end - start);
//            if (num == 0) {
//                start = end;
//            }
//        }
//        return max;
//    }
}
