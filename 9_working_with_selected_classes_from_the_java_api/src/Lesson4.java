/**
    9.4 Declare and use an ArrayList of a given type
 */
import java.util.ArrayList;
import java.util.List;

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
        ArrayList<String> myListString = new ArrayList<String>();

        /*
            The empty diamond is okay in Java version 7 and above
         */
        ArrayList<String> myListString2 = new ArrayList<>();

        /*
            Using the interface.
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

    }
}
