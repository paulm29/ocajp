import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/*
    Try with resources can be used with class that implement
    auto-closeable. A finally block is inserted by the compiler and the
    resource closed.
 */
public class TryResources {
    /*
        right-click => Copy Path to get file location in IDEA
     */
    private static final String FILENAME = "C:\\projects\\ocajp\\8_handling_exceptions\\src\\filename.txt";

    public static void main(String[] args) throws Exception {
        try ( BufferedReader br = new BufferedReader(new FileReader(FILENAME)); ) {
            String s = br.readLine();
            System.out.println(s);
        }
        catch (IOException ioe) {
            /*
                Exception with message and 'cause' as ioe
             */
            throw new Exception("An exception occurred",ioe);
        }
    }
}
