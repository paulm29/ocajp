/**
    9.1 Manipulate data using the StringBuilder class and its methods
    Topics:
        construction and length/capacity
        appending and inserting
        updating and deleting
        extracting parts
 */
public class Lesson1 {

    /*
        StringBuilders are mutable, unlike Strings.
     */
    public static void main(String[] args) {
        /*
            Four different constructors
            Stored as a char[] behind the scenes
            Initial size of char[] is 16 by default
         */
        StringBuilder sbString = new StringBuilder("One");
        StringBuilder sbCharSequence = new StringBuilder(sbString);
        StringBuilder sbInt = new StringBuilder(20); // 20 is the length of the initial char array
        StringBuilder sb = new StringBuilder();

        /*
            StringBuilder, unlike String, does NOT actually implement equals().
            If you call equals it will actually check reference equality, like ==
         */
        StringBuilder sbOne = new StringBuilder("thing");
        StringBuilder sbTwo = new StringBuilder("thing");
        System.out.println("StringBuilders equal: " + sbOne.equals(sbTwo));

        /*
            length versus capacity
         */
        System.out.println(sb.length());
        System.out.println(sb.capacity()); // default capacity is 16
        sb.setLength(32);
        System.out.println("new length: " + sb.length());
        System.out.println("new capacity: " + sb.capacity());
        sb.trimToSize(); // get rid of extra space
        System.out.println("new capacity after trim: " + sb.capacity());

        /*
            Appending and inserting
            Note: inserting elements increases the indexes of existing elements,
                rather than replacing them
         */
        sb.append("Hello");
        sb.append(true);
        sb.append(1);
        sb.append(sbString,0,sbString.length());
        sb.insert(0,"yo");
        System.out.println("append and insert: " + sb);

        /*
            Updating and deleting
         */
        sb.delete(0,sb.length());
        System.out.println("delete: " + sb);
        sb.append("Hello");
        sb.reverse();
        System.out.println("reverse: " + sb);
        sb.reverse(); // reverse back
        sb.setCharAt(0,'h');
        sb.replace(0,6,"howdy");
        System.out.println("replace: " + sb);

        /*
            extracting parts of StringBuilder
         */
        System.out.println("As a string: " + sb.toString());
        System.out.println(sb.substring(0,sb.length()));
        char char01 = sb.charAt(0);
        System.out.println("First l: " + sb.indexOf("l"));
        System.out.println("Last l: " + sb.lastIndexOf("l"));
    }
}
