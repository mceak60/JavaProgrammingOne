package Chapter3;

import java.util.Scanner;

/**
 * Program to compare two given numbers and display results to the console
 *
 * @author Nick Gonzalez
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double d1, d2;
        System.out.print("Please enter a number: ");
        d1 = in.nextDouble();
        System.out.print("Please enter another number: ");
        d2 = in.nextDouble();
        if (d1 < d2) {
            System.out.println("The first number is less than the second.");
        }
        if (d1 > d2) {
            System.out.println("The first number is greater than the second.");
        }
        if (d1 == d2) {
            System.out.println("The first number is equal to the second.");
        }
        if ((d1 < d2) || (d1 == d2)) {
            System.out.println("The first number is less or equal to the second.");
        }
        if (d1 != d2) {
            System.out.println("The first number is not equal to the second.");
        }
        if (d2 == 0) {
            System.out.println("Cannot divide by 0.");
        } else if ((d1 / d2) < 1) {
            System.out.println("Propper fraction.");
        } else {
            System.out.println("Impropper fraction.");
        }
        if (d1 >= 90) {
            System.out.println("A");
        } else if (d1 >= 80) {
            System.out.println("B");
        } else if (d1 >= 70) {
            System.out.println("C");
        } else if (d1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        if (d2 > 0 && d2 < 101) {
            System.out.println("In range.");
        } else {
            System.out.println("Out of range.");
        }
    }
}