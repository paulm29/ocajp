/**
    6.6 Determine the effect upon object references and primitive values
    when they are passed into methods that change the values.

    Understanding this topic is made difficult by the terms 'pass by value'
    and 'pass by reference'. Throw out BOTH of the terms.

    Java is 'pass by copy', which means that when a method is invoked with either
    a primitive variable or object reference variable, a COPY of that primitive
    variable or object reference is made.

    For primitives, it is *like* passing the value of the variable itself.
    For objects, it is *like* passing a new, different reference to the same object.
 */
public class Lesson6 {

    public static void addOne(int x) {
        x++;
        System.out.println("x is " + x);
    }

    public static void addWorld(StringBuilder sb) {
        sb.append(" world!");
        System.out.println("sb is " + sb);
    }

    public static void main(String[] args) {
        /*
            pass value of variable
         */
        int x = 99;
        addOne(x);
        System.out.println("x is unchanged: " + x);

        /*
            pass a new, different reference to the same object
         */
        StringBuilder sb = new StringBuilder("Hello");
        addWorld(sb);
        System.out.println("sb is changed: " + sb);
    }
}
