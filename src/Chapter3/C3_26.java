package Chapter3;

import java.util.Scanner;

/**
 * Program to check if an integer is divisible by 5, 6, or both
 *
 * @author Nick Gonzalez
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int i = in.nextInt();
        System.out.print("Is " + i + " divisibe by 5 and 6? ");
        if (i % 5 == 0 && i % 6 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.print("Is " + i + " divisible by 5 or 6? ");
        if (i % 5 == 0 || i % 6 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.print("Is " + i + " divisible by 5 or 6, but not both? ");
        if ((i % 5 == 0 && i % 6 != 0) || (i % 6 == 0 && i % 5 != 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
