/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 7 P2         **********/
/**********     Date Last Modified: 2016-10-27              **********/
/*********************************************************************/

import java.util.Scanner;

class Problem2 {

    private static final int ROCK = 1;
    private static final int PAPER = 2;
    private static final int SCISSORS = 4;

    static int playerChoice;

    static Scanner scan = new Scanner(System.in);
    static RockPaperScissor game;

    public static void main(String[] args) {

        char choice;
        int tempCheckWin;

        System.out.println("********** Rock - Paper - Scissors **********");

    gameLoop:
        do {
            
            game = new RockPaperScissor();
            System.out.println("\n[R]ock | [P]aper | [S]cissors | [Q]uit");
            // System.out.println(game);
            // System.out.println(game.getGameChoice());
            System.out.print("Choice: ");
            choice = scan.nextLine().toUpperCase().charAt(0);
            

            switch (choice) {

                case 'R':
                    playerChoice = ROCK;
                    break;
                case 'P':
                    playerChoice = PAPER;
                    break;
                case 'S':
                    playerChoice = SCISSORS;
                    break;
                case 'Q':
                    System.out.println(game);
                    break gameLoop;
                default:
                    System.out.println("Invalid Entry");
                    break;

            }

            tempCheckWin = game.checkWin(playerChoice);

            System.out.format("You: %s\tComputer: %s\n", game.getChoiceAsString(playerChoice), game.getGameChoiceString());
            if (tempCheckWin == 1) {
                System.out.println("You win!");
            } else if (tempCheckWin == 0) {
                System.out.println("You lose!");
            } else if (tempCheckWin == -1) {
                System.out.println("Tie!");
            }

        } while (true);
        
        
    }

}




