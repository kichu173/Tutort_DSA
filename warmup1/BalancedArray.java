package tutort.warmup1;

public class BalancedArray {// bonus questions
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2};
        int size = arr.length / 2;
        int sum = 0;
        for (int i = 0; i < size; i++) {// 1st part of array
            sum += arr[i];
        }
        int sum1 = 0;
        for (int i = size; i < arr.length; i++) {// 2nd part of array
            sum1 += arr[i];
        }
        if (sum == sum1) {
            System.out.println("balanced array");
        }
        // to make balanced array
        System.out.println("To make array balanced you should add:: " + Math.abs(sum - sum1));
    }
}
