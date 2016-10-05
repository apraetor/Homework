/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 4 P2         **********/
/**********     Date Last Modified: 2016-10-01              **********/
/*********************************************************************/

class Problem2 {

    public static void main(String[] args) {

        String name = "Oracle Corporation";
        String symbol1 = "ORCL";
        double currentPrice = 34.35;
        double previousClosingPrice = 34.5;

        // new instance of Stock
        Stock stock = new Stock(symbol1, name);
        
        // set currentPrice and previousClosingPrice
        stock.setCurrentPrice(currentPrice);
        stock.setPreviousClosingPrice(previousClosingPrice);

        // print the output
        printStockInfo(stock);

    }

    public static void printStockInfo(Stock stock) {

        System.out.println("\n************************************************************");
        System.out.format("       Stock Symbol: \t%s", stock.getSymbol1());
        System.out.format("\n\t       Name: \t%s", stock.getName());
        System.out.format("\n      Closing Price: \t$%.2f", stock.getClosingPrice());
        System.out.format("\nPrev. Closing Price: \t$%.2f", stock.getPreviousClosingPrice());
        System.out.format("\n\t     Change: \t%f %%", stock.getChangePercent());
        System.out.println("\n************************************************************");


    }

}
