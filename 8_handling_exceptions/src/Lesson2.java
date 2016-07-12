/*
    8.2 Create a try-catch block and determine how exceptions alter normal program
    flow
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lesson2 {
    /*
        right-click => Copy Path to get file location in IDEA
    */
    private static final String FILENAME = "C:\\projects\\ocajp\\8_handling_exceptions\\src\\filename.txt";


    private void tryCatchFinally() {
        /*
            try is the happy path
            it requires either or both of catch, finally
         */
        Scanner scanner = null;
        try {
             scanner = new Scanner(new FileReader(FILENAME));
        }
        catch(IOException ioe) { // specific exception
            /*
                IOException must be possible in try
             */
            ioe.printStackTrace();
        }
        catch(Exception e) { // broader exception
            e.printStackTrace();
        }
        finally {
            // runs after try and/or catch
            System.out.println("Finally");
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    /*
        "throws", not "throw"
     */
    private void throwsException() throws IOException, FileNotFoundException {
        Scanner in = new Scanner(new FileReader(FILENAME));
    }

    private void throwException() {
        try {
            throw new Exception("bad!");
        }
        catch(Exception e) {
            System.out.println("Caught exception thrown above");
            System.out.println(e.toString());
        }
    }

    /*
        Try with resources can be used with class that implement
        auto-closeable. A finally block is inserted by the compiler and the
        resource closed.
    */
    private void tryWithResources() throws Exception {

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME)); ) {
            String s = br.readLine();
            System.out.println(s);
        }
        catch (IOException ioe) {
            /*
                Have a catch in case there are problem auto-closing
                Exception with message and 'cause' as ioe
             */
            throw new Exception("An exception occurred",ioe);
        }
    }


    public static void main(String[] args) {
        /*
            Variations on try:
            - try + catch
            - try + finally
            - try + catch (1 or more) + finally
         */

        Lesson2 lesson2 = new Lesson2();
        lesson2.tryCatchFinally();

        try {
            lesson2.throwsException();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

        lesson2.throwException();

        try {
            lesson2.tryWithResources();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
