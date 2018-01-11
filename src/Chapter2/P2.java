package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate price of food, tax, tip, and grand total given price of
 * meal, drink, and dessert
 *
 * @author Nick Gonzalez
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meaprice, driprice, desprice, foodprice, tax, tip, total;
        System.out.print("What was the price of your meal? $");
        meaprice = in.nextDouble();
        System.out.print("What was the price of your drink? $");
        driprice = in.nextDouble();
        System.out.print("What was the price of your dessert? $");
        desprice = in.nextDouble();
        foodprice = meaprice + driprice + desprice;
        tax = foodprice * 0.1;
        tip = (foodprice + tax) * 0.15;
        total = foodprice + tax + tip;
        System.out.println("Price of food: $" + foodprice + "\nTax: $" + tax + "\nTip: $" + tip + "\nGrand total: " + total);
    }

}
