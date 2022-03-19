package tutort.arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumOfCandies {// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
    public static void main(String[] args) {
        List<Boolean> booleans = kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        System.out.println(booleans);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {// TC:O(n)
        List<Boolean> list = new ArrayList<>();
        int temp = 0;
        Boolean isMax = false;
        int max = Integer.MIN_VALUE;
        for (int i : candies) {
            max = Math.max(max, i);
        }
        for (int i = 0; i < candies.length; i++) {
            temp = candies[i] + extraCandies;
            if (temp >= max) {
                list.add(!isMax);
            } else {
                list.add(isMax);
            }
            temp = 0;
        }
        return list;
    }
}
