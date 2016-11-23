/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 5 P3         **********/
/**********     Date Last Modified: 2016-10-12              **********/
/*********************************************************************/

class Dog {

    private String name;
    private int age;

    public Dog(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public Dog() {

        this("", 0);

    }

    public int calcPersonYears() {

        return this.age * 7;
    }

    public String toString() {

        String format = "%s\t| %d years old\t| %d person-years";

        return String.format(format, this.name, this.age, calcPersonYears());

    }

    public int getAge() {

        return this.age;

    }

    public String getName() {

        return this.name;

    }

    public void setAge (int age) {

        this.age = age;

    }

    public void setName (String name) {

        this.name = name;

    }



}