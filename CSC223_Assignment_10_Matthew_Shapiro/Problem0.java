/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 8 Problem 8.1      **********/
/**********     Date Last Modified: 2016-11-22              **********/
/*********************************************************************/

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

class Problem0 {

    public static void main(String[] args) {

        // somewhere to hold our numbers
        Hashtable<Integer, Integer> numbers = new Hashtable<Integer, Integer>();

        // and of course our trusty Scanner
        Scanner scan = new Scanner(System.in);

        int input, numTemp;

        // fill the table with values 0 - 50 inclusive
        for (int i = 0; i <= 50; i++) {
            numbers.put(i, 0);
        }

        while (true) {
            System.out.print("Enter a number (0 - 50): ");
            input = Integer.parseInt(scan.nextLine());
            // make sure it's in the range (will exist in hashtable)
            if (!numbers.containsKey(input)) {
                break;
            }

            // get current value *counter* for key *number*
            numTemp = numbers.get(input).intValue() + 1;

            // replace entry with incremented value
            numbers.put(input, numTemp);

        }
        // print out the list of numbers entered
        printNumbers(numbers);
       

    }

    public static void printNumbers(Hashtable<Integer, Integer> numbers) {

        Set<Integer> set = numbers.keySet();

        for (Integer i : set) {
            if (numbers.get(i) > 0) {
                System.out.format("Number: %d\tCount: %d\n", i, numbers.get(i));
            }
        }


    }

}