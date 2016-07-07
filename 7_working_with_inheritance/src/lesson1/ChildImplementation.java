package lesson1;

/**
 * Created by paulr on 7/6/2016.
 */
public class ChildImplementation extends ParentImplementation {
    private String hairColour;

    public ChildImplementation(String name, int age, String hairColour) {
        super(name,age);
        this.hairColour = hairColour;
    }

    @Override
    public String getName() {
        return "My name is " + super.getName();
    }
}
