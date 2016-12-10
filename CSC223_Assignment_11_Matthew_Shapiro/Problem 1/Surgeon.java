/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 9 Problem 9.2      **********/
/**********     Date Last Modified: 2016-12-08              **********/
/*********************************************************************/

class Surgeon extends Doctor {

    protected String surgicalSpecialty;

    public Surgeon(String lastName, String firstName, int age, String medicalSchool, String specialty) {
        super(lastName, firstName, age, medicalSchool, "Surgery");
        this.surgicalSpecialty = specialty;
    }

    // performs surgery on Person p
    public void performSurgery(Person p) {
        String format = "Dr. %s is performing surgery on Patient %s.\n";
        System.out.format(format, this.getLastName(), p.getLastName());
    }

    public String getSurgicalSpecialty() {
        return surgicalSpecialty;
    }

    // because sometimes they do change them
    public void setSurgicalSpecialty(String newSurgicalSpecialty) {
        surgicalSpecialty = newSurgicalSpecialty;
    }
}