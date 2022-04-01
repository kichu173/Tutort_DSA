package tutort.arrays;

public class MaxConsecutiveOnesII {
    public static void main(String[] args) {// https://onedrive.live.com/redir?resid=2A3D3FAF1E1EB503%21366&authkey=%21AODN8i4K_hWhZsU&page=View&wd=target%28Array%2FArray%20Class%206.one%7C80f75854-9771-9249-b243-6357122cb51f%2F21.%20Max%20Consecutive%20Ones%20-II%7C8d98aefa-aa2e-9b45-9e73-955c9a993d7f%2F%29
        int res = findMaxConsecutiveOnesII(new int[]{1, 0, 1, 1, 0});//0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1 | 1,0,1,1,0
        System.out.println(res);// 5 | 4
        int res1 = findMaxConsecutiveOnesIIUsingSlidingWindow(new int[]{0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1});
        System.out.println(res1);
    }

    public static int findMaxConsecutiveOnesII(int[] nums) {// brute force TC: O(n) SC: n | (2:09:06) - array class 6
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }
        int[] newArr = new int[count + 2];
        newArr[0] = -1;
        newArr[newArr.length - 1] = nums.length;
        count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                newArr[count++] = i;
            }
        }
        for (int i = 1; i < newArr.length - 1; i++) {
            int lb = newArr[i - 1];
            int rb = newArr[i + 1];
            max = Math.max(max, (rb - lb - 1));
        }
        return max;
    }

    public static int findMaxConsecutiveOnesIIUsingSlidingWindow(int[] nums) {// Sliding Window approach TC: O(n) SC: n | algo:https://www.youtube.com/watch?v=OaMbeeSSv7Y
        int start = 0, max = 0;
        int k = 1; // Represent we can flip at most one 0
        int zeroCount = 0;
        for (int end = 0; end < nums.length; end++) {
            int num = nums[end];
            if (num == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (nums[start] == 0) {
                    zeroCount--;
                }
                start++;
            }
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}
