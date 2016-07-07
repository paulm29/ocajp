import java.io.IOException;

/*
    8.4 Create and invoke a method that throws an exception
 */
public class Lesson4 {

    // same as method from lesson 1
    private void throwException() {
        try {
            throw new Exception("bad!");
        }
        catch(Exception e) {
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
