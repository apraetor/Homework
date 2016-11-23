/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 6 P2         **********/
/**********     Date Last Modified: 2016-10-17              **********/
/*********************************************************************/

import java.util.ArrayList;

class FlightTest {

    static ArrayList<Flight> holding = new ArrayList<Flight>();

    public static void main(String[] args) {

        Flight one = new Flight("AA", "BDL", "FTW", 1337);
        Flight two = new Flight("ASDF", "LAX", "FTW", 4237);

        holding.add(one);
        holding.add(two);

        System.out.println("********************************************************************************");
        printFlights();

        one.setDestination("PWN");
        two.setAirlineName("DL");

        System.out.println("********************************************************************************");
        printFlights();

        one.setOrigin("LGA");

        System.out.println("********************************************************************************");
        printFlights();
    }


    public static void printFlights() {

        for (Flight f : holding) {

            System.out.println(f);

        }
    }

}