/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 9 Problem 9.3      **********/
/**********     Date Last Modified: 2016-12-08              **********/
/*********************************************************************/

class Person {

    protected String lastName, firstName;
    protected int age;

    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public Person(String lastName, String firstName) {
        // set age to -99 to signal it's not filled-in. crude, but
        // this assignment is very long
        this(lastName, firstName, -99);
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String toString() {
        return String.format("%s, %s", lastName, firstName);
    }

}