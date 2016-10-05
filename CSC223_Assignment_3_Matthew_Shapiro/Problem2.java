/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Ch. 3 Problem 3.3       **********/
/**********     Date Last Modified: 2016-09-28              **********/
/*********************************************************************/

import java.util.Random;

class Problem2 {
    
    public static void main(String[] args) {

        String a = part1();
        String b = part2();
        String c = part3();

        System.out.println(a + "-" + b + "-" + c);

    }

    static String part1() {

        Random generator = new Random();

        int[] first = new int[3];

        // fill first[0] with value 1-7 (can't start phone numbers with 0)
        first[0] = generator.nextInt(7) + 1;

        // fill first[1:end] with values 0-7
        for (int i = 1; i < first.length; i++) {
            first[i] = generator.nextInt(8);
        }
        
        String a = "";
        // concat each integer onto str *a*
        for (int element : first) {
            a += Integer.toString(element);
        }

        return a;

    }

    static String part2() {

        Random generator = new Random();

        int second = generator.nextInt(656);
        String b = Integer.toString(second);
        // pad out to 3 digits (so we can have numbers with leading 0's)
        b = ("000" + b).substring(b.length());

        return b;
    }

    static String part3() {

        Random generator = new Random();

        int third = generator.nextInt(10000);
        String c = Integer.toString(third);
        // padding
        c = ("0000" + c).substring(c.length());

        return c;
    }



}