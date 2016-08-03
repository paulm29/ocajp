/**
    9.2 Creating and manipulating Strings
    Topics:
        creating
        immutability
        common string methods

    Note: see also Lesson 3.2,
        Test equality between Strings and other objects using == and equals()
 */

import java.util.Date;

public class Lesson2 {

    public static void main(String... args) {
        String String = "String String is valid!";

        /*
            Strings are immutable
         */
        String myString = new String("Hello");
        String myString2 = myString;    // myString and myString2 point to same object
        myString += " World!";          // myString now points to new object
        System.out.println("Strings the same: " + (myString == myString2));

        String a = "1";
        String b = a.concat("2");
        b.concat("3");
        System.out.println(b); // 12, not 123

        /*
            null works unusually
         */
        String s = null;
        s += " yo";
        System.out.println(s); // "null yo" , not " yo"

        /*
            Although strings are immutable, it is common to chain methods
         */
        String result = "HeLlO ".trim().toLowerCase().replace('e', 'E');
        System.out.println(result);

        /*
            A few ways to create a string - not exhaustive
         */
        String s1 = "Hello, World";
        String s2 = new String("a string");
        String s3 = new String(new StringBuilder());
        String s4 = new String(new char[]{'a','b','c'});

        String plus = "Hello, " + "World";
        System.out.println(plus);
        String concat = plus.concat("!  ");
        System.out.println("concat(): " + concat);
        String trim = concat.trim();
        System.out.println("trim(): " + trim);
        String removeOs = trim.replace("o","0");
        System.out.println("replace(): " + removeOs);
        int len = removeOs.length(); // note the ()
        System.out.println("length(): " + len);

        /*
            .substring(n) is from n index to the end of the string (inclusive)
            .substring(n,m) is from n index up to m (exclusive)
            .substring(n,n) is empty string
            .substring(m,n) is an exception where m is greater than n
         */
        String hello = removeOs.substring(0,5);
        System.out.println("hello: " + hello);

        /*
            java.lang.StringIndexOutOfBoundsException if index not valid
         */
        char firstChar = removeOs.charAt(0);
        System.out.println("First character: " + firstChar);

        // object.toString() is a commonly used
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
        System.out.println("indexOf(): " + index);

        /*
            Also:
            boolean .startsWith
            boolean .endsWith
            boolean .contains
            https://docs.oracle.com/javase/7/docs/api/index.html?java/lang/String.html
         */

        /*
            You may come across the intern() method, which I never used in my life.
            See https://dzone.com/articles/string-interning-what-why-and
            Normally the two strings below would result in false when using ==
            intern treats them as constants
         */
        String i1 = new String("hello");
        String i2 = new String("hello");
        if(i1 != i2) {
            System.out.println("Strings not equal");
        }
        if(i1.intern() == i2.intern()) {
            System.out.println("Strings equal");
        }


    }
}
