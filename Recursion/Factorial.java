package tutort.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int fact = fact(5);
        System.out.println(fact);
    }

    private static int fact(int n) {
        return n <= 1 ? 1 : n * fact(n - 1);
    }
}
