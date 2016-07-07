import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    Compare loop constructs
 */
public class Lesson4 {
    /*
        while vs do-while
        ---
        while: test first
        do-while: test last, runs at least one

        while vs for
        ---
        work the same, but for is more compact

        while vs enhanced for
        ---
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");

        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        String[] strings = {"c","d"};
        int i = 0;
        while(i < strings.length) {
            System.out.println(strings[i++]);
            //i++;
        }
    }
}