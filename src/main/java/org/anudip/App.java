package org.anudip;

import org.anudip.javaapp02.operation.TwoNonDecimalNumbersDivision;

public class App
{
public static void main(String[] args)
{
TwoNonDecimalNumbersDivision twonondecimalnumbersdivision = new TwoNonDecimalNumbersDivision();

double result1 = twonondecimalnumbersdivision.divide(10,2);
System.out.println(result1);

double result2 = twonondecimalnumbersdivision.divide(10,3);
System.out.println(result2);

double result3 = twonondecimalnumbersdivision.divide(10,4);
System.out.println(result3);

double result4 = twonondecimalnumbersdivision.divide(2,10);
System.out.println(result4);

double result5 = twonondecimalnumbersdivision.divide(10,-2);
System.out.println(result5);

double result6 = twonondecimalnumbersdivision.divide(-10,2);
System.out.println(result6);

double result7 = twonondecimalnumbersdivision.divide(-10,-2);
System.out.println(result7);

double result8 = twonondecimalnumbersdivision.divide(10,0);
System.out.println(result8);

double result9 = twonondecimalnumbersdivision.divide(0,2);
System.out.println(result9);

double result10 = twonondecimalnumbersdivision.divide(0,0);
System.out.println(result10);
}
}