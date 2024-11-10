package org.anudip;

import org.anudip.operation.TwoNonDecimalNumbersDivision;

 public class App {
	public static void main(String[] args) {
       TwoNonDecimalNumbersDivision division = new TwoNonDecimalNumbersDivision();

        // Test cases
        System.out.println(division.divide(10, 2));  // Expected: 5.0
        System.out.println(division.divide(10, 3));  // Expected: 3.3333333333333335
        System.out.println(division.divide(10, 4));  // Expected: 2.5
        System.out.println(division.divide(2, 10));  // Expected: 0.2
        System.out.println(division.divide(10, -2)); // Expected: -1.0
        System.out.println(division.divide(-10, 2)); // Expected: -1.0
        System.out.println(division.divide(-10, -2)); // Expected: -1.0
        System.out.println(division.divide(10, 0));  // Expected: -2.0
        System.out.println(division.divide(0, 2));   // Expected: -2.0
        System.out.println(division.divide(0, 0));   // Expected: -2.0
    }
}
