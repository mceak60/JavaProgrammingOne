package Chapter3;

import java.util.Scanner;

/**
 * Program to prompt the user to guess heads or tails, simulated by a randomly
 * generated number
 *
 * @author Nick Gonzalez
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double guess = Math.random();
        System.out.println("Guess whether the coin lands on heads or tails! \nType h for heads and t for tails.");
        String s = in.next();
        if (s.equals("h")) {
            if (guess < .5) {
                System.out.println("Incorrect! The coin landed on Tails!");
            } else {
                System.out.println("Correct! The coin landed on Heads!");
            }
        } else if (s.equals("t")) {
            if (guess < .5) {
                System.out.println("Correct! The coin landed on Tails!");
            } else {
                System.out.println("Incorrect! The coin landed on Heads!");
            }
        } else {
            System.out.println("Invalid response.");
        }
    }
}
