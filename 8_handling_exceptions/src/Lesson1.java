import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
    8.1 Differentiate among checked exceptions, unchecked exceptions, and Errors

    Checked exceptions: problems in the environment; should allow program to
    continue.

    Runtime exceptions and Errors: unchecked; should not happen; don't recover

    Hierarchy:
        - Error
        - Exception
            - Checked
                - IOException
                - SQLException
            - Runtime
                - NullPointerException
                - ClassCastException
                - IndexOutOfBoundsException
                - NumberFormatException
 */
public class Lesson1 {

}
