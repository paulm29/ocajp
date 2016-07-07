/*
    Was parentheses to override operator precedence
 */
public class Lesson2 {

    public static void main(String[] args) {
        /*
            Precedence
            ---
            Brackets: ( )
            Unary: + - i++ i-- !
            * /
            + -
         */


        int x = 3;
        int y = ++x * 5 / x-- + --x;
        // same as y = 4 * 5 / 4 + -2
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }
}
