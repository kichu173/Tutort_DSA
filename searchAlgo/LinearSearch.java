package tutort.searchAlgo;

import java.util.Arrays;

public class LinearSearch {// Search int in an array | search a char in String | search in a two Dimensional Array

    private static int find(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static boolean contains(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    private static int find(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }

    private static boolean contains(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    private static int[] find(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }


    public static void main(String[] args) {
        int[] arr = {9, 7, 4, 3, 8, 1, 0, 5};
        System.out.println(LinearSearch.find(arr, 8));
        System.out.println(LinearSearch.contains(arr, 8));

        String str = "Kiran";
        System.out.println(LinearSearch.find(str, 'K'));
        System.out.println(LinearSearch.contains(str, 'K'));

        int[][] twoDArr = {
                {2, 5, 3},
                {5, 7, 3, 8},
                {8, 3, 2}
        };
        int[] res = LinearSearch.find(twoDArr, 7);
        System.out.println(Arrays.toString(res));
    }
}
