package tutort.warmup1;

public class ExceptTwoGreatest {// q8
    public static void main(String[] args) {
        int[] arr = {7, -2, 3, 4, 9, -1};// 2, 8, 7 ,1 ,5
        int[] sorted = sort(arr);
        int size = arr.length;
        for (int i = 0; i < size - 2; i++) {
            System.out.println(sorted[i]);
        }
//        int[] newArr = new int[size - 2];
//        int k = 0;
//        for (int i = 0; i < newArr.length; i++) {
//            newArr[k++] = sorted[i];
//        }
//        System.out.println(Arrays.toString(newArr));
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
