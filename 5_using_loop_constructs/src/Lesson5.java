/**
    5.5 Use break and continue
    Topics:
        break and continue
        break and continue with labels
 */
public class Lesson5 {

    public static void breakAndContinue() {
        int i = 0;

        while (true) {

            if (i == 5) {
                System.out.println("break 5");
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
                System.out.println("skip 4");
                j++;
                continue;
            }

            System.out.println(j);
            j++;
        }
    }

    public static void breakAndContinueWithLabels() {
    /*
        Skip 7 and above
     */
        int i = 0;
        FIRST:
        while (i< 10) {
            if(i == 7) {
                System.out.println("break FIRST");
                i++;
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
                System.out.println("continue SECOND");
                j++;
                continue SECOND;
            }
            System.out.println(j);
            j++;
        }

    /*
        OUTER and INNER
     */
        int k = 0;
        OUTER:
        while (k< 10) {

            int l = 0;
            INNER:
            while(l < 10) {
                if (l == 7) {
                    //l++; // not necessary
                    k++;
                    System.out.println("continue OUTER");
                    continue OUTER;
                    // break OUTER
                }
                System.out.println(k + " "  + l);
                l++;
            }

            k++;
        }
    }

    public static void main(String[] args) {
        breakAndContinue();
        breakAndContinueWithLabels();
    }
}
