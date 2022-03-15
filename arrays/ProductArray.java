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
public class ProductArray {// Replace every array element by multiplication of previous and next. TC:O(n),SC:n
    public static void main(String[] args) {// https://www.youtube.com/watch?v=m5BTYfZGLd0
        int[] arr = {2, 3, 4, 5, 6};
        if (arr.length == 1) {
            System.out.println(Arrays.toString(arr));
        }
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(i == 0) {
                newArr[i] = (arr[i] * arr[i + 1]);
            } else if (i != arr.length -1) {
                newArr[i] = (arr[i -1] * arr[i + 1]);
            } else {
                newArr[i] = arr[i -1] * arr[i];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
