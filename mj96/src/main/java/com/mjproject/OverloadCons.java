package com.mjproject;

import javax.swing.Box;

/*Here, Box defines three constructors to initialize
    the dimensions of a box in various ways
*/
class Box2 {
    double height;
    double width;
    double depth;

    // Constructor Clone of an object.
    Box2(Box2 obj) { // pass object to constructor.
        this.width = obj.width;
        this.height = obj.height;
        this.depth = obj.depth;
    }

    // Constructor used when all dimensios specified.
    Box2(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Constructor used when no dimensions specified.
    Box2() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }

    // Constructor used when cube is created
    Box2(double side) {
        this.width = this.depth = this.height = side;
    }

    // Compute and return volume.
    double volume() {
        return width * depth * height;
    }
}

public class OverloadCons {
    public static void main(String[] args) {
        Box2 myBox1 = new Box2(10, 20, 15);
        Box2 myBox2 = new Box2();
        Box2 myCube = new Box2(7);

        double vol;

        Box2 myCloneBox = new Box2(myBox1);
        vol = myCloneBox.volume();
        System.out.println("Volume of clone is :" + vol);

        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);

        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);

        // get Volume of Cube.
        vol = myCube.volume();
        System.out.println("Volume of mycube is :" + vol);
    }
}
