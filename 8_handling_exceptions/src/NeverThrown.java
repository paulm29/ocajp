import java.io.*;

class al {

    public static void main(String[] args) {
        //main();
    }

    /*
        Compile error as never thrown
     */
    public static void main() {
        try {

        }
        /*
        catch (IOException ioe) { // compile error

        }
        */
        finally {

        }
    }

    /*
        However, it is okay in the throws clause
     */
    public static void main2() throws IOException {

    }

    /*
        Exception is okay, because it covers runtime exceptions too
    */
    public static void main3() {
        try {

        }
        catch (Exception e) {

        }
    }

    public static void main4() throws Exception {

    }
}