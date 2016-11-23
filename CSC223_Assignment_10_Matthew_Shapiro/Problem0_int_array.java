/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 8 Problem 8.1      **********/
/**********     Date Last Modified: 2016-11-22              **********/
/*********************************************************************/

import java.util.Scanner;


class Problem0_int_array {

    public static void main(String[] args) {

        // somewhere to hold our numbers
        // 0 - 50 inclusive (51 members)
        int[] numbers = new int[51];
        // and of course our trusty Scanner
        Scanner scan = new Scanner(System.in);

        int input;

        // fill with zeros
        for (int i = 0; i <= 50; i++) {
            numbers[i] = 0;
        }

        while (true) {
            System.out.print("Enter a number (0 - 50): ");
            input = Integer.parseInt(scan.nextLine());
            // make sure it's in the right range
            if (input < 0 || input > 50) {
                break;
            }

            // increment counter for the number entered
            numbers[input]++;

        }
        // print out the list of numbers entered
        printNumbers(numbers);
       

    }

    public static void printNumbers(int[] numbers) {

        for (int i = 0; i <= 50; i++) {
            if (numbers[i] > 0) {
                System.out.format("Number: %d\tCount: %d\n", i, numbers[i]);
            }
        }


    }

}