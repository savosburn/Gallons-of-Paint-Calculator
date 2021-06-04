/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_numGallons_and_total_sqFeet() {
        App myApp = new App();

        int totalGal = (int) Math.ceil(36 * 10 / 350.0);
        int sqFeet = 36 * 10;

        String expectedOutput = "You will need to purchase 2 gallons of paint to cover 360 square feet.";

        String actualOutput = myApp.generateOutput(totalGal, sqFeet);

        assertEquals(expectedOutput, actualOutput);
    }
}