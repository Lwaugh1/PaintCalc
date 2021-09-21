package Java;

import java.util.Scanner;

public class PaintCalc {
    static void paint(double width, double length, double height, int windows, int doors, int coats, String userInput) {
        switch (userInput) {
            case "wall":
                double A = height * length;
                double paint = coats * (A) / 14;
                paint = Math.round(paint);
                System.out.println("Paint Required");
                System.out.println(paint + " " + "litres");
                break;

            case "room":
                double P = 2 * width + 2 * length;
                A = P * height;
                double windowsArea = 0.6 * 0.63 * windows;
                double doorsArea = 1.981 * 0.762 * doors;
                paint = coats * (A - windowsArea - doorsArea) / 14;
                paint = Math.round(paint);
                System.out.println("Paint Required");
                System.out.println(paint + " " + "litres");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("room or wall?");
        String userInput = scan.nextLine();
        switch (userInput) {
            case "room":
                System.out.println("Height of Room (m)?");
                double height = scan.nextDouble();
                System.out.println("Length of Room (m)?");
                double length = scan.nextDouble();
                System.out.println("Width of Room (m)?");
                double width = scan.nextDouble();
                System.out.println("Number of Coats?");
                int coats = scan.nextInt();
                System.out.println("How many Windows?");
                int windows = scan.nextInt();
                System.out.println("How many Doors?");
                int doors = scan.nextInt();
                paint(width, length, height, windows, doors, coats, userInput);
                break;

            case "wall":
                System.out.println("Height of Wall (m)?");
                height = scan.nextDouble();
                System.out.println("Length of Wall (m)?");
                length = scan.nextDouble();
                System.out.println("Number of Coats?");
                coats = scan.nextInt();
                System.out.println("How many Windows?");
                windows = scan.nextInt();
                System.out.println("How many Doors?");
                doors = scan.nextInt();
                paint(0, length, height, windows, doors, coats, userInput);
                break;
        }
    }
}

