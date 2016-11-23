/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 7 P2         **********/
/**********     Date Last Modified: 2016-10-27              **********/
/*********************************************************************/

class RockPaperScissor {

    private static int gameCounter = 0;
    private static int winCounter = 0;
    private static int tieCounter = 0;
    
    // using base-2 multiples for the values so that the sums
    // for each combination will be unique.
    private static final int ROCK = 1;
    private static final int PAPER = 2;
    private static final int SCISSORS = 4;

    private static final int WIN = 1;
    private static final int LOSS = 0;
    private static final int TIE = -1;


    // private int randomChoice;
    private int gameChoice;

    public RockPaperScissor() {

        // assigns either 1, 2 or 4
        gameChoice = 1 << (int) (Math.random() * 3);
        
    }

    public int checkWin(int playerChoice) {

        int sum = playerChoice + gameChoice;
        // intialized to value with no matching case
        int answer = -2;
        // counter only incremented if player doesn't choose "Q"
        gameCounter++;

        switch (sum) {
            // powers of 2 will be ties
            case 2:
                answer = TIE;
                tieCounter++;
                break;
                
            // rock vs. paper
            case 3:
                if (playerChoice == PAPER) {
                    answer = WIN;
                    winCounter++;
                } else {
                    answer = LOSS;
                }
                break;

            case 4:                 
                answer = TIE;
                tieCounter++;
                break;
                
            // rock vs scissors
            case 5:
                if (playerChoice == ROCK) {
                    answer = WIN;
                    winCounter++;
                } else {
                    answer = LOSS;
                }
                break;

            // paper vs scissors
            case 6:
                if (playerChoice == SCISSORS) {
                    answer = WIN;
                    winCounter++;
                } else {
                    answer = LOSS;
                }
                break;

            case 8:
                answer = TIE;
                tieCounter++;
                break;
        }
        return answer;
    }

    public String toString() {

        String format = "Wins: %d\tTies: %d\tLosses: %d\tTotal Games: %d";
        return String.format(format, winCounter, tieCounter, (gameCounter - winCounter - tieCounter), gameCounter);

    }

    public String getGameChoiceString() {

        return getChoiceAsString(gameChoice);
    }

    public String getChoiceAsString(int choice) {

        switch (choice) {
            case ROCK:
                return "ROCK";
                
            case PAPER:
                return "PAPER";
                
            case SCISSORS:
                return "SCISSORS";
            
            default:
                return "no match";
        }

    }

    // sneak a peek for testing
    public int getGameChoice() {
        return this.gameChoice;
    }

    public int getWins() {
        return winCounter;
    }

    public int getLosses() {
        return gameCounter - (winCounter + tieCounter);
    }

    public int getTies() {
        return tieCounter;
    }

    public int getGameCounter() {
        return gameCounter;
    }

    public void incrementTieCounter() {
        tieCounter++;
    }

    public void incrementWinCounter() {
        winCounter++;
    }

}
