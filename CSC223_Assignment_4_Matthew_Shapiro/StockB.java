/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 4 P3         **********/
/**********     Date Last Modified: 2016-10-01              **********/
/*********************************************************************/

class StockB {

    private String name;
    private int shares;
    private double shareValue;
    private double totalShareValue;

    // full 3-args constructor
    StockB(String name, int shares, double shareValue) {

        this.name = name;
        this.shares = shares;
        this.shareValue = shareValue;
        this.totalShareValue = this.shares * this.shareValue;

    }

    // two-args constructor for creating stocks with no shares but a shareValue
    StockB (String name, double shareValue) {

        this(name, 0, shareValue);

    }

    // one-arg constructor for creating stock with no shares and no shareValue
    StockB(String name) {

        this(name, 0, 0);

    }

    // no-args constructor for creating empty stock object to return when
    // no match found
    StockB() {

        this("");
    
    }

    public void buyStock(int newShares, double shareValue) {

        this.shares += newShares;
        setShareValue(shareValue);

    }

    public void sellShares(int shares, double shareValue) {

        if (this.shares >= shares) {

            this.shares -= shares;
            setShareValue(shareValue);

        } else {System.out.println("\n**** Order Failed: Insufficient Shares ****");}

    }

    // update to include shareValue
    public int sellStock(double shareValue) {
        
        int sharesTemp = this.shares;
        
        if (this.shares == 0) {

            System.out.print("\nYou own no shares!");

        } else {

            this.shares = 0;
            setShareValue(shareValue);

        }

        
        return sharesTemp;

    }

    public void setShareValue(double shareValue) {

        this.shareValue = shareValue;
        this.totalShareValue = (double) this.shares * this.shareValue;

    }

    public String getName() {

        return this.name;

    }
    
    public int getShares() {

        return this.shares;

    }

    public double getShareValue() {

        return this.shareValue;

    }

    public double getTotalShareValue() {

        return this.totalShareValue;

    }

}
