/**
    7.2 Develop code that demonstrates the use of polymorphism; including
    overriding and object type versus reference type
 */
import lesson2.Animal;
import lesson2.Cat;
import lesson2.Dog;

/*
    Rules for method overload:
    1. Method is not private
    2. The method in the child class must have the same signature as the method in the
        parent class (not overloaded).
    3. The method in the child class must be at least as accessible or more accessible than the
        method in the parent class.
    4. The method in the child class may not throw a checked exception that is new or
        broader than the class of any exception thrown in the parent class method.
    5. If the method returns a value, it must be the same or a subclass of the method in the
        parent class, known as covariant return types.

    Rules for method hiding:
    1. The method in the child class must have the same signature as the method in the
        parent class.
    2. The method in the child class must be at least as accessible or more accessible
        than the method in the parent class.
    3. The method in the child class may not throw a checked exception that is new or
        broader than the class of any exception thrown in the parent class method.
    4. If the method returns a value, it must be the same or a subclass of the method in the
        parent class, known as covariant return types.
    5. The method defined in the child class must be marked as static if it is marked as
        static in the parent class (method hiding). Likewise, the method must not be marked
        as static in the child class if it is not marked as static in the parent class
        (method overriding).

    Rules for variable hiding:
    1. same name
    The object reference determines which value is used.
 */
public class Lesson72 {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();

        Animal[] animals = {animal,cat,dog};
        for (Animal a: animals) {
            a.talk(); // the point of polymorphism
        }

        /*
            Method hiding
         */
        Lesson72.sayHello();
        StaticSubclass.sayHello();
    }

    public static void sayHello() {
        System.out.println("sup");
    }
}

class StaticSubclass extends Lesson72 {

    /*
    // compiler error, less access
    private static void sayHello() {
        System.out.println("greetings");
    }
    */

    public static void sayHello() {
        System.out.println("greetings");
    }
}