/*
    6.1 Create methods with arguments and return values; including overloaded methods
 */
public class Lesson1 {

    /*
    Annotation e.g. @Override
    [access] [optional] return-type name ([argument-list])

    [access] private, default (none), protected, public
    [optional] abstract, static, final
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

    public void doStuff(String s) {
        System.out.println("Hello, " + s);
    }

    /*
        To overload, paramters must change name, as change in return type is not
        overloading
    */
    /*
    public String doStuff(String s) { // compiler error, name already exists
        return "Hello, " + s;
    }
    */

    public String doStuff2(String s) {
        return "Hello, " + s;
    }

    /*
        doStuff overloaded with different parameter, same return type
        Return type doesn't count for overloading
        Having same types, but different order, does count
     */
    public void doStuff(int i, long l) {
        System.out.println(i);
        System.out.println(l);
    }

    public void doStuff(long l, int i) {
        System.out.println(l);
        System.out.println(i);
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


        lesson1.doStuff(5,5L); // this is okay

        /*
        this is ambiguous, as unsure which argument to promote,
        long or int
         */
        //lesson1.doStuff(5,5);

        lesson1.doStuff("Paul");

        lesson1.printArgs(42,12,13,15);
        // alternatively: lesson1.printArgs(42,new int[]{12,13,15})

    }
}
