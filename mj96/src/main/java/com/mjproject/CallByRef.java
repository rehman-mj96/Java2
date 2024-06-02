package com.mjproject;

// Objects are passed by reference.
class Test2 {
    int a, b;

    Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void meth(Test2 o) {
        o.a *= 2;
        o.b /= 2;
    }
}

public class CallByRef {
    public static void main(String[] args) {
        Test2 ob = new Test2(15, 20);

        System.out.println("ob.a and ob.b before call : " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a and ob.b after call : " + ob.a + " " + ob.b);
    }
}
