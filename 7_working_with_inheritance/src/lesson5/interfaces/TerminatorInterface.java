package lesson5.interfaces;

public interface TerminatorInterface extends RobotInterface {
    void locateSarahConnor();

    void locateJohnConnor();

    // public static final is redundant
    public static final String MODEL = "T1000";
}
