package traps.p3;

import traps.p1.Movable;
import traps.p2.Donkey;

public class TestClass {
    public static void main(String[] args) {
        Movable m = new Donkey();
        m.move(10);
        m.moveBack(20);

        /*
            location from the interface is printed, NOT the instance variable
            in donkey, because the reference is of type Movable, not Donkey

            Variables are not polymorphic and use the class of the reference, not the class
            of the object, to determine accessibility.
         */
        System.out.println(m.location);

        Donkey d = (Donkey)m;
        System.out.println(d.location);
    }
}
