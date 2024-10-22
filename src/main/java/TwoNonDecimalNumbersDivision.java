package org.anudip.javaapp02.operation;

public class TwoNonDecimalNumbersDivision{
    
	// this methord is to Division 2 integer values
	
    public double divide(int num1, int num2) {
        // Check for negative numbers
	double result = 0;
	
        if ((num1 < 0) || (num2 < 0)) {
            result = -1;
        }
        
        // Check for zero values
        else if (num1 == 0 || num2 == 0) {
            result = -2;
        }
        
        // Perform Division and return the result
        else {
	result = (double) num1 / num2;// here the veriables are converted in double type
        
	}
	return result;	
     }
}