package tutort.warmup1;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {// q9
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print sum of series:: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;// 1 3 6 10 15
        }
        System.out.println(sum);
    }
}
