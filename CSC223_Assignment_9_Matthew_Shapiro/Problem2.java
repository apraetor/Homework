/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 9 P2         **********/
/**********     Date Last Modified: 2016-11-08              **********/
/*********************************************************************/


public class Problem2{

   public static void main (String[] args) {

      RationalNumber r1 = new RationalNumber (6, 8);
      RationalNumber r2 = new RationalNumber (1, 3);
      RationalNumber r3 = new RationalNumber(12, 16);
      RationalNumber r4 = new RationalNumber(2, 6);


      

      System.out.println(); // print empty line
      
      // show num and denom passed to constructor, as RationalNumber
      // objects will store values in reduced form.
      System.out.println ("(6/8) as RationalNumber: " + r1);
      System.out.println ("(1/3) as RationalNumber: " + r2);
      System.out.println ("(12/16) as RationalNumber: " + r3);
      System.out.println ("(2/6) as RationalNumber: " + r4);


      // End of textbook-provided code
      System.out.println("\n********** r1.compareTo(r2) **********\n");
      System.out.println(r1.compareTo(r2));
      System.out.println("\n********** r2.compareTo(r1) **********\n");
      System.out.println(r2.compareTo(r1));
      System.out.println("\n********** r1.compareTo(r3) **********\n");
      System.out.println(r1.compareTo(r3));
      System.out.println("\n********** r2.compareTo(r4) **********\n");
      System.out.println(r2.compareTo(r4));

   }
}
