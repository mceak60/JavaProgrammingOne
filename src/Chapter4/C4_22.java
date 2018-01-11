package Chapter4;
import java.util.Scanner;

/**
 * Program to determine weather two given strings are substrings of each other
 * 
 * @author Nick Gonzalez
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        String s1, s2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s1 = in.next();
        System.out.print("Enter another string: ");
        s2 = in.next();
        if (s1.contains(s2)) {
            System.out.printf("%s is a substring of %s", s2, s1);
        } else {
            System.out.printf("%s is not a substring of %s", s2, s1);
        }
    }
}