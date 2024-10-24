/*
*creating a package
*/
package org.anudip.javaapp02.operation;

/*
*creating a class with the name of TwoNonDecimalNumbersDivision 
*/

public class TwoNonDecimalNumbersDivision {
	/*
	 * Method to perform division
	 */
	public double divide(int num1, int num2) {
		/*
		 * Checks for negative numbers
		 */
		if (num1 < 0 || num2 < 0) {
			return -1.0;
		}
		/*
		 * Checks for zero values
		 */
		if (num1 == 0 || num2 == 0) {
			return -2.0;
		}
		/*
		 * Perform the division
		 */
		return (double) num1 / num2;
	}
}