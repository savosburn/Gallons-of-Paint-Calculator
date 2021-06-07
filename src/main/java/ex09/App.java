/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex09;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static double CONVERSION = 350;

    public static void main(String[] args) {
        App myApp = new App();

        double length = myApp.getLength();
        double width = myApp.getWidth();

        double totalSqFeet = length * width;
        int totalGallons = myApp.gallonsNeeded(totalSqFeet);

        String outputString = myApp.generateOutput(totalGallons, totalSqFeet);
        myApp.output(outputString);
    }

    public double getLength() {
        System.out.print("What is the length of the ceiling? ");

        // User can only enter number
        while (!in.hasNextDouble()) {
            System.out.print("Invalid length. Enter again: ");
            in.next();
        }

        return in.nextInt();
    }

    public double getWidth() {
        System.out.print("What is the width of the ceiling? ");

        // User can only enter number
        while (!in.hasNextDouble()) {
            System.out.print("Invalid width. Enter again: ");
            in.next();
        }

        return in.nextInt();
    }

    public int gallonsNeeded(double totalSqFeet) {

        return (int) Math.ceil(totalSqFeet / CONVERSION);
    }

    public String generateOutput(int totalGallons, double sqFeet) {
        int sF;
        String sqFeetAmount = Double.toString(sqFeet);

        if (sqFeet % 1 == 0) {
            sF = (int) sqFeet;
            sqFeetAmount = String.format("%d", sF);
        }

        return String.format("You will need to purchase %d gallons of paint to cover %s square feet.",
                totalGallons, sqFeetAmount);
    }

    public void output(String outputString) {
        System.out.println(outputString);
    }
}
