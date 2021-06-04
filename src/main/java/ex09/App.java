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

        int length = myApp.getLength();
        int width = myApp.getWidth();

        int totalSqFeet = length * width;
        int totalGallons = myApp.gallonsNeeded(totalSqFeet);

        String outputString = myApp.generateOutput(totalGallons, totalSqFeet);
        myApp.output(outputString);
    }

    public int getLength() {
        System.out.print("What is the length of the ceiling? ");
        return in.nextInt();
    }

    public int getWidth() {
        System.out.print("What is the width of the ceiling? ");
        return in.nextInt();
    }

    public int gallonsNeeded(int totalSqFeet) {
        return (int) Math.ceil(totalSqFeet / CONVERSION);
    }

    public String generateOutput(int totalGallons, int sqFeet) {
        return String.format("You will need to purchase %d gallons of paint to cover %d square feet.",
                totalGallons, sqFeet);
    }

    public void output(String outputString) {
        System.out.println(outputString);
    }
}
