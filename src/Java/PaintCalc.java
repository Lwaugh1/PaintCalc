package Java;

import java.util.Scanner;

public class PaintCalc {
    public static void main(String args[]) {
        //call scanner outside of object and make object callable
        Scanner scan = new Scanner(System.in);
        System.out.println("Height of Room (m)?");
        double height = scan.nextDouble();
        System.out.println("Width of Room (m)?");
        double width = scan.nextDouble();
        System.out.println("Length of Room (m)?");
        double length = scan.nextDouble();
        System.out.println("Number of Coats (m)?");
        int coats = scan.nextInt();

        //perimeter and height of room with 4 walls (m)
        double P = 2 * width + 2 * length;
        double A = P * height;
        //System.out.println(A + "m");
        //coats of paint (emulsion 14 m^2 per litre) to cover the walls
        double paint = (coats * A) / 14;
        paint = Math.round(paint);
        System.out.println("Paint Required");
        System.out.println(paint + " " + "litres");
    }
}

