/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 8 P2         **********/
/**********     Date Last Modified: 2016-11-02              **********/
/*********************************************************************/

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

class Problem2 {

    static int a, e, i, o, u, spaces, upperVowels;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        

        String str = scan.nextLine();
        char character;
        List<Character> lst = Arrays.asList('A', 'E', 'I', 'O', 'U');
        

        for (int idx = 0; idx < str.length(); idx++) {

            character = str.charAt(idx);
            switch (character) {
                // if char at current index matches a case:
                // increment counter, skip to next iteration of loop
                case 'e':
                    e++;
                    continue;

                case 'a':
                    a++;
                    continue;

                case 'i':
                    i++;
                    continue;

                case 'o':
                    o++;
                    continue;

                case 'u':
                    u++;
                    continue;

                case ' ':
                    spaces++;
                    continue;

            }
            // all uppercase vowels are counted together, per assignment specs
            if (lst.contains(character)) {
                upperVowels++;
            }

            

        }
        // notVowels is, by definition, every character which hasn't previously been counted
        int notVowels = str.length() - (a + e + i + o + u + upperVowels + spaces);
        // print some output
        System.out.format("\na: %s\te: %s\ti: %s\to: %s\tu: %s\n", a, e, i, o, u);
        System.out.format("Spaces: %d\tNon-space & non-vowel chars: %d\n", spaces, notVowels);

    }


}