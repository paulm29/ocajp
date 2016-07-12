/*
    Lesson 8.3 Describe the advantages of Exception handling

    Advantages:
    - separate 'happy path' code from 'sad path' making the program easier to
    understand and debug
 */
public class Lesson3 {

    public static void main(String[] args) {

        try {
            // happy path
        }
        catch(Exception e) {
            // deal with any problems
        }
        finally {
            // close any resources
        }
    }
}
