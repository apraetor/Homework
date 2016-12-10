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

abstract class Sport {

    protected String sportName;
    protected int maxPlayers;
    protected Map<Player, Integer> roster;

    public Sport(String sportName, int maxPlayers, Map<Player, Integer> roster) {
        this.sportName = sportName;
        this.maxPlayers = maxPlayers;
        this.roster = roster;
    }

    public List<Player> getPlayerList() {
        
        return new ArrayList<Player>(roster.keySet());
    }

    public void addPlayer(Player p, int playerNumber) {
        roster.put(p, playerNumber);
    }

    public void removePlayer(Player p) {
        roster.remove(p);
    }

    public int getPlayerNumber(Player p) {
        return roster.get(p);
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public String getSportName() {
        return sportName;
    }

}