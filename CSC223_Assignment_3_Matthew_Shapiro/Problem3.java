/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 3 Problem 3.5       **********/
/**********     Date Last Modified: 2016-09-28              **********/
/*********************************************************************/


class Problem3 {

    public static void main(String[] args) {

        Points a = new Points();
        Points b = new Points();

        System.out.println("");
        System.out.println("First Point: ");
        a.askCoords();
        System.out.println("Second Point: ");
        b.askCoords();

        double distance = calcDistance(a, b);

        System.out.format("\nDistance between points: %f\n\n", distance);

    }

    static double calcDistance(Points a, Points b) {

        double xComponent, yComponent;

        xComponent = Math.pow((b.getX() - a.getX()), 2);
        yComponent = Math.pow((b.getY() - a.getY()), 2);

        return Math.sqrt(xComponent + yComponent);

    }



}
