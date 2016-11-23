/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 7 P3         **********/
/**********     Date Last Modified: 2016-10-27              **********/
/*********************************************************************/

class SlotMachine {

    private int[] numbers = new int[3];

    public SlotMachine() {

        pullLever();        

    }

    // returns number of matches as integer
    public int countMatches() {

        if (numbers[0] == numbers[1] && numbers[0] == numbers[2]) {
            return 3;
        }
        if (numbers[0] == numbers[1] || numbers[0] == numbers[2] || numbers[1] == numbers[2]) {
            return 2;
        } else {
            return 0;
        }
    }

    public void pullLever() {

        for (int i = 0; i < 3; i++) {

            numbers[i] = (int) (Math.random() * 10);

        }

    }

    public int getIntAt(int index) {
        return numbers[index];
    }

    public String toString() {

        String strNumbers = "";

        for (int i : numbers) {

            strNumbers = strNumbers + Integer.toString(i);
        
        }

        return strNumbers;

    }

}