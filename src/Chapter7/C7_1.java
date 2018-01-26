package Chapter7;

import java.util.Scanner;

/**
 * Program to display the grade based on an entered score
 *
 * @author Nick Gonzalez
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many scores will be entered? ");
        int num = in.nextInt();
        double best = 0;
        double[] scores = new double[num];
        char[] grades = new char[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter student scores: ");
            scores[i] = in.nextDouble();
            if (scores[i] > best) {
                best = scores[i];
            }
        }
        for (int i = 0; i < num; i++) {
            if (scores[i] >= (best - 10)) {
                grades[i] = 'A';
            } else if (scores[i] >= (best - 20)) {
                grades[i] = 'B';
            } else if (scores[i] >= (best - 30)) {
                grades[i] = 'C';
            } else if (scores[i] >= (best - 40)) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
            System.out.printf("\nStudent %d score is %.2f and grade is %c", i, scores[i], grades[i]);
        }
    }
}
