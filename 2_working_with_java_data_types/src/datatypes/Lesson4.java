/*
    2.4 Explain an Object's Lifecycle (creation, "dereference by reassignment"
    and garbage collection)
*/
package datatypes;

import java.util.Date;

public class Lesson4 {

    public static void main(String... args) {
        Date date1 = new Date(); // one reference to object
        Date date2 = date1; // two references to object

        date1 = null; // one reference to object

        /*
            at end of method, date2 is no longer in scope
            and therefore object is eligible for garbage collection
        */
    }

}
