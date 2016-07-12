/*
    3.4 Use a switch statement
 */
public class Lesson4 {


    public static void main(String... args) {

        /*
            Switch data types: byte, short, char, int, String, enum
            and related wrapper classes: Byte, Short, Character, Integer.

            Not supported: boolean, long, float, double, and associated
            wrappers.

            The values for case should be literals or constants (final variables)
            of the same type, or enum. They cannot be variables.

            Break is needed to stop executing 'falling through'.
            Break should nearly always be used

            default should always be used. It doesn't have to be the last case
        */

        int num = 2;
        //int num = 5; // will use default
        switch(num) {
            case 1:
            case 2:
                System.out.println("2");
                //break;
            case 3:
                System.out.println("3");
                System.out.println("Either  1, 2 or 3");
                //break;
            case 4:
                System.out.println("3");
                break;                      // break here
            default:
                System.out.println("default");
                break;
        }



    }
}
