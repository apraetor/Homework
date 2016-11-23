/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 9 P3         **********/
/**********     Date Last Modified: 2016-11-08              **********/
/*********************************************************************/

interface Lockable {

    public abstract void setKey(int newKey);

    public abstract void lock(int key);

    public abstract void unlock(int key);

    public abstract boolean locked();

}