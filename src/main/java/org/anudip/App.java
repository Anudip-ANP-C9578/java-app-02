package org.anudip;

//importing the TwoNonDecimalNumbersDivision
import org.anudip.javaapp02.operation.TwoNonDecimalNumbersDivision;

public class App {
    public static void main(String[] args) {
		//creating a constructor
        TwoNonDecimalNumbersDivision twoNonDecimalNumbersDivision = new TwoNonDecimalNumbersDivision();

        //Checking for different test cases
        double result1 = twoNonDecimalNumbersDivision.divide(10, 2);
        
        double result2 = twoNonDecimalNumbersDivision.divide(10, 3);
        
		double result3 = twoNonDecimalNumbersDivision.divide(10, 4);
		
		double result4 = twoNonDecimalNumbersDivision.divide(2, 10);
		
		double result5 = twoNonDecimalNumbersDivision.divide(10, -2);
		
		double result6 = twoNonDecimalNumbersDivision.divide(-10, 2);
		
		double result7 = twoNonDecimalNumbersDivision.divide(-10, -2);
		
		double result8 = twoNonDecimalNumbersDivision.divide(10, 0);
		
		double result9 = twoNonDecimalNumbersDivision.divide(0, 2);
		
		double result10 = twoNonDecimalNumbersDivision.divide(0, 0);
		
    }
}