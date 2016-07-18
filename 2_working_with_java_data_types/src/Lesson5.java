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
         */
        int parsedInt = Integer.parseInt("2");  // primitive
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
        traps();
    }

    private static void operations() {
        /*
            Integral wrapper classes can perform arithmetic
         */
        int a = 2, b = 4, result = 0;
        result = new Integer(a) + new Integer(b);
        System.out.println(result);

        /*
            Wrapper classes have equals methods
         */
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1 == i2);       // false
        System.out.println(i1.equals(i2));  // true
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
