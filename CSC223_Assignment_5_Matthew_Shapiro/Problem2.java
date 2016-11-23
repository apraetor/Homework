/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 5 P2         **********/
/**********     Date Last Modified: 2016-10-11              **********/
/*********************************************************************/

import java.util.ArrayList;

class Problem2 {

    public static void main(String[] args) {

        ArrayList<TicketMachine> holding = new ArrayList<TicketMachine>();

        holding.add(new TicketMachine(9.75, 10.00, 1100));
        holding.add(new TicketMachine(9.75, 22.00));
        holding.add(new TicketMachine());

        printInstances(holding);

    }

    public static void printInstances(ArrayList<TicketMachine> holding) {

        for (TicketMachine t : holding) {

            t.printTicketMachineInfo();

        }
    }

}