import java.util.Arrays;

/**
    4.1 Declare, instantiate, initialize and use a one-dimensional array
     Topics:
         Three ways of creating an array
         Populating an array using: braces, index, loop
         Array length and equality
        Utility methods: printing, copying, sorting, searching

    Note:
    - Declare: data type and variable name. e.g. int number;
    - Instantiate: create a new instance of a class, only applies to objects.
        e.g. new Object();
    - Initialize:
        - for objects: run instance initializers (if any), and constructor, setting
            the state of the objects variables.
        - for primitives: assign a value to a variable
 */
public class Lesson1 {

    public static void  main(String... args) {
        String[] stringArray = new String[10];
        stringArray[0] = "Hi";
        stringArray[3] = "Greetings";

        /*
            Square brackets can be next to variable name, but it is against convention
            Anonymous arrays take initial values.
         */
        int intArray[] = {1,2,3,4};
        System.out.println(intArray.length);

        /*
            This doesn't work though. Anonymous arrays must be instantiated when
            declared.
         */
        int[] intArrayA;
        //intArrayA = {1,2,3,4};

        /*
            A longer syntax using new type[] { }
         */
        boolean[] booleanArray = new boolean[] {true,false};

        /*
            The trailing comma is NOT a mistake!
            It is there for convenience of editing
         */
        int intArray2[] = {1,2,3,4,     };
        System.out.println(intArray2.length);

        /*
            Be careful with array declarations
            array is an int array
            single holds just an int
            twoDee holds a 2D array
         */
        int array[], single, twoDee[][];

        /*
            Two int arrays
         */
        int[] names, pets;

        /*
            Passing arguments to an array parameter
         */
        new Lesson1().printValues(new String[]{"Hi","There"});

        /*
            length of 'blank' array
            The array contains all null elements as it is for Strings. A blank
            int array would contain all zeroes.
         */
        String[] myStrings = new String[6];
        System.out.println(myStrings.length); // length is six, not 0

        //myStrings[myStrings.length] = "hi"; // ArrayIndexOutOFBounds exception
        myStrings[myStrings.length-1] = "hi"; // fine

        /*
            Array objects do not implement equals, so use reference equality.
            [Use ArrayList if you want to use equals()]
         */
        int[] a = {1,2,3};
        int[] b = a;
        int[] c = {1,2,3};
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        utilityMethods();
    }

    public static void utilityMethods() {
          /*
            Copying an array
            Could use a loop, but the below is preferred and more flexible
         */
        int intArray[] = {1,2,3,4};
        int[] newIntArray = new int[10];
        System.arraycopy(intArray,0,newIntArray,0,intArray.length);

        /*
            Java 5 provides the following for printing an array
        */
        System.out.println(java.util.Arrays.toString(intArray));

        /*
            Sorting an array
         */
        String[] strings = {"11","9","333"};
        java.util.Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        /*
            Searching an array
            The array must be sorted first, otherwise the result is unpredictable
            - Target element found: Index of match
            - Target element not found: Negative value showing one smaller than the
            negative of index, where a match needs to be inserted to preserve sorted
             order
         */
        int[] numbers = {9,11,333};
        System.out.println(Arrays.binarySearch(numbers,9));
        System.out.println(Arrays.binarySearch(numbers,12));
    }


    /*
        Can use this instead: System.out.println(java.util.Arrays.toString(c));
     */
    public void printValues(String[] stuffs) {
        for(String stuff : stuffs) {
            System.out.println(stuff);
        }
    }
}
