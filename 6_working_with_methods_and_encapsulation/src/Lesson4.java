/**
    6.4 Apply access modifiers
 */
import lesson4.Aclass;
import lesson4.Bclass;
import lesson4.other.Cclass;
import lesson4.other.Dclass;
import lesson4.other.Eclass;

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
        // System.out.println(a.x); // x is private
        System.out.println(a.y);    // y is public

        Bclass b = new Bclass();
        //System.out.println(b.x); // x has default access (package), compile error

        Cclass c = new Cclass();
        // System.out.println(c.x); // x is protected
        /*
            Can access x only through reference to inherited subclass, as outside its
            package.
            The subclass doesn't really have 'access' to it, rather, it just inherits it.
            This is the HARDEST thing to understanding about access modifiers

            lesson4 can access x because it is a subclass
            However, we can't access Eclass.x because Eclass is inheriting x through the
            reference, not us. x in Eclass becomes private to us, because we are outside
            the package.
        */
        System.out.println(lesson4.x);

        Eclass eclass = new Eclass();
        //System.out.println(eclass.x); // compile error

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
