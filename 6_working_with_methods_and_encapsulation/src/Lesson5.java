/*
    6.5 Apply encapsulation principles to a class
 */
/*
    This is mainly about:
    - making instance variables private, only accessible through public methods
    - public or private constants (final or static final) for immutable values
     - protected for this package and subclass access

     JavaBeans naming conventions:
     - Properties are private
    - Getter methods begin with "is" if the property is a boolean.
    - Getter methods begin with "get" if the property is not a boolean.
    - Setter methods begin with set.
    - The method name must have a prefix of set/get/is, followed by the first
    letter of the property in uppercase, followed by the rest of the property name.
 */
public class Lesson5 {
    private boolean gotFan;

    public boolean isGotFan() {
        return gotFan;
    }

    public void setGotFan(boolean gotFan) {
        this.gotFan = gotFan;
    }

    private int x;

    public static final String CONSTANT = "constant";

    public void setX(int x) {
        /*
        You might optionally validate the x value
        to ensure integrity of this class.
        e.g. might check that it is in a certain range
        and throw new IllegalArgumentException("Bad!")
         */

        this.x = x;
    }

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        Lesson5 lesson5 = new Lesson5();
        lesson5.setX(100);
        lesson5.setGotFan(true);
    }
}
