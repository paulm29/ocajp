/**
    9.5 Write a simple Lambda expression that consumes a Lambda Predicate expression
    Topics:
        Predicate interface
        Lambda expression for Predicates
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lesson5 {

    public static List<Person> getMatching(List<Person> ls,
                                           Predicate<Person> ps) {
        List<Person> results = new ArrayList<Person>();
        for (Person p : ls) {
            if (ps.test(p)) {
                results.add(p);
            }
        }
        return results;
    }

    /*
        IPredicate @FunctionlInterface
        https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html

        boolean test(T t)
        Evaluates this predicate on the given argument.

        Parameters:
            t - the input argument
        Returns:
            true if the input argument matches the predicate, otherwise false
     */
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Paul",21,"Dog"),
                new Person("Bob",12,"Cat"),
                new Person("Jack",22,"Frog"),
                new Person("Jill",23,"Turtle")
        );

        OlderThan21 olderThan21 = new OlderThan21();
        List<Person> results = getMatching(people,olderThan21);
        System.out.println(results);

        /*
            Lambda expressions for Predicates
         */
        results = getMatching(people,(Person p) -> { return p.age > 21; }  );
        System.out.println(results);
        results = getMatching(people,p -> p.age < 21); // shorthand
        System.out.println(results);

        /*
            Other valid expressions:
            (() -> true); // 0 parameters
            (a -> a.startsWith("test")); // 1 parameter
            ((String a) -> a.startsWith("test")); // 1 parameter
            ((a, b) -> a.startsWith("test")); // 2 parameters
            ((String a, String b) -> a.startsWith("test")); // 2 parameters
         */
    }

}

class OlderThan21 implements Predicate<Person> {

    @Override
    public boolean test(Person person) {
        return person.age > 21;
    }
}

class YoungerThan21 implements Predicate<Person> {

    @Override
    public boolean test(Person person) {
        return person.age < 21;
    }
}

class Person {
    String name;
    int age;
    String pet;

    Person(String name, int age, String pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + pet;
    }
}
