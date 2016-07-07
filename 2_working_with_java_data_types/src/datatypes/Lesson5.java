/*
    2.5 Develop code that uses wrapper classes such as Boolean, Double, and Integer.

    Was: Call methods on objects
 */
package datatypes;

public class Lesson5 {

    public void doStuff(String s) {
        System.out.println("Hello, " + s);
    }

    /*
    // Must change name, as change in return type is not overloading
    public String doStuff(String s) {
        return "Hello, " + s;
    }
    */
    public String doStuff2(String s) {
        return "Hello, " + s;
    }

    /*
        doStuff overloaded with different parameter, same return type
        Return type doesn't count for overloading
        Having same types, but different order, does count
     */
    public void doStuff(int i, long l) {

    }

    public void doStuff(long l, int i) {

    }


    public static void main(String[] args) {
        Lesson5 lesson5 = new Lesson5();
        lesson5.doStuff(5,5L); // this is okay

        /*
        this is ambiguous, as unsure which argument to promote,
        long or int
         */
        // lesson5.doStuff(5,5);

        lesson5.doStuff("Paul");

        Child child = lesson5.new Child();
        child.doStuff("Paul");
    }

    class Child extends Lesson5 {

        /*
            Override provides different implementations of
            a certain method
         */
        @Override
        public void doStuff(String s) {
            System.out.println("Greetings, " + s);
        }

    }
}
