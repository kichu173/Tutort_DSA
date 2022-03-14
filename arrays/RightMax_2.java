package tutort.arrays;
/*
13/01/22 -- Arrays

given an array replace every element by greater element on right side
(**including** the current element)

I/p: 16 17 4 3 5 2
O/P: 17 17  5 5 5 2

I/p: 6 2 4 5 3 1
O/P: 6 5 5 5 3 1
*/

import java.util.Arrays;

public class RightMax_2 {
    public static void main(String[] args) {
        int[] res = replaceWithLarger2(new int[]{6, 2, 4, 5, 3, 1});//16, 17, 4, 3, 5, 2 | 6, 2, 4, 5, 3, 1
        System.out.println(Arrays.toString(res));
    }

    public static int[] replaceWithLarger2(int[] arr) {
        int n = arr.length;
        arr[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i];
            } else {
                arr[i] = arr[i + 1];
            }
        }
        return arr;
    }
}
