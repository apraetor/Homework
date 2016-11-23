/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 8 Problem 8.8      **********/
/**********     Date Last Modified: 2016-11-22              **********/
/*********************************************************************/

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class Problem2 {

    public static void main(String[] args) throws IOException {
        List<NameZip> holding = new ArrayList<NameZip>();
        Scanner fileRead = new Scanner(new File("Contacts.txt"));
        String[] buffer;

        while (fileRead.hasNext() && holding.size() < 25) {
            // returns lName, fName, zip as strings
            buffer = fileRead.nextLine().split("\t");
            // call constructor with lName, fName, zip
            holding.add(new NameZip(buffer[0], buffer[1], Integer.parseInt(buffer[2])));
        }

        printList(holding);

    }

    public static void printList(List<NameZip> holding) {
        String format = "%s, %s\t%05d\n";
        for (NameZip n : holding) {
            System.out.format(format, n.getlName(), n.getfName(), n.getZipCode());
        }
    }
}