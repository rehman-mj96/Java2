package com.mjproject;

class RecTest {
    int values[];

    RecTest(int a) {
        values = new int[a];
    }

    void printArray(int i) {
        if (i < 0) {

            return;
        } else {
            values[i] = i;
            printArray(i - 1);
        }
        System.out.println("[" + i + "] " + values[i--]);
    }
}

public class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);

        // for (i = 0; i < 10; i++)
        // ob.values[i] = i;

        ob.printArray(9);
    }
}
