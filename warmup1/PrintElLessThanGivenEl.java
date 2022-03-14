package tutort.warmup1;

import java.util.Scanner;

public class PrintElLessThanGivenEl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to print less than or equal numbers size:: ");
        int el = sc.nextInt();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= el) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
