package tutort.arrays;

import java.util.Arrays;
/*
given an array replace every element by greater element on left side
(not including the element)

I/p: 16 17 4  3  5  2
O/P: -1 16 17 17 17 17



I/p: 6  2 4 5 3 1
O/P: -1 6 6 6 6 6
*/
public class LeftMax {
    public static void main(String[] args) {
        int[] leftRes = leftMaxOptimal(new int[]{16, 17, 4, 3, 5, 2});
        System.out.println(Arrays.toString(leftRes));
    }

    public static int[] leftMaxOptimal(int[] arr) {// T.C::O(n), S.C::1
        int n = arr.length;
        int temp = arr[0];
        arr[0] = -1;
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            if (arr[i - 1] > temp) {
                arr[i] = arr[i - 1];
            } else {
                arr[i] = temp;
            }
            temp = curr;
        }
        return arr;
    }
}
