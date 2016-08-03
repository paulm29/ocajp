/*
    8.1 Differentiate among checked exceptions, unchecked exceptions, and Errors

    Programs have a 'happy' path (try block) and a 'sad' path that deals with
    exceptions (catch block or throws).
    Programs must 'declare or handle' exceptions.

    Checked exceptions: problems in the environment; should allow program to
    recover and continue, e.g file not found or bad user input

    Runtime exceptions: unchecked; should not happen; don't recover; code needs
    to be debugged

    Error: problems in the environment, which are severe. e.g. run out of memory

    Hierarchy:

    Throwable
        - Error
            - OutOfMemoryError
        - Exception
            - (Checked - extends Exception)
                - IOException (used by programmer)
                - SQLException
            - RuntimeException
                - ClassCastException
                - IndexOutOfBoundsException
                - NullPointerException
                - NumberFormatException (used by programmer)
                - IllegalArgumentException (used by programmer)
                - IllegalStateException (used by programmer)
                - SecurityException (used by programmer)
*/

public class Lesson1 {

}
