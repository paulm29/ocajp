package lesson4;

/*
    Order of initialization:
    1. Object
    2. Superclass
    2. Subclass

    Call to super is inserted by compiler if not called explicitly
 */
public class Child extends Parent {
    int age;

    public Child() {
        this("Bob",1); // default name of Bob
    }

    public Child(String name,int age) {
        /*
         compile error because superclass needs to be instantiated before
         this
          */
        //super(this.getName());
        super(name);
        this.age = age;

        //super.greeting(); // does not work because private in sueprclass
    }

    @Override
    public String getName() {
        return "My name is " + super.getName();
    }
}
