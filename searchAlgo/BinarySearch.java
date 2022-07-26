package tutort.searchAlgo;

public class BinarySearch {
    private static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean asc = false;
        if (arr[start] < arr[end]) {
            asc = true;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (asc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 10, 12, 15, 20, 21, 28};
        System.out.println(BinarySearch.search(arr, 12));
        System.out.println("");
        int[] arr1 = {25, 20, 15, 12, 10, 8, 7};//order agnostic BS
        System.out.println(BinarySearch.search(arr, 10));
    }
}
