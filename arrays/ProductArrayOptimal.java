package tutort.arrays;

import java.util.Arrays;

public class ProductArrayOptimal {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        int n = arr.length;
        modify(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void modify(int[] arr, int n) {// O(n)
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
