package Chapter7;

import java.util.Scanner;

/**
 * Program to find the minimum of ten numbers
 *
 * @author Nick Gonzalez
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] arr = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextDouble();
        }
        System.out.println("The minimum is " + min(arr));
    }

    public static double min(double[] arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                min = arr[i];
            }
        }
        return min;
    }
}
