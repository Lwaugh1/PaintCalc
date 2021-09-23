package Java;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double totalArea = 0;
        int coverage =0;
        Scanner scan = new Scanner(System.in);

        Paint White = new Paint("White", 10);
        Paint Blue = new Paint("Blue", 12);
        Paint Yellow = new Paint("Yellow", 15);
        Paint Magenta = new Paint("Magenta", 20);

        ArrayList<Paint> paint =  new ArrayList<Paint>();
        paint.add(White);
        paint.add(Blue);
        paint.add(Yellow);
        paint.add(Magenta);


        System.out.println("Welcome to Paint Calculator!!");
        System.out.println("Choose your paint from the following options: ");

        for(Paint p: paint){
            System.out.println(p.getColour());
        }
        System.out.println(" ");
        System.out.println("Type Here");
        String userInput = scan.nextLine();

        switch (userInput) {
            case "White":
               coverage = White.getCoverage();
               System.out.println("You have chosen " + White.getColour());
               break;
            case "Blue":
                coverage = Blue.getCoverage();
                System.out.println("You have chosen " + Blue.getColour());
                break;
            case "Yellow":
                coverage = Yellow.getCoverage();
                System.out.println("You have chosen " + Yellow.getColour());
                break;
            case "Magenta":
                coverage = Magenta.getCoverage();
                System.out.println("You have chosen " + Magenta.getColour());
                break;
        }
        System.out.println(coverage);
        System.out.println("How may walls are you painting?");
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++){
            totalArea = 0;
            System.out.println("Height of Wall " + i + " (m)?");
            double height = scan.nextDouble();
            System.out.println("Length of Wall " + i + " (m)?");
            double length = scan.nextDouble();
            System.out.println("How many Windows on Wall " + i + "?");
            int windows = scan.nextInt();
            System.out.println("How many Doors on Wall " + i + "?");
            int doors = scan.nextInt();
            totalArea = totalArea + calcWall(length, height, windows, doors);
        }
        System.out.println(totalArea);
        System.out.println("How many coats of paint?");
        int coats = scan.nextInt();
        System.out.println("Paint Required");
        System.out.println(paintArea(totalArea, coats, coverage) + " litres");
    }

    public static double calcWall(double length, double height, int windows, int doors) {

        double wallArea = (height * length) - (1.981 * 0.762 * doors) - (0.6 * 0.63 * windows);

        return wallArea;
    }

    public static double paintArea(double totalArea, int coats, int coverage) {
        double paintArea = coats * (totalArea) / coverage;
        paintArea = Math.ceil(paintArea);

        return paintArea;
    }
}


