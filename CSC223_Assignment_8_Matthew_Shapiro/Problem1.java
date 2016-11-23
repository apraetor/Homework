/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 8 P1         **********/
/**********     Date Last Modified: 2016-11-02              **********/
/*********************************************************************/

class Problem1 {

    public static void main(String[] args) {

        long startTime, endTime;

        int boxcar = 0;
        PairOfDice dice = new PairOfDice();

        startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {

            // roll dice
            dice.roll();
            
            if (dice.getTotalFaceValue() == 12) {
            
                // print out value    
                System.out.format("\ni: %d  %s", i, dice);
                System.out.print("   BOXCAR!!!");
                boxcar++;

            }

        }

        endTime = System.currentTimeMillis();

        System.out.format("\n\nBoxcar count: %d\n", boxcar);

        System.out.format("Time: %d ms\n", endTime - startTime);
        

    }


}