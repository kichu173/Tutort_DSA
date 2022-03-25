package tutort.warmup4;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        rotate(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
        rotateOptimal(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
    }

    public static void rotate(int[][] matrix) {// Brute force TC: O(n^2) SC:O(n^2)
        int[][] newArr = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newArr[j][matrix.length - i - 1] = matrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(newArr));
    }

    public static void rotateOptimal(int[][] matrix) {// TC: O(n^2) SC:O(1) algo::https://www.youtube.com/watch?v=Y72QeX0Efxw
        // pre req: transpose of a matrix
        // find the transpose of a matrix and then reverse every row to get result
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //After transpose, for every row two pointer approach to reverse row(Dry run it to understand)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length -1 - j] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
