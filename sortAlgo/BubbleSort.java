package tutort.sortAlgo;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {// TC: O(n^2)
        for (int i = 1; i < arr.length; i++) {// to maintain a counter
            boolean swapped = false;// to check if already sorted array is provided. (In best case) TC:O(n)
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {10, 5, 26, 3, 15, 22};
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
