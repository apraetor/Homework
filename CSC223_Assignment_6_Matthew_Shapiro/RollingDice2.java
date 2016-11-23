/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 6 P3         **********/
/**********     Date Last Modified: 2016-10-17              **********/
/*********************************************************************/

import java.util.ArrayList;
import java.util.Scanner;

class RollingDice2 {

    public static void main(String[] args) {
        // long starttime = System.currentTimeMillis();
        PairOfDice dice = new PairOfDice();
        Scanner scan = new Scanner(System.in);
        int rolls;

        System.out.print("How many rolls? ");
        rolls = Integer.parseInt(scan.nextLine());
        // hardcode when using System.currentTimeMillis() so user input time
        // doesn't alter execution time
        // rolls = 10;
        rollDice(rolls, dice);
        // System.out.println("Execution time in ms: " + (System.currentTimeMillis() - starttime));
    }

    public static void rollDice(int rollCount, PairOfDice dice) {

        System.out.println("********************************************************************************");
        System.out.println("\tD1 + D2 = Total");

        for (int i = 0; i < rollCount; i++) {

            dice.roll();

            System.out.println("Roll " + (i+1) + " | " + dice);

        }

    }

}