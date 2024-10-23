package org.anudip;

import org.anudip.javaapp02.operation.TwoNonDecimalNumbersDivision;

public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersDivision twoNonDecimalNumbersDivision = new TwoNonDecimalNumbersDivision();
		
		double result1 = twoNonDecimalNumbersDivision.divide(10,2);
		System.out.println(result1);
		
		double result2 = twoNonDecimalNumbersDivision.divide(10,3);
		System.out.println(result2);
		
		double result3 = twoNonDecimalNumbersDivision.divide(10,4);
		System.out.println(result3);
		
		double result4 = twoNonDecimalNumbersDivision.divide(2,10);
		System.out.println(result4);
        		
		double result5 = twoNonDecimalNumbersDivision.divide(10,-2);
		System.out.println(result5);
		
		double result6 = twoNonDecimalNumbersDivision.divide(-10,2);
		System.out.println(result6);
		
		double result7 = twoNonDecimalNumbersDivision.divide(-10,-2);
		System.out.println(result7);
		
		double result8 = twoNonDecimalNumbersDivision.divide(10,0);
		System.out.println(result8);
		
		double result9 = twoNonDecimalNumbersDivision.divide(0,2);
		System.out.println(result9);
		
		double result10 = twoNonDecimalNumbersDivision.divide(0,0);
		System.out.println(result10);
	}
}