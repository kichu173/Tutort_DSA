package tutort.arrays;

public class SubStringInString {// print all substring for a given string

    public static void main(String[] args) {// algo:: https://www.youtube.com/watch?v=wK2m7mIrfUg
        subString("abc");// "abcabcbb"
    }

    private static void subString(String s) { // TC:O(n^2)
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));// hover over substring api to understand more
            }
        }
    }
}
