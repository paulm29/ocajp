/**
    9.2 Creating and manipulating Strings
 */

import java.util.Date;

public class Lesson2 {

    public static void main(String... args) {
        /*
            Strings are immutable
         */
        // myString and myString2 point to same object
        String myString = new String("Hello");
        String myString2 = myString;
        myString += " World!";  // myString now points to new object
        System.out.println("Strings are different:");
        System.out.println(myString);
        System.out.println(myString2);

        /*
            A few ways to create a string - not exhaustive
         */
        String s = "Hello, World";
        String s2 = new String("a string");
        String s3 = new String(new StringBuilder());
        String s4 = new String(new char[]{'a','b','c'});

        String plus = "Hello, " + "World";
        System.out.println(plus);
        String concat = plus.concat("!  ");
        System.out.println(concat);
        String trim = concat.trim();
        System.out.println(trim);
        String removeOs = trim.replace("o","0");
        System.out.println(removeOs);
        int len = removeOs.length(); // note the parentheses
        System.out.println(len);

        // OBJECT.toString() is a commonly used
        System.out.println(new Date().toString());

        String answer = String.format("The answer to the meaning of life is %d", 42);
        System.out.println(answer);

        /*
            Other comparison methods:
            .contentEquals(CharSequence cs)
            .contentEquals(StringBuilder sb)
            int .compareTo(String s) // positive, negative or zero result
            // positive if left string is greater
            int .compareToIgnoreCase(String s)
         */
        if("Paul".equals("God")) {
            System.out.println("Paul is God");
        }

        if("Paul".equalsIgnoreCase("PAUL")) {
            System.out.println("Paul is God");
        }

        int index = "Paul".indexOf("P");
        System.out.println(index);

        /*
            Also:
            .startsWith
            .endsWith
            .contains
            https://docs.oracle.com/javase/7/docs/api/index.html?java/lang/String.html
         */
    }
}
