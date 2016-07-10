import lesson4.other.Aclass;
import lesson4.other.Bclass;
import lesson4.other.Cclass;
import lesson4.other.Dclass;

/*
    6.4 Apply access modifiers
 */
public class Lesson4 extends Cclass {

    public static void main(String[] args) {
        Lesson4 lesson4 = new Lesson4();
        InnerClass innerClass = lesson4.new InnerClass();

        Aclass a = new Aclass();
        // System.out.println(a.x); x is protected
        System.out.println(a.y); // y is public

        Bclass b = new Bclass();
        System.out.println(b.x); // x has default access (package)

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

    }
}
