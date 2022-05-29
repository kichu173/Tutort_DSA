package tutort.PriorityQueue;

import java.util.PriorityQueue;

public class MinimumCostToConnectSticks {// https://leetcode.com/problems/minimum-cost-to-connect-sticks/ | https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1
    public static void main(String[] args) {
        int res = connectSticks(new int[]{2,4,3});
        System.out.println(res);
    }

    private static int connectSticks(int[] sticks) {
        int cost = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int stick : sticks) {
            minHeap.add(stick);
        }
        while (minHeap.size() > 1) {
            int sum = minHeap.remove() + minHeap.remove();
            cost += sum;
            minHeap.add(sum);
        }

        return cost;
    }
}
