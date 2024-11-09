
package org.anudip;

import org.anudip.javaapp02.operation.TwoNonDecimalNumbersDivision ;

public class App {
	public static void main(String[] args) 
        {
         TwoNonDecimalNumbersDivision twoNonDecimalNumbersDivision =new TwoNonDecimalNumbersDivision ();
 
double res1=twoNonDecimalNumbersDivision.divide(10,2);
System.out.println(res1);
	
double res2=twoNonDecimalNumbersDivision.divide(10,3);
System.out.println(res2);

double res3=twoNonDecimalNumbersDivision.divide(10,4);
System.out.println(res3);

double res4=twoNonDecimalNumbersDivision.divide(2,10);
System.out.println(res4);

double res5=twoNonDecimalNumbersDivision.divide(10,-2);
System.out.println(res5);

double res6=twoNonDecimalNumbersDivision.divide(-10,2);
System.out.println(res6);

double res7=twoNonDecimalNumbersDivision.divide(-10,-2);
System.out.println(res7);

double res8=twoNonDecimalNumbersDivision.divide(10,0);
System.out.println(res8);

double res9=twoNonDecimalNumbersDivision.divide(0,2);
System.out.println(res9);

double res10=twoNonDecimalNumbersDivision.divide(0,0);
System.out.println(res10);

      }
}