package lesson5;

/**
 * Created by paulr on 7/7/2016.
 */
public abstract class House {
    String banner;
    String name;

    /*
        Subclasses must define implementation
     */
    //  private abstract void showBanner(); // must be public
    public abstract void showBanner();

    /*
        Concrete method allowed in abstract class
     */
    public void fight(House house) {
        System.out.println(this.name + " is fighting " + house.name);
    }
}
