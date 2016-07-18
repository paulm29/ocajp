/*
    8.4 Create and invoke a method that throws an exception
 */
import java.io.IOException;

public class Lesson4 {

    /*
        Note: the catch block can catch different types of exceptions using |
        so long as those exception do not have a hierarchical relationship.
      */
    private void throwException() {
        try {
            throw new NullPointerException("bad!");
        }
        catch(NullPointerException | IllegalArgumentException e) {
            System.out.println("Caught exception thrown above");
            System.out.println(e.toString());
        }
    }

    private void throwException2 () throws Exception {
            throw new Exception("bad!");
    }

    public static void main(String[] args) throws Exception {
        Lesson4 lesson4 = new Lesson4();

        lesson4.throwException();

        lesson4.throwException2(); // main method bubbles up exception

    }
}
