package lesson1;

/**
 * Created by paulr on 7/6/2016.
 */
public class ParentImplementation {
    public Object getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    public ParentImplementation(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
