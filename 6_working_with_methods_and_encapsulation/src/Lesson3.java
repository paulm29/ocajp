/*
Create and overload constructors; including impact on default constructors
 */
public class Lesson3 {
    private String nickName;

    /*
        1. Object created
        2. Call parent class constructors
        3. Field initialization and instance initializer(if any)
        4. Constructor runs
     */
    /*
     this is needed as NOT automatically added by compiler
     because another constructor is defined
      */
    public Lesson3() {
        /*
            super is called by default
            generally only called if the parent constructor is not the default
             e.g. super("argument")
         */
        super();
    }

    public Lesson3(String nickName) {
        this.nickName = nickName;
    }

    public static void main(String[] args) {
        Lesson3 lesson3a = new Lesson3();
        Lesson3 lesson3b = new Lesson3("Bob");
    }
}
