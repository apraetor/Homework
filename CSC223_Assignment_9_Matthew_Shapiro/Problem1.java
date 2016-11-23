/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 9 P1         **********/
/**********     Date Last Modified: 2016-11-08              **********/
/*********************************************************************/



class Problem1 {

    public static void main(String[] args) {

        // create a course
        Course c = new Course("Java");
        // create several students
        Student s1 = new Student("Matthew", "Shapiro");
        Student s2 = new Student("Joe", "Schmoe");
        Student s3 = new Student("Buffalo", "Bill", 67, 78, 89);

        // Set some test scores
        s1.setTestScore(1, 88).setTestScore(2, 90).setTestScore(3, 100);
        s2.setTestScore(1, 60).setTestScore(2, 70).setTestScore(3, 80);

        // add the Students to the Course
        c.addStudent(s1);
        c.addStudent(s2);
        c.addStudent(s3);

        System.out.println("\n\n************* Student Objects Added to Course ***************************");
        printStudent(s1);
        printStudent(s2);
        printStudent(s3);
        System.out.println("*************************************************************************");

        // Print a roster
        System.out.println("\n********** calling .roll() **********\n");
        c.roll();

        System.out.println("\n********** calling .average() *******\n");
        System.out.format("Class Test Average: %.3f\n", c.average());




    }

    public static void printStudent(Student s) {
        String format = "%s, %s:  %.2f  %.2f  %.2f\n";
        System.out.format(format, s.getLastName(), s.getFirstName(), s.getTestScore(1), s.getTestScore(2), s.getTestScore(3));
    }

}