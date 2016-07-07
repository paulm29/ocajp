/*
    Apply the static keyword to methods and fields
 */
public class Lesson2 {
    public static String myName = "Paul";

    public static String getMyName() {
        return myName;
    }

    public String getNickname() {
        return "God";
    }


    public static void main(String[] args) {

        // cannot call non-static methods without an instance
        // getNickname()
        Lesson2 lesson2 = new Lesson2();
        System.out.println(lesson2.getNickname());

        System.out.println(myName);
        System.out.println(getMyName());
        // these also work
        System.out.println(Lesson2.getMyName());
        System.out.println(lesson2.getMyName());
    }

}


