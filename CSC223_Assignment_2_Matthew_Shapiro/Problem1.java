/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 2 Problem 2.7       **********/
/**********     Date Last Modified: 2016-09-21              **********/
/*********************************************************************/

import java.util.Scanner;

class Problem1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("*******************************************");
        System.out.println("\tTravel Time Calculator");
        System.out.println("*******************************************");
        System.out.print("Speed (mph): ");
        int speed = scan.nextInt();
        System.out.print("Distance (miles): ");
        int distance = scan.nextInt();
        System.out.format("Travel time: %f hours\n", findTime(speed, distance));


    }

    public static float findTime(int speed, int distance) {

        return (float) distance / speed;

    }


}