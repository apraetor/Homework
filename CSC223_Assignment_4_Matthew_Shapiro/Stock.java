/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 4 P2         **********/
/**********     Date Last Modified: 2016-10-01              **********/
/*********************************************************************/

class Stock {

    private String symbol1;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // two-args constructor
    Stock(String symbol1, String name) {

        this.symbol1 = symbol1;
        this.name = name;

    }

    public double getChangePercent() {

        return ((this.currentPrice - this.previousClosingPrice) / this.currentPrice) * 100;

    }

    public String getSymbol1() {

        return this.symbol1;

    }

    public String getName() {

        return this.name;

    }

    public void setPreviousClosingPrice(double previousClosingPrice) {

        this.previousClosingPrice = previousClosingPrice;

    }

    public void setCurrentPrice(double currentPrice) {

        this.currentPrice = currentPrice;

    }

    public double getPreviousClosingPrice() {

        return this.previousClosingPrice;

    }

    public double getClosingPrice() {

        return this.currentPrice;

    }

}
