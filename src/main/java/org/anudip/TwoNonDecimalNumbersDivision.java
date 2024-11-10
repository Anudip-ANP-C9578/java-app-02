package org.anudip.operation;

 public class TwoNonDecimalNumbersDivision {

    public double divide(int num1, int num2) {
        // Return -1.0 if any of the numbers are negative
        if (num1 < 0 || num2 < 0) {
            return -1.0;
        }

        // Return -2.0 if any of the numbers are zero
        if (num1 == 0 || num2 == 0) {
            return -2.0;
        }

        // Perform the division and return the result as a double
        return (double) num1 / num2;
    }
}
