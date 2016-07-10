/*
    6.6 Determine the effect upon object references and primitive values
    when they are passed into methods that change the values
 */
public class Lesson6 {

    public static void addOne(int x) {
        x++;
        System.out.println("x is " + x);
    }

    public static void addOne(StringBuilder sb) {
        sb.append(" world!");
        System.out.println("sb is " + sb);
    }

    public static void main(String[] args) {
        /*
            pass by value
         */
        int x = 99;
        addOne(x);
        System.out.println("x is " + x);

        /*
            pass by reference
         */
        StringBuilder sb = new StringBuilder("Hello");
        addOne(sb);
        System.out.println("sb is " + sb);
    }
}
