package tutort.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {// 27/Mar - class assignment

    public static void main(String[] args) {// https://leetcode.com/problems/longest-substring-without-repeating-characters/
        int res = lengthOfLongestSubstring("pwwkew");// abcabcbb | bbbbb | pwwkew
        System.out.println(res);// 3 | 1 | 3
        System.out.println("--------------------");
        int res1 = lengthOfLongestSubstringOptimal("abcdc");
        System.out.println(res1);
        System.out.println("--------------------");
        int res2 = lengthOfLongestSubstringOptimal1("abcdca");//abcabcbb
        System.out.println(res2);
    }

    /* pre request - write a code to print substrings of a string - SubStringInString(double shift and search program)*/

    public static int lengthOfLongestSubstring(String s) {// Brute Force - find all substrings of a string O(n^2), check duplicates O(n^2), get max length
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String subs = s.substring(i, j);
                if (hasUniqueChars(subs)) {
                    res = Math.max(res, subs.length());
                }
            }
        }
        return res;
    }

    private static boolean hasUniqueChars(String subs) {
        boolean isUnique = false;
        for (int i = 0; i < subs.length(); i++) {
            for (int j = i + 1; j < subs.length(); j++) {
                if (subs.charAt(i) == subs.charAt(j)) {
                    return isUnique;
                }
            }
        }
        return !isUnique;
    }

    public static int lengthOfLongestSubstringOptimal(String s) {// sliding window approach
        if (s.length() == 0 || s == null) {// TC; O(N), SC: n, used sliding window algo::https://www.youtube.com/watch?v=4i6-9IzQHwo
            return 0;
        }
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();
        while (i < s.length()) {
            char c = s.charAt(i);
            while (set.contains(c)) {
                set.remove(s.charAt(j));
                ++j;// j++
            }
            set.add(c);
            max = Math.max(max, i - j + 1);
            ++i;// i++
        }
        return max;
    }

    public static int lengthOfLongestSubstringOptimal1(String s) {// sliding window approach (47:00 - Array class 6)
        if (s.length() == 0 || s == null) {// TC; O(N), SC: min(M,N), algo::https://www.youtube.com/watch?v=gHNMSeeu_4Q
            return 0;
        }
        int start = 0, max = 0;
        Map<Character, Integer> map = new HashMap<>();// To maintain previous index's
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {// increment start until condition(distinct characters) satisfies.
                if (start <= map.get(c)) {
                    start = map.get(c) + 1;// calc to find prev_index + 1
                }
            }
            max = Math.max(max, end-start +1);
            map.put(c, end);
        }
        return max;
    }
}
