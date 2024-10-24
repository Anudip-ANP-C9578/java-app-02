package org.anudip;
import org.anudip.javaapp02.operation.TwoNonDecimalNumbersDivision;

public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersDivision division = new TwoNonDecimalNumbersDivision();
		double result = division.divide(10,3);
		System.out.println(result);
	}
}