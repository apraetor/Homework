/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 9 Problem 9.3      **********/
/**********     Date Last Modified: 2016-12-08              **********/
/*********************************************************************/

class Player {

    protected String lastName, firstName, position;
    protected int age;
    protected int goals, assists, yellowCards, redCards;

    public Player(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        goals = 0;
        assists = 0;
        yellowCards = 0;
        redCards = 0;
    }

    public Player(String lastName, String firstName) {
        // set age to -99 to signal it's not filled-in. crude, but
        // this assignment is very long
        this(lastName, firstName, -99);
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public int getRedCards() {
        return redCards;
    }

    public void addGoals() {
        goals += 1;
    }

    public void addAssists() {
        assists += 1;
    }

    public void addYellowCards() {
        yellowCards += 1;
    }

    public void addRedCards() {
        redCards += 1;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String toString() {
        return String.format("%s, %s", lastName, firstName);
    }

}