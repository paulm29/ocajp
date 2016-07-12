package lesson5.interfaces;

public interface TerminatorInterface extends RobotInterface {
    void locateSarahConnor();

    void locateJohnConnor();

    /*
         - "public static final" is redundant, as all variables must have these
            properties
         - A value must be assigned a value immediately (no constructor or instance
            initializer)
      */
    public static final String MODEL = "T1000";

    /*
        New in Java 8
        static methods are good for factories; allows client to not know about
        classes that implement the interface
        Note: public is redundant
     */
    static TerminatorInterface getOne(int year) {
        if(year == 1984) {
            return new T800(); // original Arnie
        }
        else { // 1991
            return new T1000(); // quicksilver
        }
    }

    /*
        New in Java 8
        Default methods are similar to concrete methods in abstract classes
     */
    default void makeScaryFace() {
        System.out.println(">:");
    }

}
