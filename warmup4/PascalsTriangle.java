package tutort.warmup4;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {// https://leetcode.com/problems/pascals-triangle/

    public static void main(String[] args) {
        List<List<Integer>> generate = generate(5);
        System.out.println(generate);
    }

    public static List<List<Integer>> generate(int numRows) {// algo: https://www.youtube.com/watch?v=6FLvhQjZqvM
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row;
        List<Integer> pre = null;
        for (int i = 0; i < numRows; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = row;
            res.add(row);
        }
        return res;
    }
}
