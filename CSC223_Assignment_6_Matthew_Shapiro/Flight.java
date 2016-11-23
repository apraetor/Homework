/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 6 P2         **********/
/**********     Date Last Modified: 2016-10-17              **********/
/*********************************************************************/

class Flight {

    private String airlineName, origin, destination;
    private int flightNumber;

    Flight(String airlineName, String origin, String destination, int flightNumber) {

        this.airlineName = airlineName;
        this.origin = origin;
        this.destination = destination;
        this.flightNumber = flightNumber;

    }

    public String toString() {

        String format = "Flight #: %d\tOrigin: %s\tDestination: %s\tAirline: %s";
        return String.format(format, this.flightNumber, this.origin, this.destination, this.airlineName);
    
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineName() {
        return this.airlineName;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }
}