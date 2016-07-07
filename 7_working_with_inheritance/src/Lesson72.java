import lesson2.Animal;
import lesson2.Cat;
import lesson2.Dog;

/*
    Develop code that demonstrates the use of polymorphism; including
    overriding and object type versus reference type
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

    }

}
