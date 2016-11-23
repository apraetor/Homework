/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 6 P1         **********/
/**********     Date Last Modified: 2016-10-16              **********/
/*********************************************************************/
import java.util.ArrayList;

class BoxTest {
    
    static Box one = new Box(5,5,5);
    static Box two = new Box(10,10,10);
    static Box three = new Box(1.25, 1.16, 1.33);

    static ArrayList<Box> holding = new ArrayList<Box>();

    public static void main(String[] args) {

        holding.add(one);
        holding.add(two);
        holding.add(three);

        System.out.println("********************************************************************************");
        printBoxes();

        randomFill();

        System.out.println("********************************************************************************");
        printBoxes();


    }

    public static void printBoxes() {

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

    }

    // calls .setFull() on each Box with random 'true' or 'false' argument
    public static void randomFill() {

        boolean f;
        int randInt;

        for (Box b : holding) {
            // random integer between 0 and 1 inclusive
            randInt = (int) (Math.random() * 2);
            // if 1, set f = boolean 'true'
            f = (randInt == 1);
            // passes either 'true' or 'false' to setFull()
            b.setFull(f);
                
        }
        
        

    }

}