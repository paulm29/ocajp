/**
    1.2 Define the structure of a Java class
    Topics:
    - Naming of files and identifiers
    - Structure: package, import, constructor, class, member, method,
        initializer block (static, instance)
 */

/*
    If classes are in the same package, they do not need package prefix.
    Otherwise, use lesson2.OtherClass
 */
import lesson2.B; // import statements

/*
    import static variables and methods
    so that class prefix is not needed
 */
import static lesson2.B.sayHello;

/*
    The class name is the same as the filename.
    The package and directory names match too
 */
public class Lesson2 {
    B b;
    lesson2.C c;

    /*
        This is a static variable. Note the capitalisation
       It belongs to all instances of a class, not a single instance
    */
    public static String MY_STRING;

    // static method
    public static void printMyString() {
        System.out.println(MY_STRING);
    }

    /*
        Order of Initialisation:
        1. static fields and static initializers, in order
        2. instance fields and instance initializers, in order
        3. Constructor (note: more detail later when superclass considered)
     */

    /*
        This is a static initiatlizer which runs when a class is first referred to.
         You can have more than one of these.
     */
    static {
        System.out.println("Hello ");
    }

    int myInt;
    /*
        Below is an instance intializer which runs when this object is created.
        You can have more than one of these.
     */
    {
        myInt = 42;
        System.out.println("World!");
    }

    /*
        This is a constructor. It has no return type and is named the same
        as a class
      */
    public Lesson2() {
        System.out.println("How are you?");
    }

    /*
        This is a class within a class! To refer to it, you need to use: outerclass.innerclass
        Apparently, this not on OCA exam, but will be on OCP.
    */
    class InnerClass {
    }

    /*
        An instance/object of this class does not need to be created before
        main is run, because it is static. That is to say, the constructor is
        NOT run before main runs.
    */
    public static void main(String[] args) {
        Lesson2 lesson2 = new Lesson2();
        Lesson2.MY_STRING = "Howdy!";
        Lesson2.printMyString();

        MyOtherClass myOtherClass;

        // Will get an error when trying to create an object of an Abstract class
        //AbstractClass abstractClass = new AbstractClass();
    }
}

/*
    Can have more than one class per file,
    However, only 1 PUBLIC class.
    Without a prefix, these have default package access
 */
class MyOtherClass {

}

/*
    This is an interface, which only declares signatures for methods,
   and not their implementations
 */
interface MyInterface {

}

/*
    You cannot create an instance of this class, but you can extend it.
    It is useful for 'base' functionality.
*/
abstract class AbstractClass {

}

