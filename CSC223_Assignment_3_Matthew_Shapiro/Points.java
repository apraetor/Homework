/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 3 Problem 3.5       **********/
/**********     Date Last Modified: 2016-09-28              **********/
/*********************************************************************/

import java.util.Scanner;

class Points {

    private int x, y;

    public int getX() {
    
        return this.x;
    
    }

    public int getY() {
    
        return this.y;
    
    }

    public void setX(int x) {
    
        this.x = x;
    
    }

    public void setY(int y) {
    
        this.y = y;
    
    }

    public void askCoords() {

        Scanner scan = new Scanner(System.in);

        System.out.print("\tX: ");
        this.x = scan.nextInt();
        System.out.print("\tY: ");
        this.y = scan.nextInt();

    }






}