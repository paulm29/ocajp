package lesson5;

public abstract class House {
    String banner;
    String name;

    /*
        Subclasses must define implementation
     */
    //  private abstract void showBanner(); // must be public

    /*
        Throws declaration need not be implemented. A more specific exception
        can be thrown or none at all. A broader exception cannot be used though.
        e.g. IOException can NOT be overriden with Exception
     */
    public abstract void showBanner() throws Exception;

    /*
        Concrete method allowed in abstract class
     */
    public void fight(House house) {
        System.out.println(this.name + " is fighting " + house.name);
    }
}
