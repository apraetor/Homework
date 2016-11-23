/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 9 P3         **********/
/**********     Date Last Modified: 2016-11-08              **********/
/*********************************************************************/

//********************************************************************
//  Coin.java       Author: Lewis/Loftus
//
//  Represents a coin with two sides that can be flipped.
//********************************************************************

public class Coin implements Lockable
{
   private final int HEADS = 0;
   private final int TAILS = 1;
   private int key;
   private boolean isLocked;

   private int face;

   //-----------------------------------------------------------------
   //  Sets up the coin by flipping it initially.
   //-----------------------------------------------------------------
   public Coin ()
   {
      isLocked = false;
      flip();
   }

   //-----------------------------------------------------------------
   //  Flips the coin by randomly choosing a face value.
   //-----------------------------------------------------------------
   public void flip ()
   {
      if (isLocked == false) {
         face = (int) (Math.random() * 2);
      }
   }

   //-----------------------------------------------------------------
   //  Returns true if the current face of the coin is heads.
   //-----------------------------------------------------------------
   public Boolean isHeads ()
   {
      if (isLocked == false) {
         return (face == HEADS);
      } else {
         return null;
      }
   }

   public void setKey(int newKey) {
      this.key = newKey;
   }

   public void lock(int key) {
      if (isKey(key)) {
         isLocked = true;
      }
   }

   public void unlock(int key) {
      if (isKey(key)) {
         isLocked = false;
      }
   }

   public boolean locked() {
      return isLocked;
   }

   private boolean isKey(int key) {
      return (this.key == key);
   }


   //-----------------------------------------------------------------
   //  Returns the current face of the coin as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      if (isLocked == false) {

         String faceName;

         if (face == HEADS)
            return "Heads";
         else
            return "Tails";
      } else {
         return "**** LOCKED ****";
      }

      
   }
}
