package tutort.arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {// 26/Mar - class assignment

    public static void main(String[] args) {// https://leetcode.com/problems/single-number/
        int res = singleNumber(new int[]{1});// 2,2,1 | 4, 1, 2, 1, 2 | 1
        System.out.println(res);// 1 | 4 | 1
        System.out.println("-------------------------");
        int res1 = singleNumber_approach1(new int[]{2, 2, 1});// 2,2,1 | 4, 1, 2, 1, 2 | 1
        System.out.println(res1);// 1 | 4 | 1
        System.out.println("-------------------------");
        int res2 = singleNumber_approach2(new int[]{2, 2, 1});// 2,2,1 | 4, 1, 2, 1, 2 | 1
        System.out.println(res2);// 1 | 4 | 1
    }

    /* You must implement a solution with a linear runtime complexity and use only constant extra space. */

    public static int singleNumber(int[] nums) {// Brut Force TC: O(n^2) SC: 1
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }
            count = 0;
        }
        return -1;
    }

    public static int singleNumber_approach1(int[] nums) {// TC: O(n) SC: n
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> num : map.entrySet()) {
            Integer value = num.getValue();
            Integer key = num.getKey();
            if (value == 1) {
                return key;
            }
        }
        return -1;
    }

    //Optimal
    public static int singleNumber_approach2(int[] nums) {// TC: O(n) SC: 1 | algo:https://www.youtube.com/watch?v=krgK0UlfNYY (2:35)
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
