/**
    2.4 Explain an Object's Lifecycle (creation, "dereference by reassignment"
    and garbage collection)
    Topics:
        Referencing object on the heap
        Garbage collection
*/

import static java.lang.Thread.sleep;

public class Lesson4 {
    /*
        This reference will NEVER go out of scope, because it is static.
     */
    private static MyObject staticReference = new Lesson4().new MyObject(99);

    /*
        At end of method, the object reference is no longer in scope
        and therefore the object is eligible for garbage collection.
    */
    public void createMyObject() {
        MyObject myObject3 = new MyObject(3);
    }

    public static void main(String... args) throws InterruptedException {
        Lesson4 lesson4 = new Lesson4();
        MyObject myObject = lesson4.new MyObject(1);    // one reference to object
        MyObject myObject2 = myObject;   // two references to object

        myObject = null;                // one reference to object
        myObject2 = null;               // zero references to object

        lesson4.createMyObject();

        /*
            Suggest the garbage collector run; no guarantee that it will.
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

        /*
            Finalize runs zero or one times.
         */
        @Override
        protected void finalize() {
            System.out.println("Finalizing " + id);
        }
    }

}
