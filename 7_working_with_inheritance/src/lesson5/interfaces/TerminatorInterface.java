package lesson5.interfaces;

public interface TerminatorInterface extends RobotInterface {
    void locateSarahConnor();

    void locateJohnConnor();

    /*
         - "public static final" is redundant, as all variables must have these
            properties
         - A value must be assigned a value immediately (no constructor or instance
            initializer)

         Note that if Aclass implements this interface, MODEL can be accessed in 3 ways:
         - Aclass.MODEL
         - new Aclass().MODEL
         - TerminatorInterface.MODEL
      */
    public static final String MODEL = "T1000";

    /*
        A value must be assigned to a variable immediately
     */
    //public static int SPEED;

    /*
        New in Java 8
        static methods are good for factories; allows client to not know about
        classes that implement the interface

         Note that if Aclass implements this interface, getOne can be accessed in 3 ways:
         - Aclass.getOne
         - new Aclass().getOne
         - TerminatorInterface.getOne
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
        Rules:
        1. A default method may only be declared within an interface and not within a
        class or abstract class.
        2. A default method must be marked with the default keyword. If a method is marked
         as default, it must provide a method body.
        3. A default method is not assumed to be static, final, or abstract, as it may be
         used or overridden by a class that implements the interface.
        4. Like all methods in an interface, a default method is assumed to be public and
         will not compile if marked as private or protected.
     */
    default void makeScaryFace() {
        System.out.println(">:");
    }

}
