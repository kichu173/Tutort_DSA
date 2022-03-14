package tutort.warmup3;

public class ThirdMaximumNumber {// https://leetcode.com/problems/third-maximum-number/

    public static void main(String[] args) {
        int i = thirdMax(new int[]{2,2,3,1});
        System.out.println(i);
    }

    public static int thirdMax(int[] nums) {
        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;
        for (Integer num : nums) {

            if (num.equals(max) || num.equals(secondMax) || num.equals(thirdMax)) {
                continue;
            }

            if (max == null || num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            }else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }

        if (thirdMax == null) {
            return max;
        }

        return thirdMax;
    }
}
