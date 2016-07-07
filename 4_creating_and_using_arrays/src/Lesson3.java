import java.util.ArrayList;
import java.util.List;

/*
    Declare and use an ArrayList of a given type
 */
public class Lesson3 {

    public static void main(String... args) {
        /*
            Arrays are inconvenient because of their fixed size,
            which means you need to use System.arraycopy() if you need to
            enlarge.
            ArrayList are a solution.
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
            This is okay in Java version 7 and above
         */
        ArrayList<String> myListString2 = new ArrayList<>();

        /*
            Using the interface. LinkedList is another type of list.
         */
        List<String> myListImpl = new ArrayList<String>();

        myList.add("Hello");
        myList.remove("Hello");
        myList.add("Hello");
        myList.add("there");
        myList.add("world");
        System.out.println(myList.size());
        myList.remove(0);
        System.out.println(myList.size());

        System.out.println(myList.get(0));
        myList.set(0,"Gidday");
        System.out.println(myList.toString());

        /*
            Other methods:
            myList.clear()
            .contains(item)
            .indexOf(item)
            .isEmpty()
            .remove(item)
            .remove(index)
            .size()
         */
    }
}
