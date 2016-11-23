/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 5 P1         **********/
/**********     Date Last Modified: 2016-10-11              **********/
/*********************************************************************/

import java.util.ArrayList;

class Problem1 {

    public static void main(String[] args) {

        ArrayList<Person> holding = new ArrayList<Person>();

        holding.add(new Person("Morse", "Joe", 33));
        holding.add(new Person("Shapiro", "Matthew", 32));

        printPeople(holding);

    }

    public static void printPeople(ArrayList<Person> holding) {

        System.out.println("People:");

        for (Person p : holding) {

            p.printPerson();

        }

    }


}