package tutort.arrays;

import java.util.Arrays;

/*
Given an array of integers, update every element with multiplication of previous and next elements with following exceptions.

a) First element is replaced by multiplication of first and second.

b) Last element is replaced by multiplication of last and second last.

Input: arr[] = {2, 3, 4, 5, 6}
Output: arr[] = {6, 8, 15, 24, 30}

// We get the above output using following
// arr[] = {2*3, 2*4, 3*5, 4*6, 5*6}

i/p: [1,2]
o/p: [2,2]

i/p: [1]
o/p: [1]

i/p: []
o/p: []
*/

public class ProductArrayOptimal {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        int n = arr.length;
        modify(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void modify(int[] arr, int n) {// TC:O(n) SC: 1
        // Nothing to do when array size is 1
        if (n <= 1)
            return;

        // store current value of arr[0] and update it
        int prev = arr[0];
        arr[0] = arr[0] * arr[1];

        // Update rest of the array elements
        for (int i = 1; i < n - 1; i++) {
            // Store current value of next interaction
            int curr = arr[i];

            // Update current value using previous value
            arr[i] = prev * arr[i + 1];

            // Update previous value
            prev = curr;
        }

        // Update last array element
        arr[n - 1] = prev * arr[n - 1];
    }
}
//Input: arr[] = {2, 3, 4, 5, 6}
//Output: arr[] = {6, 8, 15, 24, 30}
// arr[] = {2*3, 2*4, 3*5, 4*6, 5*6}
