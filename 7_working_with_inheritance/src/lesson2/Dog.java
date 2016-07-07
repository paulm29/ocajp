package lesson2;

/**
 * Created by paulr on 7/6/2016.
 */
public class Dog extends Animal {
    @Override
    public void talk() {
        System.out.println("Woof!");
    }

    @Override
    public void setName(String nm) {
        /*
        nm parameter doesn't match name parameter in parent, but that
        doesn't matter for overriding, everything else does
         */
        super.setName(nm);
    }
}
