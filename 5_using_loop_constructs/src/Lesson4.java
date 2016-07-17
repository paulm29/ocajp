/**
    5.4 Compare loop constructs
    Topics:
        while vs do-while
        while vs for
        iterator vs for-each
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lesson4 {
    /*
        while vs do-while
        ---
        while: test first
        do-while: test last, runs at least one

        while vs for
        ---
        work the same, but for is more compact
     */
    public static void main(String[] args) {

        /*
            Old style iteration of collection using iterator()
            versus for-each
         */
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");

        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // much simpler!
        for(String s: list) {
            System.out.println(s);
        }

        /*
            Tricky way of using while
         */
        String[] strings = {"c","d"};
        int i = 0;
        while(i < strings.length) {
            System.out.println(strings[i++]);
            //i++;
        }
    }
}
