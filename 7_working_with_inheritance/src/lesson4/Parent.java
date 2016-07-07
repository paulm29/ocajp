package lesson4;

/**
 * Created by paulr on 7/7/2016.
 */
public class Parent {
    String name;

    /*
        If Child were to call super(), and this constructor
        wasn't explicitly written, there would be a compile error, because
        the compiler would not automatically add it, because there is another
        written constructor.
     */
    public Parent() {
    }

    public Parent(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private void greeting() {
        System.out.println("Hello");
    }
}
