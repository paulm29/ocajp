/**
    3.2 Test equality between Strings and other objects using == and equals ()
     Topics:
         String literals vs String objects
         Which objects implement equals(), and those that only provide reference equality
 */
import java.util.ArrayList;

public class Lesson2 {

    public static void main(String[] args) {
        /*
            String literals using the 'String pool' so refer to the same
            object on the heap
         */
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);       // true
        System.out.println(s1.equals(s2));  // true

        /*
            String objects do not use string pool, so are different
         */
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s3 == s4);       // false
        System.out.println(s3.equals(s4));  // true

        /*
            Unlike String, StringBuilder does not implement equals(), therefore
            reference equality is used instead.

            Likewise, ArrayList implements equals, but arrays do not.
         */
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(sb1 == sb2);        // false
        System.out.println(sb1.equals(sb2));   // false

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello");
        System.out.println(list1 == list2);        // false
        System.out.println(list1.equals(list2));   // true

        String[] array1 = {"Hello"};
        String[] array2 = {"Hello"};
        System.out.println(array1 == array2);        // false
        System.out.println(array1.equals(array2));   // false
    }
}
