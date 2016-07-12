/*
    6.3 Create and overload constructors; including impact on default constructors
 */
public class Lesson3 {
    private String nickName;

    /*
        Order of construction:
        1. java.lang.Object created
        2. super() - Call parent class constructors
        3. Field initialization
        4. Instance initializer (if any)
        4. this() - Constructor runs

        Note: prior to construction,
        1. static fields initialized
        2. static initializers run (if any)
     */
    /*
     No-args constructor is needed as it NOT automatically added by compiler
     because another constructor is defined
      */
    public Lesson3() {
        this("Paul"); // call other constructor
    }

    public Lesson3(String nickName) {
        /*
            Super is called by default. Generally it is only called if the parent
            constructor is not the default. e.g. super("argument").
            If you do call super(), it must be the first statement, otherwise
            a compiler error occurs.
         */
        super();    // explicit call to parent class constructor
        this.nickName = nickName;
        // super() here will cause a compile error
    }

    public static void main(String[] args) {
        Lesson3 lesson3a = new Lesson3();
        Lesson3 lesson3b = new Lesson3("Bob");
    }
}
