/*
    9.1 Manipulate data using the StringBuilder class and its methods
 */
public class Lesson1 {


    public static void main(String[] args) {
        /*
            Four different constructors
            Stored as a char[] behind the scenes
            Initial size of char[] is 16
         */
        StringBuilder sbString = new StringBuilder("One");
        StringBuilder sbCharSequence = new StringBuilder(sbString);
        StringBuilder sbInt = new StringBuilder(20); // 20 is the length of the initial char array
        StringBuilder sb = new StringBuilder();

        /*
            some methods
         */
        sb.append("Hello");
        sb.append(true);
        sb.append(1);
        sb.append(sbString,0,sbString.length());
        sb.insert(0,"yo");
        sb.reverse();
        sb.setCharAt(0,'z');
        sb.setLength(32);

        System.out.println(sb.substring(0,sb.length()));
        char char01 = sb.charAt(0);
        System.out.println(sb.indexOf("o"));
        System.out.println(sb.lastIndexOf("o"));

        System.out.println(sb.capacity());
        sb.trimToSize(); // get rid of extra space

    }
}
