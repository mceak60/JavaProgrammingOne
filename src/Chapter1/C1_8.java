package Chapter1;

/**
 * Program to compute the area and perimeter of a circle given a radius
 *
 * @author Nick Gonzalez
 */
public class C1_8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double radius = 5.5;
        double perimeter = 2 * radius * 3.14;
        double area = radius * radius * 3.14;
        System.out.println("Area : " + area);
        System.out.println("Perimeter : " + perimeter);
    }
}
