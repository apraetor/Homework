/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 9 Problem 9.4       **********/
/**********     Date Last Modified: 2016-12-08              **********/
/*********************************************************************/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Soccer extends Sport {

    protected int win, tie, loss;
    protected String teamName;

    public Soccer(String teamName, Map<Player, Integer> roster) {
        super("Soccer", 21, roster);
        this.teamName = teamName;
        win = 0;
        loss = 0;
        tie = 0;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getWins() {
        return win;
    }    

    public int getLosses() {
        return loss;
    }

    public int getTies() {
        return tie;
    }

    public void addWin() {
        win += 1;
    }

    public void addLoss() {
        loss += 1;
    }

    public void addTie() {
        tie += 1;
    }

}