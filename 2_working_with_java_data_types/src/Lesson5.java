/**
    2.5 Develop code that uses wrapper classes such as Boolean, Double, and Integer.
    Topics:
         Wrapper classes: Byte, Character, Integer, Long, Float
         Autoboxing
 */

import java.util.ArrayList;
import java.util.List;

/*
    Wrapper objects allows us to treat primitive types as objects. For example,
    to be stored and used from lists. The wrapper classes also contain utility
    methods, such as Integer.parseInt(n).

    Autoboxing is a convenient feature that means you don't manually need to
    convert objects to primitives and vice-versa.
 */
public class Lesson5 {

    public static void main(String[] args) {
        /*
            The old way, without autoboxing
         */
        int intPrimitive = 99;
        Integer intObject = Integer.valueOf(intPrimitive);
        intPrimitive = intObject.intValue();

        System.out.println("Old way: " + intObject + " " + intPrimitive);

        /*
            Get an int from a String
            Note: none of the wrapper classes have a no-args constructor
         */
        int parsedInt = Integer.parseInt("2");  // primitive
        // alternatively,
        parsedInt = new Integer("2");
        // alternatively,
        parsedInt = Integer.valueOf("2");       // object
        System.out.println("Parsed string: " + parsedInt);

        /*
            The new way
         */
        ArrayList<Integer> list = new ArrayList<>();
        int element = 3;
        list.add(element);

        String type = list.get(0).getClass().getName();
        System.out.println(type); // java.lang.Integer

        operations();
        assignments();
        traps();
    }

    private static void operations() {
        /*
            Integral wrapper classes can perform arithmetic
         */
        int a = 2, b = 4, result = 0;
        result = new Integer(a) + new Integer(b);
        System.out.println(result);
        int result2 = 5 + new Integer(3);
        System.out.println(result2);

        /*
            Wrapper classes have equals methods
         */
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1 == i2);       // false
        System.out.println(i1.equals(i2));  // true
    }

    private static void assignments() {
        Integer i1 = 1;
        Integer i2 = new Integer(1);
        int i3 = 1;
        Byte b1 = 1;
        Long g1 = 1L;

        // i1 == i2 => false
        // i1 == i3 => true
        // i1 == b1 => Will not compile
        // i1.equals(i2) => true
        // i1.equals(g1) => false
        // i1.equals(b1) => false

        /*
        i1 == i2 will return false because both are pointing to different object.
        i1 == i3 will return true because one operand is a primitive int and so the other will be unboxed and then the value will be compared.
        i1 == b1 will not even compile because type of i1 and b1 references are classes that are not in the same class hierarchy. So == knows at compile time itself that they can't point to the same object.
        i1.equals(i2) will return true because both are Integer objects and both have the value 1.
        i1.equals(b1) and i1.equals(g1) will return false because they are pointing to objects of different types.

        Signature of equals method is : boolean equals(Object o); So it can take any object hence there will be no compilation error.
        Further, The equals methods of all wrapper classes first check if the two object are of same class or not. If not, they immediately return false.
        */
    }

    private static void traps() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1); // removes index 1, not the Integer 1
        System.out.println(numbers);

        List<Integer> heights = new ArrayList<>();
        heights.add(null);
        int h = heights.get(0); // NullPointerException
    }
}
