/*
*creating a package
*/
package org.anudip.javaapp02.operation;

/*
*creating a class named TwoNonDecimalNumbersDivision
*accessible to any class 
*/
public class TwoNonDecimalNumbersDivision {

/*
*creating a method named divide and  this method contains
*two parameters of int type and returns double type 
*/

    public double divide(int num1, int num2) {
		double result = 0;
		
		/*checking if number is negative and 
		*if negative return -1.0
		*/
		if (num1 < 0 || num2 < 0) {
			return -1.0;
		} 
		
		/*checking if number is 0 and 
		*if 0 return -2.0
		*/
		else if(num1 == 0 || num2 == 0) {
			return -2.0;
		} 
		
		//performs division if number is neither negative nor 0
		else {
            result = (double) num1 / num2;
        }
        return result;
    }
}	