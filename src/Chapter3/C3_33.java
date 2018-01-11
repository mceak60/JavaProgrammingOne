package Chapter3;

import java.util.Scanner;

/**
 * Program to determine which price is lower between two packages given weight
 * and price
 *
 * @author Nick Gonzalez
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter weight for package 1: ");
        double weight1 = in.nextDouble();
        System.out.print("Enter price for package 1: ");
        double price1 = in.nextDouble();
        System.out.print("Enter weight for package 2: ");
        double weight2 = in.nextDouble();
        System.out.print("Enter price for package 2: ");
        double price2 = in.nextDouble();
        double fullprice1 = weight1 / price1;
        double fullprice2 = weight2 / price2;
        if (fullprice1 > fullprice2) {
            System.out.println("Package 1 has a better price.");
        } else if (fullprice2 > fullprice1) {
            System.out.println("Package 2 has a better price.");
        } else {
            System.out.println("The two packages have the same price.");
        }
    }
}
