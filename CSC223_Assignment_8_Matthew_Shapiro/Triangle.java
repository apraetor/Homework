/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 8 P3         **********/
/**********     Date Last Modified: 2016-11-02              **********/
/*********************************************************************/

// import java.util.StringUtils;
import java.util.Scanner;

class Triangle {

    static Scanner scan = new Scanner(System.in);
    static long startTime;

    public static void main(String[] args) {

        char letter;

        if (args.length > 0) {

            letter = args[0].toUpperCase().charAt(0);

        } else {

        System.out.print("Enter a letter: ");
        // get input as char so we can do simple math on it
        letter = scan.nextLine().toUpperCase().charAt(0);

        }

        
        System.out.println("Using 3 loops inside one outer loop: ");
        startTime = System.currentTimeMillis();
        genRowBoring(letter);
        System.out.println("Time: " + (System.currentTimeMillis() - startTime));

        System.out.println("Using only one loop:");
        startTime = System.currentTimeMillis();
        genRowAnother(letter);
        System.out.println("Time: " + (System.currentTimeMillis() - startTime));

        System.out.println("3 loops called recursively: ");
        startTime = System.currentTimeMillis();
        genRow(letter, letter);
        System.out.println("Time: " + (System.currentTimeMillis() - startTime));

        System.out.println("Recursively, no loops:");
        startTime = System.currentTimeMillis();
        genRowAnotherRecursive(letter, letter);
        System.out.println("Time: " + (System.currentTimeMillis() - startTime));


    }

    // print pyramid by recursively calling function, but using the inner loops
    static void genRow(char letter, char usrLetter) {

        
        
        // call genRow() to generate prior row if required
        if (letter > 'A') {
            genRow((char) (letter - 1), usrLetter);
        }

        String row = "";

        // # of spaces req'd is equal to diff between usrLetter and
        // letter of current invocation
        for (int i = usrLetter - letter; i >= 0; i--) {
            row = row + " ";
        }

        for (char c = 'A'; c <= letter; c++) {
            row = row + c;
        }

        for (char c = (char) (letter - 1); c >= 'A'; c--) {
            row = row + c;
        }
        
        System.out.println(row);
        

    }

    // print the pyramid using one outer loop and three parallel inner loops,
    // per assignment specs
    static void genRowBoring(char usrLetter) {

        String row = "";

        for (char letter = 'A'; letter <= usrLetter; letter++) {

            // it took me far too long to realize I wasn't clearing *row*
            // between iterations.
            row = "";
            // # of spaces req'd is equal to diff between usrLetter and
            // letter of current invocation
            for (int i = usrLetter - letter; i >= 0; i--) {
                row = row + " ";
            }

            for (char c = 'A'; c <= letter; c++) {
                row = row + c;
            }

            for (char c = (char) (letter - 1); c >= 'A'; c--) {
                row = row + c;
            }
            
            System.out.println(row);
            

        }
        
    }

    // print pyramid using one for loop, no recursion or other control structures
    static void genRowAnother(char usrLetter) {

        // ascii index of 'A'
        char c = 65;
        // find our window
        int diff = usrLetter - c + 1;
        // pad out with blanks
        String padding = new String(new char[diff]).replace("\0", " ");
        String reversed;
        

        for (int i = 0; i < diff; i++) {
            // add next letter
            padding += (char)(c + i);
            // flip the string
            reversed = new StringBuilder(padding).reverse().toString();
            // walk our window along string
            System.out.println(padding.substring(i, diff + i) + reversed);


        }

        

    }

    // print the pyramid using pure recursion.
    static String genRowAnotherRecursive(char letter, char usrLetter) {
      
        // ascii index of 'A'
        // char c = 65;
        // find our window
        int diff = usrLetter - 64;
        // two strings to hold row data
        String row;
        String reversed;

        // base case
        if (letter == 'A') {
            // start by creating a row of blanks equal to the distance from 'A' to usrLetter
            // by creating a char[] of appropriate length, then .replace() null chars ("\0") with " " (spaces)
            // then convert char[] into String
            row = new String(new char[diff]).replace("\0", " ");
            // concat first letter
            row += 'A';

        } else {
            // generate previous line
            row = genRowAnotherRecursive((char)(letter - 1), usrLetter);
            // concat next letter
            row += letter;
            // trim off a leading blank so length remains constant
            row = row.substring(1);
            
        }

        // reverse the string, trim off the first letter (so no duplicate middle) and trim off trailing whitespace
        reversed = new StringBuilder(row).reverse().toString().substring(1, diff);
        // print this iteration's full row
        System.out.println(row + reversed);
        // return *row* up the call stack
        return row;

    }

}