package tutort.sortAlgo;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {// TC: O(n^2) | Best case : O(n)
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3, 9};
        InsertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
