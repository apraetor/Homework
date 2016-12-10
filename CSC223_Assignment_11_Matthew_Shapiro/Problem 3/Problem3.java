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

class Problem3 {
    public static void main(String[] args) {

        Map<Player, Integer> roster = new HashMap<>();
        roster.put(new Player("Schmoe", "Joe"), 13);
        roster.put(new Player("Griffin", "Peter"), 42);
        roster.put(new Player("Pele", ""), 37);

        Soccer teamUSA = new Soccer("Team USA", roster);

        // add some random wins, losses and ties
        randomTeamInfo(teamUSA);

        // print the wins / losses / ties
        System.out.format("Team: %s\n\tWins: %d Losses: %d Ties: %d\n", teamUSA.getTeamName(), teamUSA.getWins(), teamUSA.getLosses(), teamUSA.getTies());

        // add some random player info
        for (Player p : roster.keySet()) {
            randomPlayerInfo(p);
        }

        // print the player stats
        String format = "Player: %s Number: %d\n\tGoals: %d Assists: %d Yellow Cards: %d Red Cards: %d\n";
        for (Player p : roster.keySet()) {
            System.out.format(format, p.getLastName(), roster.get(p), p.getGoals(), p.getAssists(), p.getYellowCards(), p.getRedCards());
        }

    }

    public static void randomPlayerInfo(Player p) {
        int randint = (int) (Math.random() * 10);
        for (int i = 0; i < randint; i++) {
            p.addGoals();
        }

        randint = (int) (Math.random() * 10);
        for (int i = 0; i < randint; i++) {
            p.addAssists();
        }

        randint = (int) (Math.random() * 10);
        for (int i = 0; i < randint; i++) {
            p.addYellowCards();
        }

        randint = (int) (Math.random() * 10);
        for (int i = 0; i < randint; i++) {
            p.addRedCards();
        }
    }

    public static void randomTeamInfo(Soccer team) {
        int randint = (int) (Math.random() * 10);
        for (int i = 0; i < randint; i++) {
            team.addWin();
        }

        randint = (int) (Math.random() * 10);
        for (int i = 0; i < randint; i++) {
            team.addLoss();
        }

        randint = (int) (Math.random() * 10);
        for (int i = 0; i < randint; i++) {
            team.addTie();
        }
    }
}