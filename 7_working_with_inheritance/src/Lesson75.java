import lesson5.House;
import lesson5.Stark;
import lesson5.interfaces.TerminatorTransformer;

/*
 Use abstract classes and interfaces
 */
public class Lesson75 {

    public static void main(String[] args) {
        /*
            Abstract classes
         */
        //House house = new House(); // compile error, abstract class
        House stark = new Stark();
        stark.showBanner();

        /*
        Interfaces
         */
        TerminatorTransformer tt = new TerminatorTransformer();
        tt.transform();
        tt.locateJohnConnor();
    }
}
