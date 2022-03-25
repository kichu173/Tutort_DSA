package tutort.warmup2;

import java.util.HashMap;
import java.util.Map;

public class MajorityElBrutForce {// https://leetcode.com/problems/majority-element/
    public static void main(String[] args) {
        int res = majorityElement(new int[]{7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5});
        System.out.println(res);
        System.out.println("-----------------------");
        int res1 = majorityElementUsingMap(new int[]{7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5});
        System.out.println("Using Hashmap technique:: " + res1);
    }

    public static int majorityElement(int[] arr) {// O(n^2)
        int floor = arr.length / 2;
        int count = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    res = arr[i];
                }
            }
            if (count > floor) {
                return res;
            } else {
                count = 0;
                res = 0;
            }
        }
        return -1;
    }

    public static int majorityElementUsingMap(int[] arr) {// O(n)
        int m = arr.length / 2;
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        for (int n : arr) {
            int e = map.get(n);
            if (e > m) {
                return n;
            }
        }

        return -1;
    }
}
