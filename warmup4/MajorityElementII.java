package tutort.warmup4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public static void main(String[] args) {// https://leetcode.com/problems/majority-element-ii/
        List<Integer> list = majorityElement(new int[]{2,2});//3,2,3 | 1 | 1,2
        System.out.println(list);// 3 | 1 | 1,2
    }

    public static List<Integer> majorityElement(int[] nums) {// Brut Force TC:O(N) SC: O(N)
        int m = nums.length / 3;
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> num : map.entrySet()) {// https://www.tutorialcup.com/leetcode-solutions/majority-element-ii-leetcode-solution.htm
            Integer value = num.getValue();
            Integer key = num.getKey();
            if (value > m) {
                res.add(key);
            }
        }
        return res;
    }

    // TODO - Find the Optimal Approach(Could you solve the problem in linear time and in O(1) space?)
}
