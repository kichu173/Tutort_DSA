package tutort.sortAlgo;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr, boolean isAscending) {// (worst or best case) TC:: O(n^2)
        if(isAscending) {
            for (int i = 0; i < arr.length; i++) {// fix the position
                int minIndex = i;
                for (int j = i + 1; j < arr.length; j++) {// select the min value
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                // swap
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                int maxIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > arr[maxIndex]) {
                        maxIndex = j;
                    }
                }
                // swap
                int temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
        }

    }


    public static void main(String[] args) {
        int[] arr = {10, 5, 26, 3, 15, 22};
        boolean asc = false;
        SelectionSort.selectionSort(arr, asc);
        System.out.println(Arrays.toString(arr));
    }
}
