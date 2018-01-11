package Chapter2;

import java.util.Scanner;

/**
 * Program to compute the area and volume of a cylinder given the radius and
 * length
 *
 * @author Nick Gonzalez
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = in.nextDouble();
        System.out.print("Enter the length of the cylinder: ");
        double length = in.nextDouble();
        double area = radius * radius * 3.14;
        double volume = area * length;
        System.out.println("The area of the cylinder is " + area);
        System.out.println("The volume of the cylinder is " + volume);
    }
}
