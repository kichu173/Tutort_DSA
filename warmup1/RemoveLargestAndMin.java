package tutort.warmup1;

public class RemoveLargestAndMin {// q7 -> warmup assignment 1

    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 9, 4, 3, 7, 5};//7, 8, 3, 4, 2, 9, 5
        int[] sortedArr = sort(arr);
        int size = arr.length / 2;
        if (arr.length % 2 == 0) {
            System.out.println(sortedArr[size -1]);
        } else {
            System.out.println(sortedArr[size]);
        }
    }

    private static int[] sort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
/*
Arrays.sort(arr);
        int size=(int)n/2;
        if(n%2==0){
        return arr[size-1];
        }else{
        return arr[size];
        }*/
