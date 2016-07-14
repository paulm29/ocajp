/*
    2.1 Declare and initialize variables (including casting of primitive data types)
 */

public class Lesson1
{
    public void doStuff() {
        /*
            Variables must start with: _, $, or letter
            Other characters may be: _, $, letters, numbers
         */

        /*
            Only 2 values. Cannot use 0 or 1 like in lesson4 languages.
         */
        boolean bt = true;
        boolean bf = false;

        /*
             8 bits
             -128 to +127
             XXXX after \ u
         */
        byte b = 0b00001111;

        /*
            16 bits (2 bytes)
            0 to 65,535 (positive only)
         */
        char c = 'C';
        char c2 = '\u555C'; // unicode Chinese character, xi
        char newline = '\n';
        /*
            Other characters:
            \b Backspace
            \t tab
            \n linefeed
            \f form feed (page break)
            \r carriage return
            \" double quote
            \' single quote
            \\ backslash
         */

        /*
            16 bits (2 bytes)
            -32768 to +32767
         */
        short s;

        /*
            32 bits
            +/- ~2 billion
         */
        int i;
        /*
            64 bits
            +/- lots
         */
        long l;

        /*
            multiple variables of the same type can be declared
            on the same line
         */
        int x = 1, y = 2, z = x + y;

        /*
            Careful with this one. Only two is initialised; you will get a
            compile error if try to use one.
         */
        int one, two = 0;

        /*
            Values can be written in decimal, octal, hexadecimal and binary
         */
        int decimal = 1234;
        int octal = 077; // only from 0-7, no 8 or 9
        int hexadecimal = 0xCAFE;
        int binary = 0b11011;

        /*
            Assigning values to smaller data types
            Note:
            - whole values without a suffix are int
             - decimal values without a suffix are double
             Use a suffix, such as L or F to change defaults
         */
        short choppedOff = 32000; // short data with int value, okay as in range, no cast needed

        /*
            The following caues an error because the value is an int
            literal (by default) and number is too great for an int
         */
        //long max = 3123456789; // DOES NOT COMPILE
        long max = 3123456789L;

        // float fail = 3.0; // error, because double values not compatible with float
        float success = 3.0f; // explicit cast works though, this or
        float success2 = (float)3.0; // this



        /*
            32 bits
         */
        float f = 10.0f; // need f or F, as double is default for decimals

        /*
            64 bits
         */
        double d = 10.0;


        /*
            _ as a separator was added in Java 7. There are a few rules:
            double notAtStart = _1000.00; // DOES NOT COMPILE
            double notAtEnd = 1000.00_; // DOES NOT COMPILE
            double notByDecimal = 1000_.00; // DOES NOT COMPILE
            double annoyingButLegal = 1_00_0.0_0; // this one compiles
         */

        /*
            Null
            int value = null; // DOES NOT COMPILE
            String s = null;
         */

        /*
            Initializing variables:
            - local variables must be initialised before use
            - instance variables are given a default value:
                boolean => false
                byte, short, int, long => 0
                float, double => 0.0
                char => '\u0000' (NUL)
                String and lesson4 objects => null

                Note: values are of the associated type, not the defaults
                of int and double (for whole numbers and decimals), as per
                normal declaration
         */

        /*
            - local variables cannot be initialised within conditional code
            as there is a chance that they won't be initialised
         */
        int someNumber;
        String today = "Wednesday";

        if(today.equals("Thursday")) {
            someNumber = 1;
        }
        //System.out.println(someNumber); will cause error

        /*
            static variables are initialized as soon as the class is created
            and last the entire program
         */
    }
}
