package tutort.warmup1;

import java.util.Scanner;

public class ElValueEqualToIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == i + 1) {
                System.out.println(arr[i]);
            }
        }
    }
}
