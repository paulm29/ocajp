/*
    2.4 Explain an Object's Lifecycle (creation, "dereference by reassignment"
    and garbage collection)
*/
package datatypes;

import static java.lang.Thread.sleep;

public class Lesson4 {

    /*
        at end of method, object is no longer in scope
        and therefore object is eligible for garbage collection
    */
    public void createMyObject() {
        MyObject myObject3 = new MyObject(2);
    }

    public static void main(String... args) throws InterruptedException {
        Lesson4 lesson4 = new Lesson4();
        MyObject myObject = lesson4.new MyObject(1);    // one reference to object
        MyObject myObject2 = myObject;   // two references to object

        myObject = null;               // one reference to object
        myObject2 = null;               // zero references to objects

        lesson4.createMyObject();

        /*
            suggest the garbage collector run
          */
        System.gc();

        /*
            Allow time for the garbage collector to run
         */
        long second = 1000;
        long numSeconds = 1;
        sleep(numSeconds * second);
    }


    class MyObject {
        int id;

        MyObject(int id) {
            this.id = id;
        }

        @Override
        protected void finalize() {
            System.out.println("Finalizing " + id);
        }
    }

}
