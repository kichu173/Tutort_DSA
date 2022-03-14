package tutort.arrays;

import java.util.*;

/*
13/01/22 -- Arrays

given an array replace every element by greater element on right side
(not including the current element)

I/p: 16 17 4 3 5 2
O/P: 17 5  5 5 2 -1

I/p: 6 2 4 5 3 1
O/P: 5 5 5 3 1 -1
*/

public class RightMax {// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/

    public static void main(String[] args) {
        int[] res = replaceWithLarger(new int[]{1});// ip:16, 17, 4, 3, 5, 2 | 6, 2, 4, 5, 3, 1
        System.out.println(Arrays.toString(res));
        int[] res1 = replaceWithLargerOptimal(new int[]{16, 17, 4, 3, 5, 2});
        System.out.println(Arrays.toString(res1));
    }

    public static int[] replaceWithLarger(int[] arr) {// T.C::O(n^2), S.C::1(since we are not taking extra space(new array) to store result, if we take new array to store result elements then space complexity is 'n').
        int n = arr.length - 1;
        if (arr.length == 1) {
            arr[n] = -1;
            return arr;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            if (i == n) {
                arr[n] = -1;
                return arr;
            }
            for (int j = i + 1; j <= n; j++) {
                if (arr[j] > max) {
                    arr[i] = arr[j];
                    max = arr[j];
                }
            }
            max = Integer.MIN_VALUE;
        }
        return arr;
    }

    public static int[] replaceWithLargerOptimal(int[] arr) {// T.C::O(n), S.C::1
        int n = arr.length;
        int temp = arr[n - 1];
        arr[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            int curr = arr[i];
            if (arr[i + 1] > temp) {
                arr[i] = arr[i + 1];
            } else {
                arr[i] =temp;
            }
            temp = curr;
        }
        return arr;
    }
}