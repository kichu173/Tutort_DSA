package tutort.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {// Kth smallest element in unsorted array
    public static void main(String[] args) {
        int res = findKthLargestMaxHeap(new int[]{3, 2, 1, 5, 6, 4}, 2);
        System.out.println(res);
    }

    private static int findKthLargestMaxHeap(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int el: nums) {
            maxHeap.add(el);
            if(maxHeap.size() > k) {
                maxHeap.remove();
            }
        }
        return maxHeap.remove();
    }
}
