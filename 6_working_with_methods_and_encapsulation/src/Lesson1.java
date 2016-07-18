/**
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

        The [optional] can come before the [access], but everything else must be in order.
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
        To overload, parameters must change name, as change in return type is not
        overloading.
        Everything that CAN change WITHOUT overloading:
       - access modifiers
       - optional specifiers (like static)
       - return types
       - exception lists

       You will get a compiler error for duplicate method if only the above aspects
       are different.

       Another rule is determining which method to call for primitive types:
       1. exact match
       2. widening (larger primitive type)
       3. autobox
       3. varargs
       Only one conversion can be called. For example, widening and then autoboxing will
       fail.
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

    /*
        Traps:
        - vararg parameters and array parameters are the same
     */
    private static void trap(int[] numbers) {
    }

   // private static void trap(int... numbers) { } // duplicate method

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
        // lesson1.printArgs(42,new int[]{12,13,15}); // alternatively
    }
}
