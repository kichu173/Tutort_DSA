package tutort.warmup2;

import java.util.Arrays;

public class MoveZeroes { // https://leetcode.com/problems/move-zeroes/
    public static void main(String[] args) {
        // algorithm -> https://www.youtube.com/watch?v=PNJoyRaIW7U
        int[] arr = {0, 1, 0, 3, 12};
        if (arr.length == 1) {
            System.out.println(arr[0]);
        } else {
            int left = 0;
            int right = 0;
            while (right < arr.length) {
                if (arr[right] == 0) {
                    ++right;
                } else {
                    swap(arr, right, left);
                    ++right;
                    ++left;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
