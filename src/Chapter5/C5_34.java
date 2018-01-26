package Chapter5;

import java.util.Scanner;

/**
 * Program to reverse a string given by users
 *
 * @author Nick Gonzalez
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to reverse it");
        String s1 = input.nextLine();
        String s = new StringBuffer(s1).reverse().toString();
        System.out.println("The reverse string is " + s);
    }
}
