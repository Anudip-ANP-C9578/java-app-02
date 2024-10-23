package org.anudip.javaapp02.operation;

public class TwoNonDecimalNumbersDivision{

        // method to divide two values

    public double divide(int num1, int num2) {
        // Checking for negative numbers
        double result = 0;

        if ((num1 < 0) || (num2 < 0)) {
            result = -1;
        }

        // Checking zero value
        else if (num1 == 0 || num2 == 0) {
            result = -2;
        }

        // Performing dividion operation
        else {
        result = (double) num1 / num2;// converting into double

        }
        return result;        
     }
}