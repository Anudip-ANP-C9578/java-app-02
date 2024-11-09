/*Program to perform division of two nondecimal numbers*/

package org.anudip.javaapp02.operation;

public class TwoNonDecimalNumbersDivision    /*This class performs the task division of two non-decimal numbers*/
{
	public double divide(int n1, int n2)  /*This method performs the task of division of two non-decimal numbers.*/
	{
	 double res= 0;
	 if((n1 < 0) || (n2 < 0)) {
		 res = -1.0;   /*Return -1.0 if either number is negative*/
		 } 
		 else if((n1 == 0) || (n2 ==0)){
			 res = -2.0;  /*Return -2.0 if either number is negative*/
		 } 
         else{
			 /*Explicit Type casting*/
			 res =(double)n1/n2; /*Performs division operation*/
	     }
		 return res;  /*Returns result after division operation*/
    }
}