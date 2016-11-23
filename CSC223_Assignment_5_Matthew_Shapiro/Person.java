/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 5 P1         **********/
/**********     Date Last Modified: 2016-10-11              **********/
/*********************************************************************/

class Person {

    private String fName;
    private String lName;
    private int age;

    public Person(String lName, String fName, int age) {

        this.lName = lName;
        this.fName = fName;
        this.age = age;

    }

    public Person(String lName, String fName) {

        this(lName, fName, 0);

    }

    public Person(int age) {

        this("", "", age);

    }

    public void printPerson() {

        String format = "\n%s, %s  |  Age: %d";
        System.out.format(format, this.lName, this.fName, this.age);

    }

    public String getlName() {

        return this.lName;

    }

    public String getfName() {

        return this.fName;

    }

    public int getAge() {

        return this.age;

    }

    public void setlName(String lName) {

        this.lName = lName;

    }

    public void setfName(String fName) {

        this.fName = fName;

    }

    public void setAge(int age) {

        this.age = age;

    }

}