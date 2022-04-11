package tutort.Recursion;

public class PrintNumber {
    public static void main(String[] args) {
        printNumber(1);
    }

    private static void printNumber(int n) {
        if (n == 6){
            return;
        }
        System.out.println(n);
        printNumber(++n);
    }
}
