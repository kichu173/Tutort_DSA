package tutort.warmup2;

public class ThreeConsecutiveOdds { //https://leetcode.com/problems/three-consecutive-odds/
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 3, 4, 5, 7, 23, 12};// {2,6,4,1}
        boolean ans = consecutiveOdds(arr);
        System.out.println(ans);
    }

    private static boolean consecutiveOdds(int[] arr) {
        int yes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                yes++;
                if (yes == 3) {
                    return true;
                }
            } else {
                yes = 0;
            }
        }
        return false;
    }
}
