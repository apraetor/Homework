/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 3 Problem 3.1       **********/
/**********     Date Last Modified: 2016-09-28              **********/
/*********************************************************************/


import java.util.Random;
import java.util.Scanner;

class Problem1 {

    public static void main(String[] args) {

        Random generator = new Random();
        Person p = new Person();

        // tell Person p to ask for a name
        p.askName();

        String f = String.valueOf(p.getfName().charAt(0));
        String l = p.getlName().substring(0, 5);

        String num = Integer.toString((generator.nextInt(90) + 10));

        System.out.println(f + l + num);

    }
    




}