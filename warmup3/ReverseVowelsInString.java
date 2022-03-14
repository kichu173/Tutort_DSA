package tutort.warmup3;

public class ReverseVowelsInString { //https://leetcode.com/problems/reverse-vowels-of-a-string/
    public static void main(String[] args) {
        String str = "leetcode";//leetcode | hello world
        System.out.println(reverseVowels(str));
    }

    public static String reverseVowels(String str1) {
        int j = 0;
        // Storing the vowels separately
        char[] str = str1.toCharArray();
        String vowel = "";
        for (int i = 0; i < str.length; i++) {
            if (isVowel(str[i])) {
                j++;
                vowel += str[i];
            }
        }

        // Placing the vowels in the reverse
        // order in the string
        for (int i = 0; i < str.length; i++) {
            if (isVowel(str[i])) {
                str[i] = vowel.charAt(--j);
            }
        }

        return String.valueOf(str);
    }

    static boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    }
}
