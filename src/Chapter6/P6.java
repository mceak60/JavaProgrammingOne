package Chapter6;

import java.util.Scanner;

/**
 * Program to calculate conversions from Euros to Pound Sterlings to Yen
 *
 * @author Nick Gonzalez
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double euro, pound, yen, dol;
        String cur, yes;
        boolean b = true;
        System.out.print("How many Euros will one dollar buy? ");
        euro = in.nextDouble();
        System.out.print("How many Pound Sterlings will one dollar buy? ");
        pound = in.nextDouble();
        System.out.print("How many Yen will one dollar buy? ");
        yen = in.nextDouble();
        while (b) {
            System.out.print("Enter a number in dollars: ");
            dol = in.nextDouble();
            System.out.print("Enter “E” to buy Euros, “P” to buy Pounds, or “Y” to buy Yen: ");
            cur = in.next();
            if (cur.equalsIgnoreCase("E")) {
                Convert(dol, euro, "Euros");
            } else if (cur.equalsIgnoreCase("P")) {
                Convert(dol, pound, "Pound Sterlings");
            } else if (cur.equalsIgnoreCase("Y")) {
                Convert(dol, yen, "Yen");
            } else {
                System.out.println("Invalid entry");
            }
            System.out.print("\nAre there more conversions to preform? ");
            yes = in.next();
            if (yes.equalsIgnoreCase("yes")); else if (yes.equalsIgnoreCase("no")) {
                break;
            } else {
                while (true) {
                    System.out.print("Enter “yes” to continue converting dollars into other currencies or “no” to stop: ");
                    yes = in.next();
                    if (yes.equalsIgnoreCase("yes")) {
                        break;
                    } else if (yes.equalsIgnoreCase("no")) {
                        b = false;
                        break;
                    }
                }
            }
        }
    }

    /**
     * Method to convert between two currencies
     *
     * @param d Amount in dollars
     * @param r Dollars/Currency rate
     * @param s Name of currency
     */
    public static void Convert(double d, double r, String s) {
        double c = d * r;
        if (d > 100) {
            c *= .95;
        } else {
            c *= .9;
        }
        System.out.printf("For %.2f dollars, you will be able to buy %.2f %s.\n", d, c, s);
    }
}
