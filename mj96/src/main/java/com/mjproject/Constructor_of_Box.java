package com.mjproject;

class Boxs {
    double width;
    double height;
    double depth;

    double volume() {

        return width * height * depth;
    }

    Boxs(double width, double height, double depth) {
        System.out.println("Constructing Box");
        this.width = width;
        this.height = height;
        this.depth = depth;

    }

}

public class Constructor_of_Box {
    public static void main(String[] args) {
        Boxs myBoxs1 = new Boxs(10, 20, 15);
        Boxs myBox2 = new Boxs(3, 6, 9);
        // myBoxs.width = 10;
        // myBoxs1.height = 10;
        // myBoxs1.depth = 10;
        double vol = myBoxs1.volume();
        System.out.println("Volume of the Box is " + vol);
        System.out.println("width of the Box is " + myBoxs1.width);

        vol = myBox2.volume();
        System.out.println("Volume of the second box is " + vol);
        System.out.println("depth of the Second Box is " + myBox2.depth);
    }
}
