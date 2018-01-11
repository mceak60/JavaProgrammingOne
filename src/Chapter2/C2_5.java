package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate gratuity and total given gratuity rate and subtotal
 *
 * @author Nick Gonzalez
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the subtotal: ");
        double sub = in.nextDouble();
        System.out.print("Enter the gratuity rate: ");
        double rate = in.nextDouble();
        double grat = sub * (rate / 100);
        double tot = sub + grat;
        System.out.println("The gratuity is " + grat + " and the total is " + tot + ".");
    }
}
