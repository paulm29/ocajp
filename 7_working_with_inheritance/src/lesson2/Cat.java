package lesson2;

/**
 * Created by paulr on 7/6/2016.
 */
public class Cat extends Animal {
    @Override
    public void talk() {
        System.out.println("Meow!");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}
