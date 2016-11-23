/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 7 P1         **********/
/**********     Date Last Modified: 2016-10-27              **********/
/*********************************************************************/

import java.util.Scanner;

class Problem1 {

    static Scanner scan = new Scanner(System.in);
    static HiLo number = new HiLo();

    public static void main(String[] args) {

        
        String guess;
        int guessInt;
        

        System.out.println("********** HiLo Guessing Game **********");

    guessingGame:
        do {

            

            System.out.println("\nPlease guess a number between 1 and 100");
            System.out.println("Q to quit any time");
            
            // uncomment line below to cheat
            // System.out.println(number);


            do {

                // ask user to make a guess
                guess = getGuess();
                if (guess.equals("Q")) {break guessingGame;}
                else {
                    // if they didn't choose quit, convert guess str to int
                    guessInt = Integer.parseInt(guess);
                    checkAnswer(guessInt);
                }
                

            } while (!number.isMatch(guessInt));

            System.out.print("\nWould you like another game? [Y/N]: ");
            
            if (scan.nextLine().toUpperCase().charAt(0) == 'N') {break guessingGame;}

            // generate new numbers for next game
            number.generateNumber();

        } while (true);


    }

    public static String getGuess() {

        System.out.print("Guess: ");
        return scan.nextLine().toUpperCase();
    }

    public static void checkAnswer(int guessInt) {

                // to avoid repeated method calls
                int tempNumber = number.getNumber();

                if (guessInt > tempNumber) {
                    System.out.println("Too High!");
                } else if (guessInt < tempNumber) {
                    System.out.println("Too Low!");
                } else if (guessInt == tempNumber) {
                        System.out.format("Congratulations! The correct number was %d", tempNumber);
                }

    }


}