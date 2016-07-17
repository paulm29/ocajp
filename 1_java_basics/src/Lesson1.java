/**
    1.1 Define the scope of variables
    Topics
    - dot operator and matching braces
    - scopes: block, method, instance, class
*/
/**
 * Javadoc multiple-line comment
 * @author Paul Robotham
 */

/*
    Classes can only be public or default (package) access
 */
public class Lesson1 {
    public static int a = 77;   // static class scope: Lesson1.y
    private int b = 88;         // object scope: lesson1.y

    /*
        This is a constructor. It has no return type.
     */
    public Lesson1() {
        System.out.println("Class scope: " + Lesson1.a);
        System.out.println("Object scope: " + this.b);
    }

    /*
        <access> <optional> <return type>
        optional modifier can come before optional modifier.
        access = private, (blank) default, protected, public
        optional = final, abstract (and a few others out of scope for OCA)
     */
    // public void final doStuff2() {} // compile error; return type must come last
    public final void doStuff2() {}
    final public void doStuff3() {}

    public void doStuff(int c) {
        int d;
        d = 11;
        double e; // scope of c and d is entire method (local scope)
        e = 10.0;

        System.out.println("Method scope: " + c);
        System.out.println("Method scope: " + d);
        System.out.println("Method scope: " + e);

        {
            // this is a block; rarely used, but could catch you out!

            /*
                scope of f is only within block
                don't forget the f (or F) suffix! _
                decimals are double data type and without suffix by default
            */
            float f = 1.0f;
            System.out.println("Block scope: " + f);
        }

        if(true) {
            String myString = "This variable only has scope of if statement";
        }
        // System.out.println(myString); //compile error; myString out of scope

        for(int i = 0; i < 3; i++) {
            System.out.print("for loop variable " + i + " is in scope\n");
        }

        // don't get fooled by the lack of braces; not good practice, but legal
        for(int j = 0; j < 3; j++)
            System.out.print("for loop variable " + j + " is in scope\n");
    }

    public static void main (String[] args) {
        Lesson1 lesson1 = new Lesson1();
        lesson1.doStuff(99);
    }
}
