/**
    7.1 Describe inheritance and its benefits

    Parent terms:
    - Generalization
    - Superclass / Base
    - Interface / Contract

    Child terms:
    - Specialization
    - Subclass
    - Implementation

    There are two types:
    1. implementation inheritance:
    Child class extends a parent class

    2. interface inheritance:
    Design by contract; implementing an interface

    Note:
        - more example code in lesson 2
        - code examples for interface inheritance are in lesson 5
 */
import lesson1.ChildImplementation;
import lesson1.ParentImplementation;

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
