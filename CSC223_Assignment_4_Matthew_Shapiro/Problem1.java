/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 4 P1         **********/
/**********     Date Last Modified: 2016-10-01              **********/
/*********************************************************************/

import java.util.Scanner;


class Problem1 {

    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        Rectangle rect = new Rectangle();

        rect.setWidth(askWidth());
        rect.setHeight(askHeight());

        System.out.format("\nArea: %f\nPerimeter: %f\n", rect.findArea(), rect.findPerimeter());

    }

    public static double askWidth() {

        System.out.print("Width: ");
        return scan.nextDouble();

    }

    public static double askHeight() {

        System.out.print("Height: ");
        return scan.nextDouble();
    }


}
