package co.kiran;

public class PatternSolv {
    //https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
    //resources:
    //https://www.youtube.com/playlist?list=PLdo5W4Nhv31Yu1igxTE2x0aeShbKtVcCy
    //https://dev.to/vaib215/solution-must-do-pattern-problems-before-starting-dsa-striver-dsa-course-40lb

    /*
     *****
     *****
     *****
     *****
     *****
     */
    private static void pattern1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     *
     **
     ***
     ****
     *****
     */
    private static void pattern2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    1
    12
    123
    1234
    12345
     */
    private static void pattern3() {
        int count;
        for (int i = 0; i < 5; i++) {
            count = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(count++);
            }
            System.out.println();
        }
    }

    /*
    1
    22
    333
    4444
    55555
     */
    private static void pattern4() {
        int count = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count);
            }
            count++;
            System.out.println();
        }
    }

    /*
     *****
     ****
     ***
     **
     *
     */
    private static void pattern5() {
        for (int i = 4; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    12345
    1234
    123
    12
    1
     */
    private static void pattern6() {
        int count;
        for (int i = 4; i >= 0; i--) {
            count = 1;
            for (int j = i; j >= 0; j--) {
                System.out.print(count++);
            }
            System.out.println();
        }
    }

    /*
         *
        ***
       *****
      *******
     *********
     */
    private static void pattern7() {//https://www.youtube.com/watch?v=PYBzYPdtLM8&ab_channel=Jenny%27slecturesCS%2FITNET%26JRF
        for (int i = 1; i <= 5; i++) {// to print rows
            for (int j = 1; j <= (5 - i); j++) {// to print space
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {// to print *
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    *********
     *******
      *****
       ***
        *
     */
    private static void pattern8() {
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <=5-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i -1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     *
    ***
   *****
  *******
 *********
 *********
  *******
   *****
    ***
     *
     */
    private static void pattern9() { // combining pattern 8 and pattern 9
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
     */
    private static void pattern10() {// combining pattern 2 and pattern 5
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
     */
    private static void pattern11() {
        int count;
        for (int i = 0; i < 5; i++) {
            count = i % 2 == 0 ? 1 : 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                if(count == 1) {
                    count = 0;
                } else {
                    count = 1;
                }
            }
            System.out.println();
        }
    }

    /*
    1      1
    12    21
    123  321
    12344321
     */
    private static void pattern12() {
        for (int i = 1; i <= 4; i++) {// to print rows
            for (int j = 1; j <= i; j++) {// to print values from start
                System.out.print(j);
            }
            for (int k = 1; k <= 2 * (4 - i); k++) {// to print spaces
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {// to print end values
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
     */
    private static void pattern13() {
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    /*
    A
    A B
    A B C
    A B C D
    A B C D E
     */
    private static void pattern14() {
        char ch;
        for (int i = 1; i <= 5; i++) {
            ch = 65;// other way would be declaring ch = 'A'
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }

    /*
    A B C D E
    A B C D
    A B C
    A B
    A
     */
    private static void pattern15() {
        for (int i = 5; i >0; i--) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }

    /*
    A
    BB
    CCC
    DDDD
    EEEEE
     */
    private static void pattern16() {
        char ch = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }

    /*
       A
      ABA
     ABCBA
    ABCDCBA
     */
    private static void pattern17() {
        char ch;
        for (int i = 1; i <= 4; i++) {// to print rows
            ch = 'A';
            for (int j = 1; j <= (4 - i); j++) {// to print spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++);
            }
            --ch;
            for (int k = 1; k < i; k++) {
                System.out.print(--ch);
            }
            System.out.println();
        }
    }

    /*
    E
    D E
    C D E
    B C D E
    A B C D E
     */
    private static void pattern18() {
        char ch = 'E';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            for (int k = 1; k <= i+1; k++) {
                --ch;
            }
            System.out.println();
        }
    }

    /*
    **********
    ****  ****
    ***    ***
    **      **
    *        *
    *        *
    **      **
    ***    ***
    ****  ****
    **********
     */
    private static void pattern19() {// Hollow diamond star pattern
        int count = 5;
        // Loop to print upper half of the pattern
        for(int i = 1; i <= count; i++){
            for(int j = count; j >= i; j--){
                System.out.print("*");
            }
            for(int j = 1; j <= (2 * i) - 2; j++){
                System.out.print(" ");
            }
            for(int j = count; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        // Loop to print lower half of the pattern
        for(int i = 1; i <= count; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 2*(count - i)-1; j >=0; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
     *       *
     **     **
     ***   ***
     **** ****
     **********
     ****  ****
     ***    ***
     **      **
     *        *
     */
    private static void pattern20() {
        // Loop to print upper half of the pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (5 -i) - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Loop to print lower half of the pattern
        for (int i = 4; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (5 - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     ****
     *  *
     *  *
     *  *
     ****
     */
    private static void pattern21() {
        int count = 4;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= count; j++) {
                if (i == 1 || i == 5 || j == 1 || j == count) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*
    4 4 4 4 4 4 4
    4 3 3 3 3 3 4
    4 3 2 2 2 3 4
    4 3 2 1 2 3 4
    4 3 2 2 2 3 4
    4 3 3 3 3 3 4
    4 4 4 4 4 4 4
     */
    private static void pattern22() {
        int count = 4;
        for(int i = 1; i<=count; i++){
            for(int j=count; j>count-i;j--){
                System.out.print(j+" ");
            }
            for(int j=1; j<=2*(count-i)-1;j++){
                System.out.print(count-i+1+" ");
            }
            for(int j=count-i+1; j<=count;j++){
                if(j==1) continue;
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i = count-1; i>0; i--) {
            for (int j = count; j > count - i; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= 2 * (count - i) - 1; j++) {
                System.out.print(count - i + 1 + " ");
            }
            for (int j = count - i + 1; j <= count; j++) {
                if (j == 1) continue;
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1();
        System.out.println();
        pattern2();
        System.out.println();
        pattern3();
        System.out.println();
        pattern4();
        System.out.println();
        pattern5();
        System.out.println();
        pattern6();
        System.out.println();
        pattern7();
        System.out.println();
        pattern8();
        System.out.println();
        pattern9();
        System.out.println();
        pattern10();
        System.out.println();
        pattern11();
        System.out.println();
        pattern12();
        System.out.println();
        pattern13();
        System.out.println();
        pattern14();
        System.out.println();
        pattern15();
        System.out.println();
        pattern16();
        System.out.println();
        pattern17();
        System.out.println();
        pattern18();
        System.out.println();
        pattern19();
        System.out.println();
        pattern20();
        System.out.println();
        pattern21();
        System.out.println();
        pattern22();
    }
}
