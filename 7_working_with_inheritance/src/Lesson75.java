/**
    7.5 Use abstract classes and interfaces
 */
import lesson5.House;
import lesson5.Stark;
import lesson5.interfaces.TerminatorTransformer;

public class Lesson75 {
/*
    Abstract Class Definition Rules:
    1. Abstract classes cannot be instantiated directly.
    2. Abstract classes may be defined with any number, including zero, of
        abstract and nonabstract methods.
    3. Abstract classes may not be marked as private or final.
    4. An abstract class that extends another abstract class inherits all of its
        abstract methods as its own abstract methods.
    5. The first concrete class that extends an abstract class must provide an
        implementation for all of the inherited abstract methods.

    Abstract Method Definition Rules:
    1. Abstract methods may only be defined in abstract classes.
    2. Abstract methods may not be declared private or final.
    3. Abstract methods must not provide a method body/implementation in the abstract
        class for which is it declared.
    4. Implementing an abstract method in a subclass follows the same rules for overriding a
        method. For example, the name and signature must be the same, and the visibility of
        the method in the subclass must be at least as accessible as the method in the parent
        class.
    */
    public static void main(String[] args) {
        /*
            Abstract classes
         */
        //House house = new House(); // compile error, abstract class
        House stark = new Stark();
        try {
            stark.showBanner();
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
            Interfaces
            - See TerminatorInterface for most of the notes
         */
        TerminatorTransformer tt = new TerminatorTransformer();
        tt.transform();
        tt.locateJohnConnor();
    }
}
