/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 6 P3         **********/
/**********     Date Last Modified: 2016-10-17              **********/
/*********************************************************************/

class PairOfDice {

    private Die dieOne, dieTwo;

    public PairOfDice() {

        dieOne = new Die();
        dieTwo = new Die();

    }

    public String toString() {
        // String format = "One: %d\tTwo: %d\tSum: %d";
        String format = "%d + %d = %d";

        return String.format(format, getFaceDieOne(), getFaceDieTwo(), getTotalFaceValue());
    }

    public int getTotalFaceValue() {
        return dieOne.getFaceValue() + dieTwo.getFaceValue();
    }


    public void roll() {

        dieOne.roll();
        dieTwo.roll();

    }

    public int getFaceDieOne() {
        return dieOne.getFaceValue();
    }

    public int getFaceDieTwo() {
        return dieTwo.getFaceValue();
    }

    public void setFaceDieOne(int face) {
        dieOne.setFaceValue(face);
    }

    public void setFaceDieTwo(int face) {
        dieTwo.setFaceValue(face);
    }
}