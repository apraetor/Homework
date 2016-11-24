/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 8 Problem 8.10      **********/
/**********     Date Last Modified: 2016-11-22              **********/
/*********************************************************************/

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;

class Quiz {

    private List<Question> questionList = new ArrayList<Question>();
    private Hashtable<Question, Boolean> quizResults = new Hashtable<Question, Boolean>();
    private int totalCorrect;

    public Quiz() {
        this.totalCorrect = 0;
    }

    public void add(Question q) {
        questionList.add(q);
    }

    public void remove(Question q) {
        questionList.remove(q);
    }

    public void giveQuiz() {
        // trusty scanner
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\n***** Start of Quiz! *****\n");
        // loop through all questions in Quiz
        for (Question q : questionList) {
            // ask the question
            System.out.print(q.getQuestion() + " ");
            // check the result, and store true/false to results table
            quizResults.put(q, q.answerCorrect(scan.nextLine()));
        }

        // calculate total correct, assign to field *totalCorrect*
        calcTotalCorrect();

        System.out.println("\n***** End of Quiz! *****\n");
    }

    public void printResults() {
        String row = "";
        System.out.println("Quiz Results:");
        // loop through questions to print results
        for (int idx = 0; idx < questionList.size(); idx++) {
            row = String.format("Question #%d: ", idx + 1);
            // reads boolean answer, prints corresponding message
            if (quizResults.get(questionList.get(idx))) {
                row += "Correct";
            } else {
                row += "Incorrect";
            }
        }

        System.out.format("Total Correct: %d", this.totalCorrect);

    }

    public void calcTotalCorrect() {
        int counter = 0;
        for (int idx = 0; idx < questionList.size(); idx++) {
           if (quizResults.get(questionList.get(idx))) {
            counter++;
           }
        }
        this.totalCorrect = counter;
    }


}