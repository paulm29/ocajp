/*
    Labels
 */
public class Lesson5b {

    public static void main(String[] args) {

        /*
            Skip 7 and above
         */
        int i = 0;
        FIRST:
        while (i< 10) {
            if(i == 7) {
                break FIRST;
            }
            System.out.println(i);
            i++;
        }

        /*
            Skip just 7
         */
        int j = 0;
        SECOND:
        while (j< 10) {
            if (j == 7) {
                continue SECOND;
            }
            System.out.println(j);
           j++;
        }

        /*
            OUTER and INNER
         */
        int k = 0;
        int l = 0;
        OUTER:
        while (k< 10) {

            INNER:
            while(l < 10) {
                if (l == 7) {
                    l++;
                    System.out.println("Skip 7");
                    continue OUTER;
                }
                System.out.println(k + " "  + l);
                l++;
            }

            k++;
        }
    }
}
