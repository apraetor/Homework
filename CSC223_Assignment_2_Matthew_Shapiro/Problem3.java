/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 2 Problem 2.11      **********/
/**********     Date Last Modified: 2016-09-21              **********/
/*********************************************************************/

import java.util.Scanner;

class Problem3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter amount: $");
        double amount = scan.nextDouble();
        // cast product to (int); we only care about integer component
        // .round() to the nearest cent to handle .9999999999
        int amountCents = (int) Math.round((amount * 100));

        int tens, fives, ones, quarters, dimes, nickels, pennies;

        // number of *tens* is integer division result
        tens = amountCents / 1000;
        // amountCents becomes integer division remainder (modulo)
        amountCents %= 1000;

        // repeat process in order of descending denomination
        fives = amountCents / 500;
        amountCents %= 500;

        ones = amountCents / 100;
        amountCents %= 100;

        quarters = amountCents / 25;
        amountCents %= 25;

        dimes = amountCents / 10;
        amountCents %= 10;

        nickels = amountCents / 5;
        amountCents %= 5;

        pennies = amountCents;

        // waste not, want not; why print lines we don't need?
        if (tens != 0) {System.out.format("Tens: %d\n", tens);}
        if (fives != 0) {System.out.format("Fives: %d\n", fives);}
        if (ones != 0) {System.out.format("Ones: %d\n", ones);}
        if (quarters != 0) {System.out.format("Quarters: %d\n", quarters);}
        if (dimes != 0) {System.out.format("Dimes: %d\n", dimes);}
        if (nickels != 0) {System.out.format("Nickels: %d\n", nickels);}
        if (pennies != 0) {System.out.format("Pennies: %d\n", pennies);}





    }



}
