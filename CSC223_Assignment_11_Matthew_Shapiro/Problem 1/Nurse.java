/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 9 Problem 9.2      **********/
/**********     Date Last Modified: 2016-12-08              **********/
/*********************************************************************/

class Nurse extends Person {

    protected String nursingSchool;

    public Nurse(String lastName, String firstName, int age, String nursingSchool) {
        super(lastName, firstName, age);
        this.nursingSchool = nursingSchool;
    }

    // takes a Person p and triages them
    public void triagePatient(Person p) {
        String format = "Nurse %s is triaging patient %s.\n";
        System.out.format(format, this.getLastName(), p.getLastName());
    }

    public String getNursingSchool() {
        return nursingSchool;
    }

}