package Chapter4;
import java.util.Scanner;

/**
 * Program to determine weather user input matches majors and grade level
 * 
 * @author Nick Gonzalez
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        char c0, c1;
        String major = "";
        String year = "";
        boolean inv = false;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String s = in.next();
        c0 = s.charAt(0);
        c1 = s.charAt(1);
        if (c0 == 'M') {
            major = "Mathematics";
        } else if (c0 == 'C') {
            major = "Computer Science";
        } else if (c0 == 'I') {
            major = "Information Technology";
        } else {
            inv = true;
        }
        if (c1 == '1') {
            year = "Freshman";
        } else if (c1 == '2') {
            year = "Sophomore";
        } else if (c1 == '3') {
            year = "Junior";
        } else if (c1 == '4') {
            year = "Senior";
        } else {
            inv = true;
        }
        if (inv) {
            System.out.println("Invalid input");
        } else {
            System.out.println(major + " " + year);
        }
    }
}
