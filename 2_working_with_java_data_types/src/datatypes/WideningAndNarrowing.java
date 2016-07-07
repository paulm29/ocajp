package datatypes;

/*
    - Widening is also known as Promotion, and occurs when two data
    types are different.
    - Narrowing is the opposite
 */
public class WideningAndNarrowing {

    public static void main(String[] args) {
        /*
            Unary operators result in the same data type
         */
        short s = 1;
        s++;
        getType(s); // short

        /*
            int and long
         */
        int x = 1;
        long y = 33;
        getType(x * y); // long

        /*
            double and float
         */
        double x1 = 39.21;
        //float y1 = 2.1; // compile error
        float y1 = 2.1f;
        getType(x1 * y1); // double

        /*
            short
         */
        short x2 = 10;
        short y2 = 3;
        getType(x2 * y2); // integer, because short values promoted to int

        short result = (short)(x2 * y2); // needs cast

        /*
            short, float, double
         */
        short x3 = 14;
        float y3= 13; // does compile, because int literal promoted to float
        double z3 = 30;

        /*
            trick question.
            This looks invalid at first glance, as seems that boolean being
            assigned to long. However, it is not ==, just assignment and
            valid
         */
        long x4 = 5;
        long y4 = (x4=3);
        System.out.println(x4); // Outputs 3
        System.out.println(y4); // Also, outputs 3
    }

    public static void getType(Object o) {
        System.out.println(o.getClass().getName());
    }

}
