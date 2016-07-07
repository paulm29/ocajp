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
        - ArrayStoreException: array cannot store type of object
     */

    public static void main(String[] args) {

    }
}
