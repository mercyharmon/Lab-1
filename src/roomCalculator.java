
import java.util.Scanner;

public class roomCalculator {
    public static double width = -1.0;
    public static double height = -1.0;

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to the Grand Circus Room Detail Generator!");
        System.out.println();
        System.out.println("Enter in the width of the room");
        width = scnr.nextDouble();



        System.out.println("Enter in the height of the room");
        height = scnr.nextDouble();

        System.out.println("The area of the rectangle is " + width*height + " feet.");

        System.out.println("The perimeter of the rectangle is " + 2*(width + height) +" feet.");

        scnr.close();

        
    }

}