package lesson2;

/**
 * Created by paulr on 7/6/2016.
 */
public class Animal {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void talk() {
        System.out.println("I'm talking");
    }
}
