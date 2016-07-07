/*
    Apply encapsulation principles to a class
 */
/*
    This is mainly about:
    - making instance variables private, only accessible through public methods
    - public or private constants (final or static final) for immutable values
     - protected for this package and subclass access
 */
public class Lesson5 {
    private int x;
    public static final String s = "constant";

    public void setX(int x) {
        /*
        You might optionally validate the x value
        to ensure integrity of this class.
        e.g. might check that it is in a certain range
        and throw new IllegalAgumentException("Bad!")
         */

        this.x = x;
    }

    public int getX() {
        return x;
    }

    public static void main(String[] args) {

    }
}
