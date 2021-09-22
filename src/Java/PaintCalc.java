package Java;

import java.util.Scanner;

public class PaintCalc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] colours = {14, 7, 2, 30};
        int coverage = 0;
        System.out.println("blue, red, white or yellow?");
        String userInput = scan.nextLine();
        switch (userInput) {
            case "blue":
                coverage = colours[0];
                break;
            case "red":
                coverage = colours[1];
                break;
            case "white":
                coverage = colours[2];
                break;
            case "yellow":
                coverage = colours[3];
                break;
        }
        System.out.println("room or wall?");
        userInput = scan.nextLine();
        switch (userInput) {
            case "room":
                System.out.println("regular or irregular room?");
                userInput = scan.nextLine();
                switch (userInput) {
                    case "regular":
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
                        System.out.println("Paint Required");
                        System.out.println(calcRoom(width, length, height, windows, doors, coats, coverage) + " litres");
                        break;

                    case "irregular":
                        width = 0;
                        double total = 0;
                        System.out.println("Number of Coats?");
                        coats = scan.nextInt();
                        System.out.println("How many Walls?");
                        int n = scan.nextInt();
                        for (int i = 1; i <= n; i++) {
                            System.out.println("Height of Wall " + i + " (m)?");
                            height = scan.nextDouble();
                            System.out.println("Length of Wall " + i + " (m)?");
                            length = scan.nextDouble();
                            System.out.println("How many Windows on Wall " + i + "?");
                            windows = scan.nextInt();
                            System.out.println("How many Doors on Wall " + i + "?");
                            doors = scan.nextInt();
                            total = total + calcRoom(width, length, height, windows, doors, coats, coverage);
                        }
                        System.out.println("Paint Required");
                        System.out.println(total + " litres");

                        break;
                }
                break;
            case "wall":
                System.out.println("Height of Wall (m)?");
                double height = scan.nextDouble();
                System.out.println("Length of Wall (m)?");
                double length = scan.nextDouble();
                System.out.println("Number of Coats?");
                int coats = scan.nextInt();
                System.out.println("How many Windows?");
                int windows = scan.nextInt();
                System.out.println("How many Doors?");
                int doors = scan.nextInt();
                System.out.println("Paint Required");
                System.out.println(calcWall(length, height, windows, doors, coats, coverage) + " litres");
                break;
        }

    }

    public static double calcRoom(double width, double length, double height, int windows, int doors, int coats, int coverage) {

        double P = 2 * width + 2 * length;
        double A = P * height;
        double windowsArea = 0.6 * 0.63 * windows;
        double doorsArea = 1.981 * 0.762 * doors;
        double paint = coats * (A - windowsArea - doorsArea) / coverage;
        paint = Math.ceil(paint);

        return paint;
    }

    public static double calcWall(double length, double height, int windows, int doors, int coats, int coverage) {

        double A = height * length;
        double windowsArea = 0.6 * 0.63 * windows;
        double doorsArea = 1.981 * 0.762 * doors;
        double paint = coats * (A - windowsArea - doorsArea) / coverage;
        paint = Math.ceil(paint);

        return paint;


    }
}

