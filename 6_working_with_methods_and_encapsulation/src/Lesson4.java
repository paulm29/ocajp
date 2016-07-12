/*
    6.4 Apply access modifiers
 */

import lesson4.Aclass;
import lesson4.Bclass;
import lesson4.other.Cclass;
import lesson4.other.Dclass;

    /*
        Accessibility, from most restrictive to least:
        - private: Accessible only to this class (and inner classes)
        - default (package): Accessible only to classes in same package
        - protected: Accessible to subclasses and classes in the same package
        - public: Accessible to all lesson4 classes
     */
public class Lesson4 extends Cclass {
    private String greeting = "Hello";

    public static void main(String[] args) {
        Lesson4 lesson4 = new Lesson4();
        InnerClass innerClass = lesson4.new InnerClass();

        Aclass a = new Aclass();
        // System.out.println(a.x); x is protected
        System.out.println(a.y); // y is public

        Bclass b = new Bclass();
        //System.out.println(b.x); // x has default access (package), compile error

        Cclass c = new Cclass();
        System.out.println(lesson4.x); // inherited from c

        /*
            class D can access protected x value in Cclass
            because in same package
         */
        Dclass d = new Dclass();
        d.getCxvalue();

    }

    class InnerClass {

        /*
            private field greeting available in inner class
         */
        public InnerClass() {
            System.out.println(greeting);
        }
    }
}
