/*********************************************************************/
/**********     Author:             Matthew Shapiro         **********/
/**********     Organization:       HCC                     **********/
/**********     Project:            Assignment 4 P1         **********/
/**********     Date Last Modified: 2016-10-01              **********/
/*********************************************************************/


class Rectangle {

        private double width, height;

        // two-args constructor
        Rectangle(double width, double height) {

            this.width = width;
            this.height = height;

        }

        // no-args constructor
        Rectangle() {

            this.width = 1;
            this.height = 1;

        }

        public double findArea() {

            // return area
            return width * height;

        }

        public double findPerimeter() {

            // return sum of all 4 sides
            return 2 * (width + height);
        }


        public double getWidth() {

            return this.width;

        }

        public double getHeight() {

            return this.height;

        }

        public void setWidth(double width) {

            this.width = width;

        }

        public void setHeight(double height) {

            this.height = height;

        }

    }
