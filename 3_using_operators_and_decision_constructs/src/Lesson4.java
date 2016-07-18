/**
    3.4 Use a switch statement
     Topics:
         Supported data types and values
         case, break and default
 */
/*
Here are the rules for a switch statement:
        1. Only String, byte, char, short, int, (and their wrapper classes Byte, Character, Short, and Integer), and enums can be used as types of a switch variable. (String is allowed only since Java 7).
        2. The case constants must be assignable to the switch variable. For example, if your switch variable is of class String, your case labels must use Strings as well.
        3. The switch variable must be big enough to hold all the case constants. For example, if the switch variable is of type char, then none of the case constants can be greater than 65535 because a char's range is from 0 to 65535.
        4.  All case labels should be COMPILE TIME CONSTANTS.
        5. No two of the case constant expressions associated with a switch statement may have the same value.
        6. At most one default label may be associated with the same switch statement.
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
