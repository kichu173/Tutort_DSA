package tutort.warmup2;

public class RichestCusWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {1, 2, 4}
        };
        int maxWealth = maximumWealth(accounts);
        System.out.println(maxWealth);
    }

    static int maximumWealth(int[][] accounts) {// Solution in kunal kushwa(Linear search algo - Theory + code + Questions 1:04:09)
        int temp = 0;
        int max = 0;
        for (int row = 0; row < accounts.length; row++) {
            for (int col = 0; col < accounts[row].length; col++) {
                temp = temp + accounts[row][col];
            }
            if (temp > max) {
                max = temp;
            }
            temp = 0;
        }
        return max;
    }
}
