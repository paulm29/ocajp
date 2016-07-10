/**
    1.3 Create executable Java applications with a main method;
    run a Java program from the command line; including console output.

    Note: in IntelliJ Idea, ALT + F12 will launch terminal (console) window
 */
package javabasics; // package is optional, though use of 'default package' is against convention

import java.io.Console;

/**
 * Compile: javac javabasics/Lesson3.java
 * Run: java javabasics.Lesson3 firstArg secondArg
 * Note: on the commandline, you should be outside the package directory
 *
 * Other options: java -cp ".;C:\temp\someOtherLocation;c:\temp\myJar.jar" myPackage.MyClass
 * -cp is short for -classpath
 *
 * Not for exam:
 *  - System.exit(0) - successful execution
 *  - System.exit(1) - unsuccessful execution
 */
public class Lesson3 {

    /*
        Accessibility, from most restrictive to least:
        - private: Accessible only to this class (and inner classes)
        - default: Accessible only to classes in same package
        - protected: Accessible to subclasses and classes in the same package
        - public: Accessible to all lesson4 classes
        This is covered in greater depth in later lessons
     */
    private String myString;
    public int myInt; // demonstration only, public members are bad

    /*
        Using Console class requires running from command line
     */
    public void printToConsole() {
        Console console = System.console();
        console.writer().write("Hello ");
        console.flush();

        System.out.println("World!");
    }


    // Old style
    /*
    public static void main(String[] args) {
        System.out.println("running");
    }
    */

    /*
    New style using varargs
    You can change the name of "args", but that is against convention.
    You can also add "final", but it is not necessary

    Args can be used like:
        java Bob Sam "Bill Smith" Paul

     Note "Bill Smith" in quotes as one argument, not two
     */
    public static void main(String... args) {
        for (int i=0;i<args.length;i++) {
            System.out.println(args[i]);
        }

        Lesson3 lesson3 = new Lesson3();

        /*
            Note: must be run from command line, otherwise NPE
         */
        lesson3.printToConsole();
    }
}
