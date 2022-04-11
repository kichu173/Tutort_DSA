package tutort.Recursion;

public class RecursionEx2 {
    public static void main(String[] args) {
        fun2(21);
    }

    private static void fun2(int n) {
        if (n == 0) {
            return;
        }
        fun2(n/2);
        System.out.printf("%d", n % 2);
    }
}
