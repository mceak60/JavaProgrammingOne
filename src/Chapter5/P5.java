package Chapter5;

import java.util.Scanner;

/**
 * Program to tally the amount of yes and no votes
 *
 * @author Nick Gonzalez
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = 0;
        int n = 0;
        int q = 0;
        while (q < 1) {
            System.out.print("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting: ");
            String s = in.next();
            if (s.equals("Y") || s.equals("y")) {
                y++;
            } else if (s.equals("N") || s.equals("n")) {
                n++;
            } else if (s.equals("Q") || s.equals("q")) {
                q++;
            } else {
                System.out.print("INVALID CODE: ");
            }
        }
        System.out.printf("Totals:\nYes: %d\nNo: %d\n", y, n);
    }
}
