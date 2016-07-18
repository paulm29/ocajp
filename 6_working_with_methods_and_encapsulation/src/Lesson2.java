/**
    6.2 Apply the static keyword to methods and fields
 */
import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.*;

public class Lesson2 {
    /*
        Be careful with static final fields and use of static initializers.
        Static final variables MUST be assigned a value before the class is initialized.
        Non-static final variables must be assigned after the constructor runs.
     */
    private static int one;
    private static final int two;
    private static final int three = 3;
    // private static final int four; // compile error, value not assigned
    static {
        one = 1;
        two = 2;
        //three = 3;    // compile error, trying to re-assign a final variable
        //two = 4;      // compiler, trying to re-assign a final variable
        // throw new NullPointerException(); // compile error
        // if(true) throw new NullPointerException(); // ExceptionInInitializerError
    }

    public static String myName = "Paul";

    public static String getMyName() {
        return myName;
    }

    public String getNickname() {
        return "Superman";
    }

    public static void main(String[] args) {

        /*
         cannot call non-static methods without an instance
          */
        // getNickname(); // compiler error
        Lesson2 lesson2 = new Lesson2();
        System.out.println(lesson2.getNickname());

        System.out.println(myName);
        System.out.println(getMyName());
        // these also work, both class and instance reference
        System.out.println(Lesson2.getMyName());
        System.out.println(lesson2.getMyName());

        /*
            subclass getMyName hides parent's method
         */
        SubClass subClass = new SubClass();
        System.out.println(subClass.getMyName());

        /*
            Because reference is to parent class, its static method will be called.
            This is different to instance method overriding in polymorphism, where
            the subclass' method would be used.
         */
        Lesson2 subClass2 = new SubClass();
        System.out.println(subClass2.getMyName());

        /*
            Trap: not a NullPointerException !
            Because myName is static and exists without an instance of a class
         */
        SubClass subClass3 = new SubClass();
        System.out.println(subClass3.myName);
        subClass3 = null;
        System.out.println(subClass3.myName);

        staticImports();
    }

    /*
        With static imports, remember that class methods take priority
     */
    private static void staticImports() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(1);

        sort(numbers);
    }

    private static void sort(ArrayList<Integer> nums) {
        System.out.println("Running sort");
        Collections.sort(nums);
    }

}

class SubClass extends Lesson2 {
    /*
        the parent version of myName and getMyName is hidden
     */
    public static String myName = "Bob";

    public static String getMyName() {
        return myName;
    }
}

