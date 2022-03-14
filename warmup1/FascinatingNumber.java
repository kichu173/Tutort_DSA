package tutort.warmup1;

import java.util.Scanner;

public class FascinatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:: ");
        int num = sc.nextInt();
        int n1 = num * 2;
        int n2 = num * 3;
        String concatVal = num + "" + n1 + n2;
        boolean isFound = true;
        for (char c = '1'; c <= '9'; c++) {
            int count = 0;
            for (int i = 0; i < concatVal.length(); i++) {
                char charAt = concatVal.charAt(i);
                if(charAt == c) {
                    count++;
                }
            }
            if (count > 1 || count == 0) {
                isFound = false;
                break;
            }
        }
        if (isFound) {
            System.out.println(num + " is a fascinating number");
        } else {
            System.out.println(num + " is not a fascinating number");
        }
    }
}
