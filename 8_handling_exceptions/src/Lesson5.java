import java.util.ArrayList;
import java.util.List;

/*
    8.5 Recognize common exception classes (such as NullPointerException,
    ArithmeticException, ArrayIndexOutOfBoundsException, ClassCastException)
 */
public class Lesson5 {
    /*
        Throwable is the base class
     */

    /*
        Errors:
        - AssertionError: when assertions turn on and used
        - OutOfMemoryError: too many objects created and not GC'ed
        - StackOverflow: too much recursion
        - ExceptionInIntitalizerError
     */
    private static void errors() {

    }

    /*
        Checked Exception:
        - IOException: base class for many file-related exceptions. Often coded
            by programmer.
            - FileNotFoundException
        - SOAPException
        - SQLException
        - URISyntaxException
        - XMLParseException
     */
    private static void checkedExceptions() {

    }

    /*
        Unchecked/Runtime Exceptions:

        - ArithmeticException: division by zero or modulus
        - ArrayIndexOutOfBoundsException: array not large enough for index
        - ArrayStoreException: array cannot store type of object. e.g. below
        - ClassCastException: inappropriate cast
        - IllegalArgumentException: user-defined exception for then caller
            passes invalid arguments to a method
        - NullPointerException: object is null, but method called on it
        - NumberFormatException: when parsing values of incompatible types, often
            user defined
     */

    private static void runtimeExceptions() {
         /*
            NullPointerException
         */
        List<Integer> heights = new ArrayList<>();
        heights.add(null);
        int h = heights.get(0);

        /*
            ArrayStoreException
         */
        String[] strings = { "stringValue" };
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        //againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
        objects[0] = new StringBuilder(); // ArrayStoreException

        /*
            NumberFormatException
         */
        int bad1 = Integer.parseInt("a"); // primitive
        Integer bad2 = Integer.valueOf("123.45"); // Wrapper class
    }

    public static void main(String[] args) {
        runtimeExceptions();
    }
}
