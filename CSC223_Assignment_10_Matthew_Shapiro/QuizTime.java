/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 8 Problem 8.10      **********/
/**********     Date Last Modified: 2016-11-22              **********/
/*********************************************************************/

import java.util.Scanner;

class QuizTime {

    public static void main(String[] args) {

        Quiz q = new Quiz();
        // populates Quiz with some Questions
        q.add(new Question("What is the answer to life, the universe, and everything?", "42"));
        q.add(new Question("What is 2 + 4?", "6"));
        q.add(new Question("What is 6 * 7?", "42"));

        // gives the Quiz
        q.giveQuiz();
        // prints the results
        q.printResults();

    }

}