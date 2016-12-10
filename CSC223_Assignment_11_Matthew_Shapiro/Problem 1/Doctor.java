/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 9 Problem 9.2      **********/
/**********     Date Last Modified: 2016-12-08              **********/
/*********************************************************************/

class Doctor extends Person {

    protected String medicalSchool, specialty;

    public Doctor(String lastName, String firstName, int age, String medicalSchool, String specialty) {
        super(lastName, firstName, age);
        this.medicalSchool = medicalSchool;
        this.specialty = specialty;
    }

    // treats Person p
    public void treatPatient(Person p) {
        String format = "Dr. %s is treating patient %s.\n";
        System.out.format(format, this.getFirstName(), p.getLastName());
    }

    public String getMedicalSchool() {
        return medicalSchool;
    }

    public String getSpecialty() {
        return specialty;
    }

    // because sometimes they do change them
    public void setSpecialty(String newSpecialty) {
        specialty = newSpecialty;
    }
}