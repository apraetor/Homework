/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 9 P1         **********/
/**********     Date Last Modified: 2016-11-08              **********/
/*********************************************************************/


//********************************************************************
//  Student.java       Author: Lewis/Loftus
//
//  Represents a college student.
//********************************************************************

public class Student
{
   private String firstName, lastName;
   private Address homeAddress, schoolAddress;
   private double[] testScores = new double[3];

   //-----------------------------------------------------------------
   //  Constructor: Sets up this student with the specified values.
   //-----------------------------------------------------------------
   public Student(String first, String last, Address home, Address school, double test1, double test2, double test3) {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      this.testScores[0] = test1;
      this.testScores[1] = test2;
      this.testScores[2] = test3;
   }


   public Student (String first, String last, Address home,
                   Address school)
   {
      this(first, last, home, school, 0, 0, 0);
   }

   public Student(String first, String last, double test1, double test2, double test3) {
      // no-address constructor so I don't have to create two Address objects for each Student
      this.firstName = first;
      this.lastName = last;
      this.testScores[0] = test1;
      this.testScores[1] = test2;
      this.testScores[2] = test3;
   }

   public Student(String first, String last) {
      // takes Student name, assigns 0.0 for test scores.
      this(first, last, 0, 0, 0);
   }

   public String getFirstName() {
      return this.firstName;
   }

   public String getLastName() {
      return this.lastName;
   }


   // computes average test score
   public double average() {
      double sum = 0;

      for (double i : testScores) {
         sum += i;
      }

      return sum / testScores.length;
   }

   // Sets test score
   public Student setTestScore(int test, double score) {
      this.testScores[test - 1] = score;
      return this;
   }

   // gets test score
   public double getTestScore(int test) {
      return this.testScores[test - 1];
   }


   //-----------------------------------------------------------------
   //  Returns a string description of this Student object.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      result += "School Address:\n" + schoolAddress;

      return result;
   }
}
