/*
    6.1 Create methods with arguments and return values; including overloaded methods
 */
public class Lesson1 {

    /*
    [modifier] return-type name ([argument-list])

    modifier: "Annotation" e.g. @Override (not on exam)
    access control: public, private, protected, abstract, static
                    , final (not on exam)
                    , synchronized (not on exam)
                    , native (not on exam)
                    , strictfp (not on exam)
     */

    public void voidMethod() {
        System.out.println("I\'m void");
    }

    public String getGreeting() {
        return "Hello";
    }

    /*
        Overloaded getGreeting
     */
    public String getGreeting(boolean isAustralian) {
        if(isAustralian) {
            return "Gidday";
        }
        else {
            return "Good morrow";
        }
    }

    /*
        varargs must always be last, and only one per method
     */
    public void printArgs(int specialArg, int... args) {
        System.out.println(specialArg);
        for(int arg: args) {
            System.out.println(arg);
        }
    }

    public static void main(String[] args) {
        Lesson1 lesson1 = new Lesson1();
        lesson1.voidMethod();
        System.out.println(lesson1.getGreeting());
        System.out.println(lesson1.getGreeting(true));

        lesson1.printArgs(42,12,13,15);
        // alternatively: lesson1.printArgs(42,new int[]{12,13,15})
    }
}
