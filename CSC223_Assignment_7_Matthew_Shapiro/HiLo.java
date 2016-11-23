/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 7 P1         **********/
/**********     Date Last Modified: 2016-10-27              **********/
/*********************************************************************/

class HiLo {

    private int number;

    public HiLo() {

        generateNumber();        
 
    }

    public void generateNumber() {

        this.number = (int) ((Math.random() * 100) + 1);

    }

    public int getNumber() {
        return this.number;
    }

    public boolean isMatch(int number) {

        if (this.number == number) {return true;}
        else {return false;}
    
    }

    public String toString() {

        String format = "Correct Answer: %d";

        return String.format(format, this.number);
    }
    

}
