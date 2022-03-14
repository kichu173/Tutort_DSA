package tutort.warmup2;

public class JewelsAndStones {// https://leetcode.com/problems/jewels-and-stones/
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int res = numJewelsInStones(jewels, stones);
        System.out.println(res);
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int counter = 0;
        char[] stone = stones.toCharArray();
        for(int i =0; i< jewels.length(); i++) {
            char ch = jewels.charAt(i);
            for(int j = 0; j < stone.length; j++) {
                if(ch == stone[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
