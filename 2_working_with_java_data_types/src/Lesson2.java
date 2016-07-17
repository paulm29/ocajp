/**
    2.2 Differentiate between object reference variables and primitive variables
    Topics:
         == operator with primitives and object references
         method arguments: pass by value
 */

import java.util.Calendar;

public class Lesson2 {
    /*
        lower case is primitive, captialised first letter is object
     */
    int x = 10; // a primitive

    Calendar calendar = Calendar.getInstance(); // calendar reference

    public static void main(String[] args) {
        Lesson2 lesson2 = new Lesson2();

        //lesson2.x.getClass(); // not an object, therefore no class
        String name = lesson2.calendar.getClass().getName();
        System.out.println(name);

        /*
            calendar2 contains a reference to the same object
            as lesson2.calendar
         */
        Calendar calendar2 = lesson2.calendar;
        if (calendar2 == lesson2.calendar) {
            System.out.println("Calendars are equal");
        }
        else {
            System.out.println("Calendars are not equal");
        }

        /*
            Set calendar to a new calendar and then
            check for equality
         */
        calendar2 = Calendar.getInstance();
        if (calendar2 == lesson2.calendar) {
            System.out.println("Calendars are equal");
        }
        else {
            System.out.println("Calendars are not equal");
        }

        /*
            Set calendars to the same date
         */
        String string1 = "Hello";
        String string2 = "Hello";

        /*
            Check for reference equality
         */
        if (string1 == string2) { // may be true due to JVM, but cannot rely on it
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }

        /*
            Check for value equality
         */
        if (string1.equals(string2)) {
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }

        String myName = "Paul";
        lesson2.sayHello(myName);
        System.out.println(myName);
    }

    /*
        passing by value, not reference, myName in main() is not changed
      */
    public void sayHello(String myName) {
        myName = "Hello " + myName;
        System.out.println(myName);
    }
}
