package tutort.arrays;

import java.util.Arrays;

/*
https://leetcode.com/problems/wiggle-sort | https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1/ | https://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1/

Given an array, rearrange the elements of array in zigzag fashion.

i/p: 4 3 7 8 6 2 1
o/p: 3 7 4 8 2 6 1

a[0] < a[1] > a[2] < a[3] > a[4] < a[5]

a[0] > a[1] < a[2] > a[3] < a[4] > a[5]
*/
public class ZigZagArray {
    public static void main(String[] args) {// algorithm:: Approach 2 notebook(https://onedrive.live.com/redir?resid=2A3D3FAF1E1EB503%21366&authkey=%21AODN8i4K_hWhZsU&page=View&wd=target%28Array%2FArray%20Class%202.one%7C7f00fcf0-c673-4a4f-ac3d-2103372ff749%2F6.%20ZigZag%20Array%7Cb69f9ff2-db48-734c-a878-d8e124c67cfd%2F%29)
        zigZag(new int[]{4, 3, 7, 8, 6, 2, 1});
    }

    public static void zigZag(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int num = arr[i];
            if (i % 2 == 0) {
                if (num > arr[i + 1]) {
                    swap(arr,i,i+1);
                }
            } else {
                if (num < arr[i + 1]) {
                    swap(arr,i,i+1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));// a[0] < a[1] > a[2] < a[3] > a[4] < a[5]
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
