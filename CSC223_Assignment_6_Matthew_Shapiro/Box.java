/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 6 P1         **********/
/**********     Date Last Modified: 2016-10-16              **********/
/*********************************************************************/

class Box {

    private double height, width, depth;
    private boolean full;

    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.full = false;
    }

    public String toString() {
        String format = "Height: %s\tWidth: %s\tDepth: %s\tFull: %b";
        return String.format(format, this.height, this.width, this.depth, this.full);

    }

    public void setFull(boolean isFull) {
        // if we want boxes, once full, to remain flagged as full permanently
        // if (isFull) {this.full = true;}
        this.full = isFull;
    }

    public boolean isFull() {
        return this.full;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return this.depth;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }


}