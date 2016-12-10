/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 9 Problem 9.2      **********/
/**********     Date Last Modified: 2016-12-08              **********/
/*********************************************************************/

class Problem1 {
    public static void main(String[] args) {

        Person patient = new Person("Schmoe", "Joe", 42);
        Nurse nurse = new Nurse("Nightingale", "Florence", 37, "St. Vincent's School of Nursing");
        Doctor doc = new Doctor("Riviera", "Nick", 40, "Hollywood Upstairs Medical College", "Impressing Women");
        Surgeon cutter = new Surgeon("Kevorkian", "Jack", 76, "Harvard Medical School", "Neurosurgery");

        System.out.println("\nPatient " + patient.getLastName() + " is taken to the E.D. with a head injury.");
        // perform some triage
        nurse.triagePatient(patient);
        System.out.println("Patient " + patient.getLastName() + " is in critical condition.");
        // doctor examines patient
        doc.treatPatient(patient);
        System.out.println("Dr. " + doc.getLastName() + " determines surgery is required and transfers Patient " + patient.getLastName() + " to ICU.");
        // surgeon performs surgery
        cutter.performSurgery(patient);
        System.out.println("Patient " + patient.getLastName() + " makes a miraculous recovery and goes home.");

    }
}