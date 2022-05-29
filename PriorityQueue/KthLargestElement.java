package tutort.PriorityQueue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Collections;

public class KthLargestElement {// https://leetcode.com/problems/kth-largest-element-in-an-array/
    public static void main(String[] args) {
        int res = findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
        System.out.println(res);
        System.out.println("------------");
        int res1 = findKthLargestMinHeap(new int[]{3, 2, 1, 5, 6, 4}, 2);
        System.out.println(res1);
    }

    //Using max heap
    public static int findKthLargest(int[] nums, int k) {// TC: O(Klogn)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int result = 0;
        for (int i : nums) {
            maxHeap.add(i);
        }

        while (k > 0) {
            result = maxHeap.poll();
            k--;
        }

        return result;
    }

    public static int findKthLargestSort(int[] nums, int k) {
        Arrays.sort(nums);
        int res = 0;
        res = nums.length - k;
        return nums[res];
    }

    //Using MinHeap
    public static int findKthLargestMinHeap(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int el : nums) {
            minHeap.add(el);
            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }
}

