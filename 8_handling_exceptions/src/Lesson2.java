/*
    8.2 Create a try-catch block and determine how exceptions alter normal program flow
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lesson2 {
    private String FILENAME = "filename.txt";

    private void tryCatchFinally() {
        /*
            try is the happy path
            it requires either or both of catch, finally
         */
        try {
            Scanner in = new Scanner(new FileReader(FILENAME));
        }
        catch(IOException ioe) { //specific exception
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

    public static void main(String[] args) {
        Lesson2 lesson2 = new Lesson2();
        lesson2.tryCatchFinally();

        try {
            lesson2.throwsException();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

        lesson2.throwException();

    }
}
