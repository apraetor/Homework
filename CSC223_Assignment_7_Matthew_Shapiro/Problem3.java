/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 7 P3         **********/
/**********     Date Last Modified: 2016-10-27              **********/
/*********************************************************************/

import java.util.Scanner;

class Problem3 {

    static SlotMachine game = new SlotMachine();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int matches;
        char choice;

        System.out.println("********** Slot Machine **********");

gameLoop:
        do {

            System.out.format("Numbers: %s\n", game);
            matches = game.countMatches();
            if (matches >= 2) {
                System.out.format("Congratulations! You have a %d-digit winner!\n", matches);
            } else {
                System.out.println("You Lose! Better luck next time!");
            }

            System.out.print("Play Again? [Y/N]: ");
            if (scan.nextLine().toUpperCase().charAt(0) == 'N') {
                break gameLoop;
            }
            game.pullLever();

        } while (true);


    }

}