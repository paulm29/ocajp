/*
    2.5 Develop code that uses wrapper classes such as Boolean, Double, and Integer.
 */
package datatypes;

import java.util.ArrayList;

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
            The old way
         */
        int intPrimitive = 99;
        Integer intObject = Integer.valueOf(intPrimitive);
        intPrimitive = intObject.intValue();

        /*
            The new way
         */
        ArrayList<Integer> list = new ArrayList<>();
        int element = 3;
        list.add(element);

        String type = list.get(0).getClass().getName();
        System.out.println(type); // java.lang.Integer
    }
}
