/*
    2.3 Know how to read or write to object fields

    Variables will be prefixed by a dot, unless:
    1. It's a method local variable
    2. It's a member variable with an implied this
    3. It's a static variable in class that encloses the variable
    4. It's a static import from a class that does not enclose the variable
 */

public class Lesson3 {
    public int numOne = 3;
    public long numTwo = 10L;
    private String greeting = "Hello";

    public String getGreeting() {
        return this.greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public Lesson3() {

    }

    public Lesson3 getNewLesson3() {
        return new Lesson3();
    }

    public Lesson3[] getNewLesson3s() {
        Lesson3[] lesson3s = new Lesson3[3];
        lesson3s[0] = new Lesson3();
        lesson3s[0] = new Lesson3();

        for (Lesson3 lesson : lesson3s) {
            System.out.println(lesson3s.toString());
        }

        return lesson3s;
    }

    public static void main(String... args) {
        Lesson3 lesson3 = new Lesson3();
        int value = lesson3.numOne;

        Lesson3[] lesson3s = new Lesson3[10];
        lesson3s[0] = lesson3;

        System.out.println(lesson3s[0].numOne);

        System.out.println(lesson3.getNewLesson3().numOne);

        System.out.println(lesson3.getGreeting());
        lesson3.setGreeting("Gidday");
        System.out.println(lesson3.getGreeting());
    }
}
