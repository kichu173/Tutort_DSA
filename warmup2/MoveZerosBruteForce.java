package tutort.warmup2;

import java.util.Arrays;

public class MoveZerosBruteForce {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int[] newArr = new int[arr.length];
        int counter = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[counter++] = arr[i];
            } else {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            newArr[count+1] = 0;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
