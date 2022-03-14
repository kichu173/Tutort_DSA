package tutort.warmup2;

public class MajorityElement {// https://leetcode.com/problems/majority-element/

/*    Given an array with maximum two different elements ,such that to find the majority element.

    Sort the given array so that the largest element will be present at the mid position , as their is only two unique elements.

    hence by returning the mid element we get the maximum presented element present in the array nums[].*/

    /*int[] arr = {3, 2, 3};//{2,2,1,1,1,2,2}
    Arrays.sort(arr);
    System.out.println(sortedArr[sortedArr.length / 2]);*/

    public static void main(String[] args) {
        int[] arr = {3, 2, 3};//{2,2,1,1,1,2,2}
        // Moore voting algorithm (https://www.youtube.com/watch?v=AoX3BPWNnoE)
        int element = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                element = arr[i];
            }
            if (element == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(element);
    }
}
