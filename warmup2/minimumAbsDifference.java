package tutort.warmup2;

import java.util.ArrayList;
import java.util.List;

public class minimumAbsDifference { // https://leetcode.com/problems/minimum-absolute-difference/solution/
    public static void main(String[] args) {// discussed on 25th march doubt session
        int[] arr = {4, 2, 1, 3};
        int[] sortedArr = sort(arr);
        List<List<Integer>> list = minDifference(sortedArr);
        System.out.println(list);
    }

    private static List<List<Integer>> minDifference(int[] sortedArr) {
        List<List<Integer>> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < sortedArr.length; i++) {
            min = Math.min(min, sortedArr[i] - sortedArr[i - 1]);
        }

        for (int i = 1; i < sortedArr.length; i++) {
            int diff = sortedArr[i] - sortedArr[i - 1];
            if (diff == min) {
                List<Integer> pair = new ArrayList<>();
                pair.add(sortedArr[i - 1]);
                pair.add(sortedArr[i]);
                list.add(pair);
            }
        }
        return list;
    }

    private static int[] sort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
