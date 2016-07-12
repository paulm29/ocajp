/*
    5.2 Create and use for loops including the enhanced for loop
 */
import java.util.ArrayList;
import java.util.List;

public class Lesson2 {

    public static void main(String[] args) {

        /*
            For loop has three parts:
            1. Initialization
            2. Test, AKA Condition
            3. Increment (or decrement)
         */

        for(int i = 0; i <5; i++) {
            System.out.println(i);
        } // brackets optional with a single line

        /*
            Multiple initializations
            Must be same base type, but may include arrays
         */
        for(int i = 0, j = 5, k[] = {1,2,3}; i <5; i++) {
            System.out.println(i);
        }


        /*
            Expression statements in initialization section,
            Cannot declare variables; must do one or the lesson4.

            Expression statement only can occur in the third section.
            They run at the end of the loop iteration

            Expression statements are:
            - increment/decrement: x++ --y
            - assignment:   y = x - 10
            - invocation: doStuff()
            - construction: new Stuff()
            and they can be separated by commas
         */
        int l = 0;
        for(System.out.println("Hi");l<5 && true ;l++,System.out.println("Bye")) {
            System.out.println(l);
        }

        /*
            omitting sections of a loop

            for() and for(;) won't work though
         */
        for(;;) {
            break;
        }

        for(int i = 0;;) {
            break;
        }

        for(;1==1;) {
            break;
        }

        int m = 0;
        for(;;m++) {
            break;
        }


        /*
            Enhanced for loop
            Works for arrays, lists, and lesson4 ordered collections;
            anything that implements the Iteratable interface (with hasNext() / next())
         */
        String[] stuff = new String[] {"a","b","c"};
        for(String s: stuff) {
            System.out.println(s);
        }

        List objects = new ArrayList();
        objects.add("a");
        objects.add("b");
        for(Object o: objects) {
            String s = (String)o;
        }

        /*
            Cannot modify list when using enhanced for, but can with other loops
            Exception is java.util.ConcurrentModificationException
         */
        List<String> strings = new ArrayList<String>();
        strings.add("a");
        strings.add("b");
        for(String s: strings) {
            strings.add(s); // runtime error
        }
    }
}



