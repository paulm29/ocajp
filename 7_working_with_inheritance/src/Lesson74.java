/*
    7.4 Use super and this to access objects and constructors
 */
public class Lesson74 {
    int num;
    String greeting = "Hello";

    /*
        Add a number to existing number, plus one
     */
    public void addNumberPlusOne(int num) {
        //num += ++num;     // incorrect
        this.num += ++num;  // correct
    }

    public String getGreeting() {
        return greeting;
    }

    public Lesson74(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        Lesson74 lesson74 = new Lesson74(0);
        lesson74.addNumberPlusOne(2);

        Subclass subclass = new Subclass();
        subclass.sayGreeting();
    }
}

class Subclass extends Lesson74 {

    public void sayGreeting() {
        System.out.println(super.getGreeting() + " World!");
    }

    /*
        superclass has no default constructor, so
        we need to define one and call super() ourselves
     */
    public Subclass(int num) {
        super(num); // call superclass constructor
        System.out.println("Creating subclass");
    }

    public Subclass() {
        // System.out.println("Creating subclass"); // this or super must be first
        this(0);    // call other constructor
        System.out.println("Creating subclass");
    }


}
