package tutort.arrays;
import java.util.*;

public class ProductArrayExceptItself {// https://leetcode.com/problems/product-of-array-except-self/
    public static void main(String[] args) {
        int[] ints = productExceptSelf(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(ints));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] newArr = new int[nums.length];
        int count = 0;
        int temp = 1;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    temp = temp * nums[j];
                }
            }
            newArr[count++] = temp;
            temp = 1;
        }
        return newArr;
    }
}
