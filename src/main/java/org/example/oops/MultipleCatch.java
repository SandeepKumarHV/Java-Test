package org.example.oops;

public class MultipleCatch {
    public static int multiCatch(int a, int b) {

    int c = 0;
    try {
        c = a/b;
        System.out.println("result is " + c);
    }
    catch (ArithmeticException e) {
        System.out.println(e);
    }
    catch (IndexOutOfBoundsException e) {
        System.out.println(e);
    }
    return c;
}

    public static void main(String[] args) {
        multiCatch(40,0);
    }
}
