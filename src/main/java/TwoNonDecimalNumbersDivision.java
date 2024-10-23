/*Program to perform division of two non-decimal numbers*/

package org.anudip.javaapp02.operation;

public class TwoNonDecimalNumbersDivision     

/*To performs the task division of two non-decimal numbers*/

{
	public double divide(int a, int b)  
	
	/*This method performs the task of division of two non-decimal numbers.*/

       {
		 	double ans = 0;
		
	   		if((a < 0) || (b < 0)) 
            {
		 		ans = -1.0;
	      	} 
           	else if((a == 0) || (b == 0)) 
            {
				ans = -2.0;
	      	} 
           	else 
            {
				//explicit type casting
				ans = (double) a / b; //perform division operation
	     	}
		
	  		return ans;  //returns result of division
      	}
}