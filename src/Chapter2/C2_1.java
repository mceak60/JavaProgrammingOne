package Chapter2;

import java.util.Scanner;

/**
 * Program to convert a temperature in Celsius to Fahrenheit
 *
 * @author Nick Gonzalez
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double cel = in.nextDouble();
        double far = ((9.0 / 5.0) * cel + 32);
        System.out.println(cel + " degrees Celsius is " + far + " degrees Fahrenheit");
    }

}
