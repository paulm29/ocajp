package lesson5.interfaces;

/*
    A class can extend only one class, but implement multiple interfaces
 */
public class TerminatorTransformer extends Autobot implements TerminatorInterface, TransformerInterface {

    /*
    You don't need Override, but it is good practice
     */
    @Override
    public void transform() {
        System.out.println("Transform!");
    }

    @Override
    public void locateJohnConnor() {
        System.out.println("Scanning for John Connor");
    }

    @Override
    public void locateSarahConnor() {
        System.out.println("Scanning for Sarah Connor");
    }

    @Override
    public void move() {
        System.out.println("I'm moving");
    }
}
