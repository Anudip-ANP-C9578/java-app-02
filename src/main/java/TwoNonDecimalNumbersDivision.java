package org.anudip.javaapp02.operation;

public class TwoNonDecimalNumbersDivision {
    
    public double divide(int num1, int num2) {
        // Check for negative numbers
        if (num1 < 0 || num2 < 0) {
            return -1.0;
        }
        
        // Check for zero values
        else if (num1 == 0 || num2 == 0) {
            return -2.0;
        }
        
        // Perform division and return the result
        else {
	double div = (double) num1 / num2;
        return div;
	}
     }
}
