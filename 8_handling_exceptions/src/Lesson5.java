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
     */

    /*
        Checked Exception:
        - IOException: base class for many file-related exceptions
        - SOAPException
        - SQLException
        - URISyntaxException
        - XMLParseException
     */

    /*
        Uncheck/Runtime Exceptions
        - NullPointerException: object is null, but method called on it
        - ArithmeticException: division by zero or modulus
        - ArrayIndexOutOfBoundsException: array not large enough for idnex
        - ClassCastException: inappropriate cast
        Others:
        - ArrayStoreException: array cannot store type of object. e.g. below
        - NumberFormatException: when parsing values of incompatible types
     */

    public static void main(String[] args) {

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
}
