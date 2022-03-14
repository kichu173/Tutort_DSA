package tutort.warmup3;

public class AddDigits {// https://leetcode.com/problems/add-digits/
    public static void main(String[] args) {
        int i = addDigits(38);
        System.out.println(i);
    }

    public static int addDigits(int num) {// algorithm -> https://www.youtube.com/watch?v=aOu5fgdNNzU
        if (num < 10) {
            return num;
        }
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
            if (sum > 9 && num == 0) {
                num = sum;
                sum = 0;
            }
        }
        return sum;
    }
}
