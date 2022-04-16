package tutort.sortAlgo;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] res = mergeSort(new int[]{14, 7, 3, 12});
        System.out.println(Arrays.toString(res));
        System.out.println("-------------");
        int[] inp = {14, 7, 3, 12};// 9,4,7,1,6,2,8,4
        mergeSortInPlace(inp, 0, inp.length);
        System.out.println(Arrays.toString(inp));
    }

    private static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));// mid is not inclusive, upto (mid - 1).
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));// upto (arr.length - 1).

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] joined = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                joined[k++] = first[i++];
            } else {
                joined[k++] = second[j++];
            }
        }
        while (i < first.length) {// This executes when there are still elements in first[], adding remaining elements to joined[]
            joined[k++] = first[i++];
        }
        while (j < second.length) {// This executes when there are still elements in second[], adding remaining elements to joined[]
            joined[k++] = second[j++];
        }
        return joined;
    }

    private static void mergeSortInPlace(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);// end is not inclusive, upto (end - 1).

        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] joined = new int[end - start];
        int i = start, j = mid, k = 0;

        while(i < mid && j < end) {
            if (arr[i] < arr[j]) {
                joined[k++] = arr[i++];
            } else {
                joined[k++] = arr[j++];
            }
        }

        while (i < mid) {
            joined[k++] = arr[i++];
        }
        while (j < end) {
            joined[k++] = arr[j++];
        }

        for (k = 0; k < joined.length; k++) {
            arr[start + k] = joined[k];
        }
    }
}
