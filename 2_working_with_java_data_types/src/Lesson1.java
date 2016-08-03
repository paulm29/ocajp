/**
    2.1 Declare and initialize variables (including casting of primitive data types)
    Topics:
    Naming variables
    Number systems
    Primitive types
    Declarations
    Initializing variables
    Widening and narrowing
    Casting
    Note: Strings covered later under Creating and Manipulating Strings
 */

public class Lesson1 {
    public static void main(String[] args) {
        naming();
        numberSystems();
        primitiveTypes();
        declarations();
        initializingVariables();
        WideningAndNarrowing.wideningAndNarrowing();
        Casting.casting();
    }

    /*
        Variables must start with: _, $, or letter
        Other characters may be: _, $, letters, numbers
    */
    public static void naming() {
        String _a;
        String $a;
        String a;
    }

    public static void numberSystems() {
        int decimal = 15;
        int binary = 0b00001111;    // or 0B
        int octal = 017;            // only from 0-7, no 8 or 9
        int hex = 0xF;             // or 0XEF
    }

    public static void primitiveTypes() {
        /*
            Only 2 values. Cannot use 0 or 1 like in other languages.
         */
        boolean bt = true;
        boolean bf = false;

        /*
             8 bits (1 byte)
             -128 to +127
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
            By default all whole number literals are int.
         */
        int i;

        /*
            64 bits
            +/- lots
         */
        long l;

        /*
            32 bits
         */
        float f = 10.0f; // need f or F, as double is default for decimals

        /*
            64 bits
         */
        double d = 10.0;
    }

    private static void declarations() {
        /*
            multiple variables of the same type can be declared
            on the same line
         */
        int x = 1, y = 2, z = x + y;

        /*
            The below is known as "chaining", where you use multiple = with no
            comma. You cannot do this while declaring variables, so
            int i = j = k = 9; is invalid
            This is valid however, because b and c are already declared:
            int  b = 0, c = 0;   
            int a = b = c = 100;
         */
        int i, j, k;
        i = j = k = 9;

        // int x2, int y2;      // compile error, interpreted as 2 different types
        // int x3 , String s;   // compile error

        /*
            Careful with this one. Only two is initialised; you will get a
            compile error if try to use one.
         */
        int one, two = 0;

        /*
            _ as a separator was added in Java 7. There are a few rules:
            - cannot appear at start or end
            - cannot appear either side of decimal point
         */
        // double notAtStart = _1000.00; // DOES NOT COMPILE
        // double notAtEnd = 1000.00_; // DOES NOT COMPILE
        // double notByDecimal = 1000_.00; // DOES NOT COMPILE
        double legal = 1_00_0.0_0; // this one compiles

        int multiple = 1___00; // multiple underscores are legal

        /*
            Null cannot be used with primitives, only objects like Strings
            int value = null; // DOES NOT COMPILE
            String s = null;
         */
    }

    private static void initializingVariables() {

        /*
            Initializing variables:
            - local variables must be initialised before use
            - c;ass and instance variables are given a default value:
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
            - local variables can NOT be initialised within conditional code
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

/*
    - Widening is also known as Promotion, and occurs when two data
    types are different.
    - Narrowing is the opposite. Note that literal values and constants (final
      variables) are treated different to variables
 */
class WideningAndNarrowing {

    public static void wideningAndNarrowing() {
       /*
            Assigning values to smaller data types
            Note:
            - whole values without a suffix are int
             - decimal values without a suffix are double
             Use a suffix, such as L or F to change defaults
         */
        short choppedOff = 32000; // short data with int value, okay as in range, no cast needed

        /*
            The following causes an error because the value is an int
            literal (by default) and number is too great for an int
         */
        //long max = 3123456789; // DOES NOT COMPILE
        long max = 3123456789L;

        // float fail = 3.0; // error, because double values not compatible with float
        float success = 3.0f; // explicit cast works though, this or
        float success2 = (float)3.0; // this


        /*
            Unary operators result in the same data type
         */
        short s = 1;
        s++;
        getType(s); // short

        /*
            int and long
         */
        int x = 1;
        long y = 33;
        getType(x * y); // long

        /*
            double and float
         */
        double x1 = 39.21;
        //float y1 = 2.1; // compile error
        float y1 = 2.1f;
        getType(x1 * y1); // double

        /*
            short
         */
        short x2 = 10;
        short y2 = 3;
        getType(x2 * y2); // integer, because short values promoted to int

        short result = (short)(x2 * y2); // needs cast

        /*
            short, float, double
         */
        short x3 = 14;
        float y3 = 13; // does compile, because int literal promoted to float
        double z3 = 30;

        /*
            trick question.
            This looks invalid at first glance, as seems that boolean being
            assigned to long. However, it is not ==, just assignment and
            valid
         */
        long x4 = 5;
        long y4 = (x4=3);
        System.out.println(x4); // Outputs 3
        System.out.println(y4); // Also, outputs 3
    }

    public static void getType(Object o) {
        System.out.println(o.getClass().getName());
    }

}

/*
    Explicit casting is required when 'narrowing' types, i.e.
    trying to put a value from a larger type into a smaller type.
    Literals that fit into the range of the smaller types will not require a
    cast. However literals that exceed the range, and expressions, will require
    an explicit cast.

    Remember that whole number literals are stored as int by default.
 */
class Casting {

    public static void casting() {
        /*
            byte has range -128 to 127
         */
        byte b = -128; // int literal in range, no cast required
        byte b2 = (byte)128; // int literal exceed range, cast required

        byte b3 = 126;
        byte b4 = 1;
        byte b5 = (byte)(b3 + b4); // b4 and b4 promoted to int, cast required

        byte b6 = 126;
        byte b7 = (byte)(b6 + 1); // b6 and 1 promoted to int, cast required
    }
}