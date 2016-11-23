/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 8 Problem 8.3      **********/
/**********     Date Last Modified: 2016-11-22              **********/
/*********************************************************************/

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class Problem1 {

    public static void main(String[] args) throws IOException {

        Scanner fileRead = new Scanner(new File("Problem1.txt"));

        int[] counters = new int[10];
        int numTemp;

        while (fileRead.hasNext()) {
            // read next line into Integer
            numTemp = Integer.parseInt(fileRead.nextLine());
            // subtract 1, shift number right, dropping fractional component
            numTemp = (numTemp - 1) / 10;
            // numTemp is now the index to increment
            counters[numTemp]++;


        }

        printArray(counters);

    }

    public static void printArray(int[] counters) {
        for (int i = 0; i < 10; i++) {
            // ranges to display are (i * 10 + 1) and (i * 10 + 10)
            System.out.format("%d - %d: \t| %s\n", (i * 10) + 1, (i * 10) + 10, genStars(counters[i]));
        }
    }

    public static String genStars(int starCount) {
        String stars = "";
        for (int i = 0; i < starCount; i++) {
            stars += "*";
        }
        return stars;
    }

}