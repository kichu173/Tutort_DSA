package tutort.warmup4;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {//https://leetcode.com/problems/two-sum/
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
        int[] result1 = twoSumOptimal(new int[] {2,11, 15, 7}, target);
        System.out.println(Arrays.toString(result1));
    }

    public static int[] twoSum(int[] nums, int target) {// TC: O(n^2) Brut force
        for (int i=0; i < nums.length;i++) {
            for (int j=i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {};
    }

    public static int[] twoSumOptimal(int[] nums, int target) {// TC: O(n), SC:n Using Hashmap which is good to use for searching or lookup which happens in O(1)
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {// target - arr[i] is present in HM or not?
            Integer diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] {map.get(diff)+1, i + 1};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
