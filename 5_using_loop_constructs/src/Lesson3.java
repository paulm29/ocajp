/**
    5.3 Create and use do/while loops
     Topics:
        do-while loop
 */
public class Lesson3 {

    public static void main(String... args) {

        int i = 5;
        do {
            System.out.println(i);
            i++;
        } while(i < 5);


        int j = 0 ;
        do
            j++; // only one statement allowed
        while(j < 5);
    }
}
