/*
    7.3 Determine when casting is necessary
 */
import lesson2.Animal;
import lesson2.Cat;
import lesson2.Dog;

public class Lesson73 {

    /*
        1. Casting an object from a subclass to a superclass doesn’t require
        an explicit cast.
        2. Casting an object from a superclass to a subclass requires an explicit
            cast.
        3. The compiler will not allow casts to unrelated types.
        4. Even when the code compiles without issue, an exception may be thrown
            at runtime if the object being cast is not actually an instance of
            that class. (Sybex, p.282)
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();

        System.out.println(animal.getClass().getName());

        /* Cat */
        System.out.println(cat.getClass().getName());
        System.out.println(cat.getClass().getSuperclass().getName());

        /* Dog */
        System.out.println(dog.getClass().getName());

        if (cat instanceof Cat) {
            System.out.println("instance of Cat");
        }
        if (cat instanceof Animal) {
            System.out.println("instance of Animal");
        }

        /*
           Acceptable casts
        */
        Cat cat1 = new Cat();
        Animal animal1 = cat; // no cast required
        cat1 = (Cat)animal1; // no problem!

       /*
            Casting errors
       */
       Animal animals2 = new Animal();
       //Cat cat2 = animals2; // compiler error
        //Cat cat2 = (Cat)animals2; // compiles, but class cast exception
        //cat2.talk();

        Animal animal3 = new Cat();
        //animal3.sleep(); // compile error, need to cast animal to Cat to use sleep()
        Cat cat3 = (Cat)animal3;
        cat3.sleep();

        Cat cat4 = new Cat();
        Animal animal4 = cat4;
        //Dog dog4 = (Dog)animal4;  // compiles, but class cast exception
        //dog4.talk();

        Cat cat5 = new Cat();
        //Dog dog5 = (Dog)cat5;   // compiler error
    }
}
