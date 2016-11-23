/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 5 P3         **********/
/**********     Date Last Modified: 2016-10-12              **********/
/*********************************************************************/

import java.util.ArrayList;
import java.util.Scanner;

class Kennel {

    public static void main(String[] args) {

        ArrayList<Dog> dogs = new ArrayList<Dog>();
        Scanner scan = new Scanner(System.in);
        
        // create some Dog objects
        Dog jake = new Dog("Jake", 6);
        Dog freyja = new Dog("Freyja", 5);

        // create array of references to make interation possible
        dogs.add(jake);
        dogs.add(freyja);

        String choice = "";
        int yearsInKennel = 0;
        // clear screen so we can start the magic!
        clearScreen();

        do {
            
            if (choice.toUpperCase().equals("Q")) {

                break;

            } else {

                    
                    System.out.format("%d years in kennel\n", yearsInKennel++);
                    printDogs(dogs); // list the dogs
                    incrementYear(dogs); // increments the age of all Dog objects
                    System.out.print("[Q] to Quit, Enter to Continue: ");
                    choice = scan.nextLine();
                    clearScreen();

                }


        } while (true);

    }

    public static void printDogs(ArrayList<Dog> dogs) {

        System.out.println("**************************************************");

        for (Dog d : dogs) {
            // we've overridden toString() so we can print the Dog objects easy
            System.out.println(d);

        }

        System.out.println("**************************************************");

    }

    public static void incrementYear(ArrayList<Dog> dogs) {

        for (Dog d : dogs) {
            // increment age field of Dog objects
            d.setAge(d.getAge() + 1);

        }
    }

    public static void clearScreen() {

        System.out.print("\033[H\033[2J");  
        System.out.flush();  

    }


}