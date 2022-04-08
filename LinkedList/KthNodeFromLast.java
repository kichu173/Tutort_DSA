package tutort.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class KthNodeFromLast {
    public static void main(String[] args) {//https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1/#
        getNthFromLast(9, 2);
    }

    private static void getNthFromLast(int n, int k) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        System.out.println(list);
        int pos = n - k;
        System.out.println(list.get(pos));
    }
}

// 2. https://leetcode.com/problems/middle-of-the-linked-list/ - completed. Brut force TC: O(n) SC: 1 | Tortoise and hare TC:O(n) SC:1
// algo:: https://www.youtube.com/watch?v=_cl3O4FBZh8 for Q2(middle-of-the-linked-list)
// 3. https://leetcode.com/problems/odd-even-linked-list/ - completed. TC: O(N) SC: 1 algo:: Approach 2 (https://www.youtube.com/watch?v=YE9ggKeHeK0)
// https://leetcode.com/problems/odd-even-linked-list/discuss/1912718/O(n)O(1)-space-easy-variable-naming - try to understand this approach also | class 1:03:00
// 4. https://leetcode.com/problems/add-two-numbers/ - completed. TC: O(max(m,n)) SC:n
// algo:: https://www.youtube.com/watch?v=LBVsXSMOIk4
// 5. https://leetcode.com/problems/delete-node-in-a-linked-list/ - TODO.