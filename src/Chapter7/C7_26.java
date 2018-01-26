package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program to determine of two lists are equal
 *
 * @author Nick Gonzalez
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many integers in list 1? ");
        int l1 = in.nextInt();
        int[] list1 = new int[l1];
        System.out.print("Enter a list of integers: ");
        for (int i = 0; i < l1; i++) {
            list1[i] = in.nextInt();
        }
        System.out.print("How many integers in list 2? ");
        int l2 = in.nextInt();
        int[] list2 = new int[l1];
        System.out.print("Enter a list of integers: ");
        for (int i = 0; i < l2; i++) {
            list2[i] = in.nextInt();
        }
        if (equals(list1, list2)) {
            System.out.println("List 1 and list 2 are equal");
        } else {
            System.out.println("List 1 and list 2 are not equal");
        }
    }

    /**
     * Method to compare two lists
     *
     * @param list1 first list to be compared
     * @param list2 second list to be compared
     * @return true if they are equal, false if they are not
     */
    public static boolean equals(int[] list1, int[] list2) {
        if (Arrays.equals(list1, list2)) {
            return true;
        } else {
            return false;
        }
    }

}
