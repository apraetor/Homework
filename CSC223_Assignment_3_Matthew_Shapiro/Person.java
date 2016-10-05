/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 3 Problem 3.1       **********/
/**********     Date Last Modified: 2016-09-28              **********/
/*********************************************************************/

import java.util.Scanner;

class Person {

    private String fName;
    private String lName;

    String getfName() {

        return this.fName;

    }

    String getlName() {

        return this.lName;

    }

    void askName() {

        Scanner scan = new Scanner(System.in);

        System.out.print("First Name: ");
        this.fName = scan.next();
        
        System.out.print("Last Name ");
        this.lName = scan.next();


    }


}