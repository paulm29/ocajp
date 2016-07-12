/*
    6.2 Apply the static keyword to methods and fields
 */
public class Lesson2 {
    public static String myName = "Paul";

    public static String getMyName() {
        return myName;
    }

    public String getNickname() {
        return "Superman";
    }

    public static void main(String[] args) {

        // cannot call non-static methods without an instance
        // getNickname()
        Lesson2 lesson2 = new Lesson2();
        System.out.println(lesson2.getNickname());

        System.out.println(myName);
        System.out.println(getMyName());
        // these also work, both class and instance reference
        System.out.println(Lesson2.getMyName());
        System.out.println(lesson2.getMyName());

        /*
            subclass getMyName hides parent's method
         */
        SubClass subClass = new SubClass();
        System.out.println(subClass.getMyName());

        /*
            Because reference is to parent class, its method will be called.
            This is different to method overriding.
         */
        Lesson2 subClass2 = new SubClass();
        System.out.println(subClass2.getMyName());
    }


}

class SubClass extends Lesson2 {
    /*
        the parent version of myName and getMyName is hidden
     */
    public static String myName = "Bob";

    public static String getMyName() {
        return myName;
    }
}

