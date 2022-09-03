package tutort.arrays;

public class TrappingRainWater {// https://leetcode.com/problems/trapping-rain-water/

    public static void main(String[] args) {
        int trap = trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});// ip: 4,2,0,3,2,5
        System.out.println(trap);// op: 6 | 9
        System.out.println("----------");
        int trap1 = trapBrut(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});// ip: 4,2,0,3,2,5
        System.out.println(trap1);// op: 6 | 9
    }

    public static int trapBrut(int[] height) {// TC: O(n^2) SC: 2n
        int[] leftBoundary = new int[height.length];
        int[] rightBoundary = new int[height.length];
        // calculate the left tallest for every element including current element
        int temp = 0;
        int max;
        for (int i = 0; i < height.length; i++) {
            max  = Integer.MIN_VALUE;
            for (int j = temp; j >= 0; j--) {
                if (height[j] > max) {
                    max = height[j];
                }
            }
            leftBoundary[i] = max;
            temp++;
        }
        // calculate the right tallest for every element including current element
        temp = 0;
        for (int i = 0; i < height.length; i++) {
            max  = Integer.MIN_VALUE;
            for (int j = temp; j < height.length; j++) {
                if (height[j] > max) {
                    max = height[j];
                }
            }
            rightBoundary[i] = max;
            temp++;
        }
        int total = 0;
        for (int i = 0; i < height.length; i++) {
            total += (Math.min(leftBoundary[i], rightBoundary[i])- height[i]) * 1;
        }
        return total;
    }

    public static int trap(int[] height) {// find rightMax and leftMax | include current element while finding max,min
        int[] leftBoundary = new int[height.length];// TC: O(n) SC: 2n
        int[] rightBoundary = new int[height.length];
        // calculate the left tallest
        leftBoundary[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftBoundary[i] = Math.max(height[i], leftBoundary[i - 1]);
        }
        // calculate the right tallest
        rightBoundary[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0 ; i--) {
            rightBoundary[i] = Math.max(height[i], rightBoundary[i + 1]);
        }
        int total = 0;
        for (int i = 0; i < height.length; i++) {
            total += (Math.min(leftBoundary[i], rightBoundary[i])- height[i]) * 1;
        }

        return total;
    }
}
