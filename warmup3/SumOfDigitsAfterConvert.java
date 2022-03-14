package tutort.warmup3;

public class SumOfDigitsAfterConvert {// https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
    public static void main(String[] args) {
        int res = getLucky("zbax", 2);
        System.out.println(res);
    }

    public static int getLucky(String s, int k) {
        String convertToAscii = "";
        for (int i = 0; i < s.length(); i++) {
            convertToAscii += String.valueOf(((s.charAt(i) - 'a') + 1));
        }
        int sum = 0;
        while(k-- > 0 && convertToAscii.length() > 0) {
            sum = 0;
            for (int i = 0; i < convertToAscii.length(); i++) {
                int value = Integer.parseInt(String.valueOf(convertToAscii.charAt(i)));
                sum += value;
            }
            String result = String.valueOf(sum);
            convertToAscii = result;
        }
        return sum;
    }
}

// convert int to String
//Integer.toString(int i)


//convert String to int
//Integer.parseInt(String s);