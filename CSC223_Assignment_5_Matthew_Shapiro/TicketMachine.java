/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 5 P2         **********/
/**********     Date Last Modified: 2016-10-11              **********/
/*********************************************************************/

class TicketMachine {

    // price per ticket
    private double price;
    // amount of money entered by customer
    private double balance;
    // total dollar amount collected by machine
    private double total;

    public TicketMachine(double price, double balance, double total) {

        this.price = price;
        this.balance = balance;
        this.total = total;

    }

    public TicketMachine(double price, double balance) {

        this(price, balance, 0);

    }

    public TicketMachine() {

        this(0, 0, 0);

    }

    public void printTicketMachineInfo() {

        String format = "\nPrice: $%.2f\tBalance: $%.2f\tTotal: $%.2f";
        System.out.format(format, this.price, this.balance, this.total);

    }


    public double getPrice() {

        return this.price;

    }

    public double getBalance() {

        return this.balance;

    }

    public double getTotal() {

        return this.total;

    }

    public void setPrice(double price) {

        this.price = price;

    }

    public void setBalance(double balance) {

        this.balance = balance;

    }

    public void setTotal(double total) {

        this.total = total;

    }
}