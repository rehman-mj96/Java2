package com.mjproject;

// This class defines an integer stack that can hold 10 values,
class Stack {
    private int stck[] = new int[10];
    private int tos;

    // Initialize top-of-stack
    Stack() {
        tos = -1;
    }

    // Push an itme onto the stack
    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full.");
        } else {
            stck[++tos] = item;
        }
    }

    // Pop an item off the stack
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            return stck[tos--];
        }
    }

    int getTos(){
        return tos;
    }
}

public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // push items onto the Stack.
        for (int i = 0; i < 10; i++)
            mystack1.push(i);
        for (int i = 10; i < 20; i++)
            mystack2.push(i);

        while (mystack1.getTos() > -1)
            System.out.println(mystack1.pop());
        while (mystack2.getTos() > -1)
            System.out.println(mystack2.pop());

        // these statements are not legal
        // mystack1.tos = -2;
        // mystack2.stck = 100;
    }
}
