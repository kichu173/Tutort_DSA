package tutort.arrays;

import java.util.Arrays;

public class DecodeXORedArray {// 26/Mar - class assignment
    public static void main(String[] args) {// https://leetcode.com/problems/decode-xored-array/
        int[] decode = decode(new int[]{1, 2, 3}, 1);
        System.out.println(Arrays.toString(decode));// op:[1,0,2,1]
    }

    public static int[] decode(int[] encoded, int first) {//TC: O(n) SC: n, algo: https://www.youtube.com/watch?v=FZBkXnDxCLg
        int[] newArr = new int[encoded.length + 1];
        newArr[0] = first;
        int x = 0;
        for (int i = 0; i < encoded.length; i++) {
            x = encoded[i] ^ newArr[i];
            newArr[i + 1] = x;
        }
        return newArr;
    }
}
