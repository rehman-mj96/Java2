package com.mjproject;

class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width*height*depth;
        
    }
}

public class BoxDemo1 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol ;

        // assign values to mybox1's instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        /*
         * assign different values to mybox2's
         * instance variables
         */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // display volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of the first box is " + vol);

        // display volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of the second box is " + vol);
    }
}
