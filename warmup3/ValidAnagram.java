package tutort.warmup3;

public class ValidAnagram {// https://leetcode.com/problems/valid-anagram/
    public static void main(String[] args) {
        boolean res = isAnagramBrutForce("anagram", "nagaram");// cat,act | elbow, below | night, thing - true .. cat,rat - false
        System.out.println(res);
        boolean res1 = isAnagram("cat", "act");
        System.out.println(res1);
    }

    public static boolean isAnagramBrutForce(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int count = 0;
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if(sChar[i] == tChar[j]) {
                    count++;
                    break;
                }
            }
        }
        if (count == s.length()) {
            return true;
        }
        return false;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < counts.length; i++) {
            if ((counts[i]) != 0) {
                return false;
            }
        }
        return true;
    }
}
