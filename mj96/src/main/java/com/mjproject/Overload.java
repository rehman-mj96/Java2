package com.mjproject;

// Demonstrate method overloading.
class OverloadDemo {
    void test() {
        System.out.println("NO parameters");
    }

    // Overload test for one integer parameter.
    /*
     * void test(int a) {
     * System.out.println("a: " + a);
     * }
     */
    // Overload test for two integer parameters.
    void test(int a, int b) {
        System.out.println("a and b :" + a + " " + b);
    }

    // Overload test for a double parameter.
    double test(double c) {
        System.out.println("c :" + c);
        return c * c;
    }
}

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;
        int i = 33;

        // class all version of test.
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25) is :" + result);

        ob.test(i); // this will in invoke test(double).
        System.out.println(ob.test(123)); // this will also.
    }
}
