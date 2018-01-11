package Chapter4;

import java.util.Scanner;

/**
 * Program to display payroll given employee information
 * 
 * @author Nick Gonzalez
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        String name;
        double hours, rate, fed, state, gross, fedD, stateD, totalD, net;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        name = in.next();
        System.out.print("Enter number of hours worked in a week: ");
        hours = in.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        rate = in.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        fed = in.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        state = in.nextDouble();
        gross = hours * rate;
        fedD = fed * gross;
        stateD = state * gross;
        totalD = fedD + stateD;
        net = gross - totalD;
        System.out.printf("\nEmployee's Name: %s", name);
        System.out.printf("\nHours Worked: %.1f", hours);
        System.out.printf("\nPay Rate: $%.2f", rate);
        System.out.printf("\nGross Pay: $%.2f", gross);
        System.out.printf("\nDeductions:");
        System.out.printf("\n Federal Withholding (%.1f%%): $%.2f", (fed * 100), fedD);

        System.out.printf("\n State Withholding (%.1f%%): $%.2f", (state * 100), stateD);
        System.out.printf("\n Total Deduction: $%.2f", totalD);
        System.out.printf("\nNet Pay: $%.2f", net);
    }
}
