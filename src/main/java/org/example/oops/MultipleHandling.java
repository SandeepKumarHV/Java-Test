package org.example.oops;

import java.io.IOException;

public class MultipleHandling {
    public static int multipleHandling(int a, int b) {

        int c = 0;
        try {
            c = a/b;
            System.out.println("result is " + c);
        }
        catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        return c;
    }

    public static void main(String[] args) {
        multipleHandling(40,0);
    }
}
