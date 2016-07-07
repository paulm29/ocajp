import lesson2.Animal;
import lesson2.Cat;
import lesson2.Dog;

/*
 Determine when casting is necessary
 */
public class Lesson73 {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();

        System.out.println(animal.getClass().getName());

        /* Cat */
        System.out.println(cat.getClass().getName());
        System.out.println(cat.getClass().getSuperclass().getName());

        /* Rose */
        System.out.println(dog.getClass().getName());

        if (cat instanceof Cat) {
            System.out.println("Cat instance of House");
        }
        if (cat instanceof Animal) {
            System.out.println("Cat instance of House");
        }

       /*
            Casting errors
       */
       Animal animals2 = new Animal();
       //Cat cat2 = animals2; // compiler error
        //Cat cat2 = (Cat)animals2; // compiles, but class cast exception
        //cat2.talk();

        Animal animal3 = new Cat();
        //animal3.sleep(); // need to cast animal to Cat to use sleep()
        Cat cat3 = (Cat)animal3;
        cat3.sleep();


        Cat cat4 = new Cat();
        Animal animal4 = cat4;
        //Rose dog4 = (Rose)animal4;  // class cast exception
        //dog4.talk();



    }
}
