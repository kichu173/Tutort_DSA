package tutort.warmup2;

import java.util.Arrays;

public class Transpose2dMatrix {// https://leetcode.com/problems/transpose-matrix/

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {2, 4, -1},
                {-10, 5, 11},
                {18, -7, 6}
        };
//        System.out.println(arr[0].length + " " + arr.length);// 3 3
        int[][] newArr = new int[arr[0].length][arr.length];// new int[col][row] ->row and column size interchanged
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[j][i] = arr[i][j];

            }
        }
        System.out.println(Arrays.deepToString(newArr));
    }
}
