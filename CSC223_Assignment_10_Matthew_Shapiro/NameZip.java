/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 8 Problem 8.8      **********/
/**********     Date Last Modified: 2016-11-22              **********/
/*********************************************************************/

class NameZip {

    private String fName, lName;
    private int zipCode;

    public NameZip(String lName, String fName, int zipCode) {
        this.fName = fName;
        this.lName = lName;
        this.zipCode = zipCode;
    }

    public String getfName() {
        return this.fName;
    }

    public String getlName() {
        return this.lName;
    }

    public int getZipCode() {
        return this.zipCode;
    }

}