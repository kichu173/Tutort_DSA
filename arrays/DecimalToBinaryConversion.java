package tutort.arrays;

import java.util.Scanner;

public class DecimalToBinaryConversion {// To understand how decimal to binary conversion works.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. ");
        int n = sc.nextInt();
        System.out.print("Decimal of "+ n + " is: ");
        toBinary(n);
    }

    public static void toBinary(int decimal){
        int binary[] = new int[40];
        int index = 0;
        while(decimal > 0){
            binary[index++] = decimal%2;
            decimal = decimal/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
        System.out.println();//new line
    }
}
