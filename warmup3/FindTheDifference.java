package tutort.warmup3;

public class FindTheDifference {// https://leetcode.com/problems/find-the-difference/

    public static void main(String[] args) {
        char theDifference = findTheDifference("", "y");
        System.out.println(theDifference);
    }

    public static char findTheDifference(String s, String t) {
        int sSum = 0, tSum = 0;
        for(int i = 0; i < s.length(); i++){
            sSum += s.charAt(i);
            tSum += t.charAt(i);
        }
        tSum += t.charAt(t.length()-1);

        int diff = tSum - sSum;
        return (char)diff;
    }
}
