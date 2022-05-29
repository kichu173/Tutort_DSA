package tutort.PriorityQueue;

import java.util.PriorityQueue;

public class KthLargestElementStream {// https://leetcode.com/problems/kth-largest-element-in-a-stream/

    private final PriorityQueue<Integer> minHeap;
    private final int k;

    public KthLargestElementStream(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();
        for(int el : nums) {
            add(el);
        }
    }

    public int add(int val) {
        minHeap.add(val);
        if (minHeap.size() > k) {
            minHeap.remove();
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {// https://www.youtube.com/watch?v=eMimpcEaEIo&ab_channel=CodingDecoded
        KthLargestElementStream obj = new KthLargestElementStream(3, new int[]{4,5,8,2});
        int param_1 = obj.add(3);
        System.out.println(param_1);
        int param_2 = obj.add(5);
        System.out.println(param_2);
        int param_3 = obj.add(10);
        System.out.println(param_3);
        int param_4 = obj.add(9);
        System.out.println(param_4);
        int param_5 = obj.add(4);
        System.out.println(param_5);
    }
}
