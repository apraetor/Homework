/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 9 P1         **********/
/**********     Date Last Modified: 2016-11-08              **********/
/*********************************************************************/

import java.util.ArrayList;

class Course {

    private ArrayList<Student> roster = new ArrayList<Student>();
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public double average() {
        double sum = 0;

        for (Student s : roster) {
            sum += s.average();
        }

        return sum / roster.size();
    }

    public void addStudent(Student s) {
        roster.add(s);
    }

    public void roll() {
        System.out.println("Course: " + courseName);
        String format = "Name: %s, %s\n\tAverage: %.3f\n";
        
        for (Student s : roster) {
            System.out.format(format, s.getLastName(), s.getFirstName(), s.average());
        }
    }

}