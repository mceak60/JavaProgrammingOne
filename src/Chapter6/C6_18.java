package Chapter6;

import java.util.Scanner;

/**
 * Program to determine whether a password is valid or not
 *
 * @author Nick Gonzalez
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        System.out.print("Enter a password: ");
        s = in.next();
        if (isValid(s)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    /**
     * Method to determine whether a password is valid or not
     *
     * @param s Password
     * @return True if password is valid, False if not
     */
    public static boolean isValid(String s) {
        int count = 0;
        if (s.length() < 8) {
            System.out.println("A password must have at least eight characters");
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!(Character.isLetterOrDigit(s.charAt(i)))) {
                System.out.println("A password must consist of only letters and digits");
                return false;
            }
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        if (count < 2) {
            System.out.println("A password must contain at least two digits");
            return false;
        }
        return true;
    }
}
