package Chapter7;

import java.util.Scanner;

/**
 * Program to determine the average of a set of numbers
 *
 * @author Nick Gonzalez
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers will be read? ");
        int n = in.nextInt();
        double[] arr = new double[n];
        fillArr(arr);
        System.out.println("\nThe average is " + avgArr(arr));
        printArr(arr);
    }

    /**
     * Method to fill an array with values entered by user
     *
     * @param arr array to be filled
     */
    public static void fillArr(double[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Please enter a value: ");
            arr[i] = in.nextDouble();
        }
    }

    /**
     * Method to find the average value of an array
     *
     * @param arr array to determine the average of
     */
    public static double avgArr(double[] arr) {
        int sum = 0;
        double avg;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        return avg;
    }

    /**
     * Method to print the contents of an array
     *
     * @param arr array to be printed
     */
    public static void printArr(double[] arr) {
        System.out.println("The contents of the array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
