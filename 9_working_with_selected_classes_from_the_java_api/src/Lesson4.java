/**
    9.4 Declare and use an ArrayList of a given type
    Topics:
        creating an ArrayList
        common methods
 */
import java.util.*;

public class Lesson4 {

    public static void main(String... args) {
        /*
            Arrays are inconvenient because of their fixed size,
            which means you need to use System.arraycopy() if you need to
            enlarge. ArrayList are a solution.
         */
        ArrayList myList = new ArrayList();

        /*
            With generics, which are not on Associate exam.
            Without generics, you need to cast like below, as
            elements are assumed to just be Objects, which allows you
            to: myList.add(<any subtype of object>);
            String s = (String)myList.get(0);
         */
        ArrayList<String> myListString = new ArrayList<>();
                           // same as: = new ArrayList<String>();

        /*
            The empty diamond is okay in Java version 7 and above
         */
        ArrayList<String> myListString2 = new ArrayList<>();

        /*
            So is just using generics on one side of a declaration
         */
        ArrayList<String> myListString3 = new ArrayList();

        /*
            Using the List interface.
         */
        List<String> myListImpl = new ArrayList<String>();

        myList.add("Hello");
        int size = myList.size();
        System.out.println("Size: " + size);
        myList.remove("Hello");
        myList.add("Hello");
        myList.add("there");
        myList.add("world");
        myList.remove(1);
        System.out.println("Size: " + myList.size());

        System.out.println(myList.get(0));
        myList.set(0,"Gidday");
        System.out.println(myList.toString());

        if(myList.contains("world")) {
            int index = myList.indexOf("world");
            System.out.println("Index: " + index);
        }

        myList.clear();
        System.out.println("Empty: " + myList.isEmpty());

        /*
            Arrays.asList can be used to created an 'array-backed' List.
            Array-backed means the array changes as the list changes.
            It has a fixed size, like the array, so you cannot add or remove elements,
            but you can change them.
         */
        List arrayBacked = Arrays.asList(new Object[]{"c","b","a"});
        // alternatively, using vararg array
        arrayBacked = Arrays.asList("c","b","a");

        /*
            Convert list to array
         */
        Object[] array = arrayBacked.toArray();
        // alternatively, with a type and size of 0 which accommodates all elements
        array = arrayBacked.toArray(new String[0]);

        /*
            Sort ArrayList
         */
        Collections.sort(arrayBacked);
        System.out.println("sorted array: " + arrayBacked);

        /*
            Remove element using Predicate and Lambda expression
         */
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.removeIf((Integer i) -> { return i >= 3; } );
        System.out.println(numbers);
    }
}
