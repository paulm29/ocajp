/**
    1.2 Define the structure of a Java class
 */

/*
    If classes are in the same package, they do not need package prefix.
    Otherwise, use lesson2.OtherClass
 */
import lesson2.B;



// import statements

/* import static variables and methods
so that class prefix is not needed
 */

/*
    The class name is the same as the filename.
    The package and directory names match too
 */
public class Lesson2 {
    B b;
    javabasics.lesson2.C c;

    /* this is a static variable
       Note the capitalisation
       It belongs to all instances of a class, not a single instance
      */
    public static String MY_STRING;

    // static method
    public static void printMyString() {
        System.out.println(MY_STRING);
    }

    /*
    Order of Initialisation:
    1. Fields and instance initializer blocks are run in the order in which
    they appear in the file. (Compilation errors if you try to use a field that
    has not been initialised).
    2. The constructor runs after all fields and instance initializer blocks have run
     */
    int myInt;
    /*
        Below is an instance intialiser. A class can only have one.
     */
    {
        myInt = 42;
    }

    /*
     This is a constructor. It has no return type and is named the same
     as a class
      */
    public Lesson2() {

    }

    // this is a class within a class!
    // to refer to it, you need to use: outerclass.innerclass
    // apparently, not on OCA exam, but will be on OCP
    class InnerClass {
    }

    public static void main(String[] args) {
        Lesson2 lesson2 = new Lesson2();
        Lesson2.MY_STRING = "Hello";
        Lesson2.printMyString();

        MyOtherClass myOtherClass;

        // Will get an error
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

/* this is an interface, which only declares signatures for methods,
   and not their implementations
 */
interface MyInterface {

}

/* You cannot create an instance of this class,
   but you can extend it.
   It is useful for provide 'base' functionality to lesson4 classes.
  */
abstract class AbstractClass {

}

