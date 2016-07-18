/**
    3.1 Use Java operators; including parentheses to override operator precedence
    Topics:
        operators, operands and expressions
        arithmetic operators and operator predecence
        String concatenation using +
        Promoting operands
        increment and decrement
        Shift operators
        Comparison operators
        Logical operators, including short-circuited
        Assignment operators
        Other operators
 */
public class Lesson1 {

    public static void main(String[] args) {
        part1(); // operators, operands and expressions
        part2(); // arithmetic operators and operator precedence
        part3(); // String concatenation using +
        part4(); // Promoting operands
        part5(); // Increment and Decrement
        part6(); // Shift operators
        part7(); // Comparison operators
        part8(); // Logical operators
        part9(); // Assignment operators
        part10(); // Other operators: instanceof, dot, []
    }

    /*
        3.1.1 operators, operands and expressions
     */
    public static void part1() {
         /*
            Three types of operators:
            - infix: expr <op> expr, e.g. 2 + 2
            - prefix: <op> expr, e.g. -5
            - postfix: expr <op>, e.g. i++

            Java has operator overloading predefined
            no programmer-defined
         */

        // infix
        int a = 2 * 2;

        // prefix
        System.out.println(-a); // -4
        System.out.println(++a); // 5; increment a, then get value

        // postfix
        System.out.println(a--); // 5; get value of a, then decrement

        System.out.println(a); // 4
    }

    /*
        3.1.2 arithmetic operators and operator precedence
     */
    public static void part2() {
        /*
            Operators:
            + add
            - substract
            * multiply
            % modulo
         */

        /*
            modulo
         */
        int num = 3;
        if (num % 2 == 0) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }

        /*
            Precedence
            ---
            Brackets: ( )
            Post-unary: n++ n--
            Pre-unary: ++n --n
            Other Unary: +n -n !n
            * / %
            + -
            Relational: <, >, <=, >=, instanceof
            Equal to/not equal to ==, !=
            Logical operators &, ^, |
            Short-circuit logical operators &&, ||
            Ternary ?
            Assignment operators = += etc.
         */


        int x = 3;
        int y = ++x * 5 / x-- + --x;
        // same as y = 4 * 5 / 4 + -2
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }

    /*
        3.1.3 String concatenation using +
     */
    public static void part3() {
        /*
            + with Strings
         */
        int b = 3; // b will be converted to a String
        System.out.println("A string " + b);
        System.out.println("Hello " + 1 + 2); // all a String
        System.out.println(1 + 2 + " Hello"); // 3 Hello
    }

    /*
        3.1.4 Promoting operands
     */
    public static void part4() {

        /*
            Numeric Promotion Rules
            1. Java automatically promotes values to the larger data type
            3. byte, short, and char, are first promoted to int
            4. After all promotion has occurred and the operands have the same data
                type, the resulting value will have the same data type as its
                promoted operands.
         */
        /*
            By default, whole number literals are ints and decimal numbers
            are double.
            Results of operators are only:
            - int
            - long
            - float
            - double
            so, for example:
            - short + short = int
            - short + byte = int

            if either 2 operands are:
                double => double
                float => float
                long => long
                int => int
         */
        short s = 99;
        byte b2 = 10;
        //s = s + b2; // compiler error, incompatible types, int required

        /*
            An exception are the compound assignment operators: += -= -- ++
            They result in the same data type as the original operand
         */
        short s1 = 1;
        short s2 = ++s1;

        long x = 10;
        int y = 5;
        y *= x;
    }

    /*
        3.1.5 increment and decrement
     */
    public static void part5() {
        /*
            Increment and Decrement
            Remember prefix and postfix forms:
            ++a
            a++
         */
        for(int i = 0; i < 5; i++) {
            System.out.println();
        }

        for(int j = 5; j > 0; j--) {
            System.out.println(j);
        }

        int k = 4;
        System.out.println(++k); // 5; increment k, then get value
        System.out.println(k--); // 5; get value of k, then decrement
        System.out.println(k); // 4

        if(k++ > 4) {
            System.out.println("Number is > 4");
        }
        else {
            System.out.println("Number is not > 4"); // this will run
        }

        if(++k > 5) {
            System.out.println("Number is > 5"); // this will run
        }
        else {
            System.out.println("Number is not > 5");
        }

        /*
            Tricky one:
            The following is true because the square array brackets
            act as normal brackets, meaning evaluate it first
         */
        int[] xa = {0,1,2,3,4};
        int idx = 0;
        System.out.println("Value is " + (xa[idx++] >= 0 && idx > 0));

        /*
            Another tricky one:
            Increment and decrement values are NOT automatically promoted
            e.g. to int
         */
        short t = 10, u = 0;
        u = ++t; // short is okay, no compiler error because int is NOT expected
    }

    /*
        3.1.6 Shift operators
     */
    public static void part6() {
        /*
            Shift operators
            Unlikely to be in exam, but just in case
         */
        System.out.println(1 << 1); // 2, move 1 to next left binary column
        System.out.println(1 << 2); // 4
        System.out.println(32 >> 2); // 8

        /*
            There are also the unsigned bitshift operators
            which assume the left-most bit of a byte
            is the most significant, and ignores that fact

            No code below, because extra unlikely to be on exam
         */
    }

    /*
        Comparison operators
     */
    public static void part7() {
        /*
            < <= > >=
            == !=

            The object types also can use these:
            Byte, Short, Character, Integer, Long, but not Number (generalised type)
         */

        /*
            Be careful with == when using object types.
            Unboxing does not occur, so reference equality, not primitive equality
         */
        Integer i1 = new Integer(12345);
        Integer i2 = new Integer(12345);
        System.out.println((i1 == i2)); // false

        // However
        Integer i3 = 1;
        Integer i4 = 1;
        System.out.println((i3 == i4)); // true
    }

    /*
         Logical operators, including short-circuited
     */
    public static void part8() {
        /*
            ! NOT
            & AND
            | OR
            ^ Exclusive OR (1 true, but not both)

            Short-circuit Boolean operators:
            Going from left to right, if the first part is false, do not bother
            evaluating the rest of the expression, as it will never be not false;
            &&
            ||
            These are useful for checking whether an object is null BEFORE
            examining other properties, to avoid a NullPointerException

            Bitwise operators (shouldn't be on exam)
            ~ bitwise NOT
         */

        /*
            Trick code: 2nd part of expression is short-circuited,
            so x is 6, not incremented
         */
        int x = 6;
        boolean y = (x >= 6) || (++x <= 7);
        System.out.println(x);
    }

    /*
        3.1.9 Assignment operators
     */
    public static void part9() {
       /*
        Shortcut declarations and assignments
        */
        int x1,y1,z1;
        x1 = y1 = z1 = 0;

        x1 += 6;
        /*
            Assignment operators:
            += -= *= /=
            %=
            &= |= ^=
            <<= >>= >>>=
         */

        /*
            += type operators can be more efficient and preventing bugs.
            e.g.
            getArray()[x++] = getArray[x++] + 100; // won't work as intended
            getArray()[x++] += 100; // more efficient and correct result
         */

        /*
            Assignment compatability

            Widening is fine:
            byte => int
            short => int
            etc.
            NOT byte => char, or short => char, because char has no negative
            values

            Narrowing requires cast
         */
        byte ba = 100;
        short sa = 12_345; // _ is a readability separator, like ,
        sa = ba;
        int ia = ba;
        int ya = sa;

        /*
            Note that converting to decimal types may lose precision, e.g.
         */
        long l = 9_000_000_000_000_000_512L;
        double d = l;
        System.out.println(d); // lose the 512

        /*
            Narrowing requires cast
            Only numeric types can be cast
         */
        int ib = 100;
        byte bb = (byte) ib;

        /*
            Cast operator has highest precedence
         */
        //byte bc = (byte) 1230 - 100; // error
        //System.out.println(bc);
        byte bd = (byte)(1230 - 100); // will get the intended answer
        System.out.println(bd);

        /*
            Ternary operator
            ? <byte> : <long> => long
            ? <float> : <double> => double
            ? <byte> : <int> => int
         */
        boolean result = (2 > 1) ? true : false; // true
        long la = (false) ? 100L : 0; // 0

        /*
         Ternary operator can return different data types, although be
         careful with variable assignments
          */
        System.out.println((y1 > 5) ? 21 : "Zebra");
        //int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE

        /*
            Be careful, because one branch won't run
         */
        int y2 = 1;
        int z2 = 1;
        final int x2 = y2<10 ? y2++ : z2++;
        System.out.println(y2+","+z2); // Outputs 2,1
    }

    /*
        3.1.10 Other operators
     */
    public static void part10() {

        /*
            - instanceof
            - dot (no code below)
            - [] subscript operator (no code below, but can act as () for operator
               precedence)
         */
        Integer iobj = new Integer(99);
        boolean isObject = iobj instanceof Object ? true : false; // true
        System.out.println(isObject);
        boolean isObject2 = null instanceof Object ? true : false; // false
        System.out.println(isObject2);
        boolean isNumber = iobj instanceof Number ? true : false; // true
        System.out.println(isNumber);
    }


}
