package tutort.warmup1;

import java.util.Scanner;

public class PrintElAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index key to print Element:: ");
        int idx = sc.nextInt();
        System.out.println(arr[idx]);
    }
}
