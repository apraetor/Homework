/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 4 P3         **********/
/**********     Date Last Modified: 2016-10-01              **********/
/*********************************************************************/

// 

// Disclosure: This is all my original work except for clearScreen() which I 
// looked up on Stack Exchange because I had no idea how to do that.
// I wouldn't have used someone else's assistance if it was part of the actual
// assignment.


import java.util.Scanner;
import java.util.ArrayList;

class Problem3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // create arraylist to hold StockB objects
        ArrayList<StockB> holdings = new ArrayList<StockB>();
        String choice = "";

        // create a couple of test stocks StockB for demo purposes
        StockB orcl = new StockB("ORCL", 34.35, 10);
        StockB goog = new StockB("GOOG", 804.06, 1);

        // we can also add stocks with a name + price but no shares
        StockB aapl = new StockB("AAPL", 113.67);
        

        // add StockB test stocks to ArrayList
        holdings.add(orcl);
        holdings.add(goog);
        holdings.add(aapl);
        // holdings.add(new StockB("GOOG", 804.06, 1));
        // holdings.add(brk-a);

        

        do {
            
            printMenu(holdings);

            choice = scan.next();
            choice = choice.toUpperCase();

            switch (choice) {

                case "A" : 
                    
                    // adds a new StockB object. Only a stock symbol is
                    // required; you can add stocks of which you own no shares.
                    addStock(holdings);
                    break;


                case "B" : 

                    // buys shares of any stock already in the list.
                    buyShares(holdings);
                    break;

                case "S" : 

                    // sells any number of shares of a stock, but leaves the
                    // stock in the list (StockB instance persists).
                    sellShares(holdings);
                    break;

                case "U" : 

                    // updates the stock price.
                    updateStockPrice(holdings);
                    break;

                case "X" :

                    // sells all shares of the stock and removes the object
                    // from the list. 
                    sellStock(holdings);
                    break;

                case "R" :

                    removeStock(holdings);
                    break;

            }

            if (choice.equals("Q")) {
            
                clearScreen();
                break;

            }

        } while (true);

    }

    public static void printMenu(ArrayList<StockB> holdings) {

        System.out.println("************************************************************");
        printStocks(holdings);
        System.out.println("\n************************************************************");
        System.out.println("[A]dd Stock | [B]uy Shares | [S]ell Shares | [U]pdate Stock Price");
        System.out.println("[X] Sell Stock | [R]emove | [Q]uit");
        System.out.print("Choice: ");

    }

    public static void printStocks(ArrayList<StockB> holdings) {

        clearScreen();
        

        System.out.println("Symbol\t\tShares\tPrice\t\tTotal Value");
        System.out.println("------------------------------------------------------------");

        for (StockB stock : holdings) {

            // print out the info for each stock in the list
            stock.displayStock();

        }

    }

    public static void sellStock(ArrayList<StockB> holdings) {

        Scanner scan = new Scanner(System.in);

        StockB toSellAll;
        System.out.print("Stock to sell: ");
        String name = scan.nextLine().toUpperCase();
        System.out.print("Sell Price: ");
        double sellPrice = Double.parseDouble(scan.nextLine());


        toSellAll = getStock(holdings, name);

        if (toSellAll.getName() == "") {

            System.out.println("\n**** Error: Stock not found\n");
            scan.nextLine();

        } else {

            int shares = toSellAll.sellStock(sellPrice);

            if (shares == 0) {
            
                System.out.println("You own no shares!");
                scan.nextLine();
            
            } else {

                // remove stock obj from array so garbage collection can eat it
                holdings.remove(toSellAll);
                System.out.format("\n%d shares sold\n", shares);
                scan.nextLine();


            }

        }

    }


    public static StockB getStock(ArrayList<StockB> holdings, String name) {

        // call default constructor for empty StockB object
        StockB foundStock = new StockB();

        for (StockB stock : holdings) {

            // if the stock is already in the list assign it to foundStock
            if (stock.getName().equals(name.toUpperCase())) {foundStock = stock;}

        }

        return foundStock;

    }

    public static void addStock(ArrayList<StockB> holdings) {
        
        Scanner scan = new Scanner(System.in);

        String name;
        int shares;
        double shareValue;
        StockB foundStock;


        System.out.print("\nSymbol: ");
        name = scan.nextLine().toUpperCase();
        System.out.print("Shares Owned: ");
        
        // must use this approach because nextDouble() does not consume
        // the \n\r newline characters.
        // could also use nextLine(); immediately after nextDouble();
        shares = Integer.parseInt(scan.nextLine());
        System.out.print("Share Price: ");
        shareValue = Double.parseDouble(scan.nextLine());

        // finds stock or returns new empty StockB instance
        foundStock = getStock(holdings, name);

        // name is empty if stock not in list
        if (foundStock.getName() == "") {
            
            // add new StockB to list if doesn't exist
            holdings.add(new StockB(name, shareValue, shares));
        
        // if stock found, use existing methods to add more shares
        // and update price
        } else {
        
                foundStock.buyStock(shares, shareValue);
                // not required now that buyStock also takes *shareValue*
                // foundStock.setShareValue(shareValue);

            }


    }

    public static void buyShares(ArrayList<StockB> holdings) {

        Scanner scan = new Scanner(System.in);

        System.out.print("\nSymbol: ");
        String name = scan.nextLine().toUpperCase();
        StockB toBuy;

        System.out.print("Shares to buy: ");
        int shares = Integer.parseInt(scan.nextLine());
        // scan.nextLine();

        System.out.print("Share Price: ");
        double sharePrice = Double.parseDouble(scan.nextLine());

        // find the instance of StockB containing the target stock
        // or create new empty StockB instance
        toBuy = getStock(holdings, name);
        
        // error message if stock not found
        if (toBuy.getName() == "") {

            System.out.println("\n**** Error: Stock Not Found ****\n");
            scan.nextLine();
        }

            // if stock found, buy the desired shares
            else {toBuy.buyStock(shares, sharePrice);}

    }

    public static void sellShares(ArrayList<StockB> holdings) {

        Scanner scan = new Scanner(System.in);

        System.out.print("\nSymbol: ");
        String name = scan.nextLine().toUpperCase();
        StockB toSell;

        System.out.print("Shares to sell: ");
        int shares = Integer.parseInt(scan.nextLine());

        System.out.print("Sell Price: ");
        double sellPrice = Double.parseDouble(scan.nextLine());

        // find the instance
        toSell = getStock(holdings, name);

        // error if not found
        if (toSell.getName() == "") {

            System.out.println("\n**** Order Failed: Stock not found ****");
            scan.nextLine();

        }
            // sell the shares if found
            else {toSell.sellShares(shares, sellPrice);}

    }

    public static void updateStockPrice(ArrayList<StockB> holdings) {

        Scanner scan = new Scanner(System.in);

        System.out.print("\nSymbol: ");
        String name = scan.nextLine().toUpperCase();
        StockB toUpdate;

        System.out.print("New Price: ");
        double newPrice = Double.parseDouble(scan.nextLine());

        // find the instance
        toUpdate = getStock(holdings, name);
        
        // error if not found
        if (toUpdate.getName() == "") {

            System.out.println("\n**** Update Failed: Stock not found ****\n");
            scan.nextLine();

        }
            // update shareValue (and totalShareValue) if found
            else {toUpdate.setShareValue(newPrice);}


    }

    public static void removeStock(ArrayList<StockB> holdings) {

        Scanner scan = new Scanner(System.in);
        StockB toRemove;

        System.out.print("\nSymbol: ");
        String name = scan.nextLine().toUpperCase();
        System.out.print("Are you sure? ");
        
        toRemove = getStock(holdings, name);
        

        if (scan.nextLine().toUpperCase().equals("Y")) {
            
            if (toRemove.getName() == "") {
        
                System.out.println("\n**** Remove Failed: Stock not found ****\n");
                scan.nextLine();

            } else {

            holdings.remove(toRemove);
            
            }
        

       }


    }

    public static void clearScreen() {  
    
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    
    } 

}
