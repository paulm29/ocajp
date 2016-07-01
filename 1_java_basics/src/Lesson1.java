/**
 * Created by paulr on 7/1/2016.
 */
public class Lesson1 {
    /*
    1.1 The meaning of scope, blocks, and curly braces
     */
    /*
    Explanation: having to use X, or package.X, or class.X, etc.
     */

    public static int a = 77; // class scope: Lesson1.y
    private int b = 88; // object scope: lesson1.y

    public Lesson1() {
        System.out.println("Class scope: " + Lesson1.a);
        System.out.println("Object scope: " + this.b);
    }

    public void doStuff(int c) {
        int d;
        d = 11;
        double e; // scope of c and d is entire method
        e = 10.0;

        System.out.println("Method scope: " + c);
        System.out.println("Method scope: " + d);
        System.out.println("Method scope: " + e);

        {
            // this is a block; rarely used, but could catch you out!

            /*
            scope of f is only within block
            don't forget the f suffix! _
            decimals are double data type and without suffix by default
            */
            float f = 1.0f;
            System.out.println("Block scope: " + f);
        }

        for(int i = 0; i < 3; i++) {
            System.out.print("for loop variable " + i + " is in scope\n");
        }


    }

    public static void main (String[] args) {
        Lesson1 lesson1 = new Lesson1();
        lesson1.doStuff(99);
    }
}
