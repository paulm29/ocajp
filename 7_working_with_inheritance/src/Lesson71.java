import lesson1.ChildImplementation;
import lesson1.ParentImplementation;

/*
    7.1 Describe inheritance and its benefits

    Parent:
    - Generalization
    - Superclass / Base
    - Interface / Contract

    Child:
    - Specialization
    - Subclass
    - Implementation

    There are two types:
    - implementation inheritance:
    Child class extends a parent class

    - interface inheritance:
    Design by contract; implementing an interface
 */
public class Lesson71 {

    public static void main(String[] args) {
        ParentImplementation p = new ParentImplementation("Bob",12);
        ParentImplementation c = new ChildImplementation("Paul",14,"Brown");

        System.out.println(p.getAge());
        System.out.println(c.getAge());

        /*
         override getName in Child
         method must not be less accessible. e.g. public -> public

         Note that parent.getName() has return type Object,
         but child.getName() has assignment compatible String
          */
        System.out.println(p.getName());
        System.out.println(c.getName());
    }
}
