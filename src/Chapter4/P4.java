package Chapter4;
import java.util.Scanner;

/**
 * Program to determine which of two bids is better given hours and charge
 * 
 * @author Nick Gonzalez
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        String name1, name2;
        int hours1, hours2;
        double rate1, rate2, cost1, cost2;
        Scanner in = new Scanner(System.in);
        System.out.print("What is the name of the first bidder? ");
        name1 = in.next();
        System.out.print("How many hours does the first bidder require? ");
        hours1 = in.nextInt();
        System.out.print("What is the first bidder's hourly charge? ");
        rate1 = in.nextDouble();
        System.out.print("What is the name of the second bidder? ");
        name2 = in.next();
        System.out.print("How many hours does the second bidder require? ");
        hours2 = in.nextInt();
        System.out.print("What is the second bidder's hourly charge? ");
        rate2 = in.nextDouble();
        cost1 = hours1 * rate1;
        cost2 = hours2 * rate2;
        if (cost1 < cost2) {
            System.out.printf("The winner is %s with a total cost of $%.2f", name1, cost1);
        } else if (cost2 < cost1) {
            System.out.printf("The winner is %s with a total cost of $%.2f", name2, cost2);
        } else if (hours1 < hours2) {
            System.out.printf("The winner is %s with a total cost of $%.2f and a time of %d hours", name1, cost1, hours1);
        } else if (hours2 < hours1) {
            System.out.printf("The winner is %s with a total cost of $%.2f and a time of %d hours", name2, cost2, hours2);
        } else {
            System.out.printf("%s and %s have identical bids of %d hours, a rate of $%.2f per hour, and a total cost of $%.2f", name1, name2, hours1, rate1, cost1);
        }
    }
}