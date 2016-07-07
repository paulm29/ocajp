/*
    5.5 Use break and continue
 */
public class Lesson5 {

    public static void main(String[] args) {
        int i = 0;

        while (true) {

            if (i == 5) {
                break;
            }

            System.out.println(i);
            i++;
        }


        int j = 0;

        while (true) {

            if (j == 5) {
                break;
            }
            else if(j == 4) {
                System.out.println("skip");
                j++;
                continue;
            }

            System.out.println(j);
            j++;
        }
    }
}
