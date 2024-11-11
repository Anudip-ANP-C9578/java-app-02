package org.anudip.javaapp02.operation;

//creating a class to return sum of the inputs
public class TwoNonDecimalNumbersDivision {

    public double divide(int a, int b) {

        //creating a variable to return result
        double result = 0;

        //return -2 if any input is 0
        if (a == 0 || b == 0) {
            result = -2;
        }else if (a < 0 || b < 0) { //return -1 if any input is negative
            result = -1;
        }else { //return sum of the inputs
            result = (double) a / b;
        }

        return result;//returns the result
    }
}