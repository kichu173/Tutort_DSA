package tutort.Recursion;

public class RecursionEx1 {
    public static void main(String[] args) {
        foo(5);
        //postIncrement(5);
    }

    private static int foo(int a) {
        if (a == 0) {
            return 0;
        }

        a = foo(--a);// a-- -> stack overflow error
        System.out.println(a);

        return a;
    }

//    private static void postIncrement(int a) {
//        System.out.println(a++);// 5
//        System.out.println("----");
//        System.out.println(a);// 6
//    }
}
