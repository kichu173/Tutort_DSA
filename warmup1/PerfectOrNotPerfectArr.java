package tutort.warmup1;

import java.util.Arrays;
import java.util.Scanner;

public class PerfectOrNotPerfectArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arrRev = new int[n];
        //Reverse the array
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            arrRev[count++] = arr[i];
        }

        System.out.println("\nThe reverse of array is : ");
        for (int i = 0; i < arrRev.length; i++) {
            System.out.print(arrRev[i] + " ");
        }
        boolean equals = Arrays.equals(arr, arrRev);// compare two arrays without using equals method https://stackoverflow.com/questions/52782661/how-to-compare-arrays-without-using-equals-and-with-a-false-boolean
        if (equals)
            System.out.println("PERFECT");
        else
            System.out.println("NOT PERFECT");
    }
}
