/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 2 Problem 2.8       **********/
/**********     Date Last Modified: 2016-09-21              **********/
/*********************************************************************/

import java.util.Scanner;

class Problem2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter time in HH:MM:SS format: ");
        String inputTime = scan.nextLine();
        // split input string on ':' and store to array
        String[] splitTime = inputTime.split(":");

        for (String element : splitTime) {System.out.println(element);}

        int totalSeconds = Integer.parseInt(splitTime[2]);
        totalSeconds += (Integer.parseInt(splitTime[1]) * 60);
        totalSeconds += (Integer.parseInt(splitTime[0]) * 3600);

        System.out.format("Total time in seconds: %d\n", totalSeconds);

    }



}