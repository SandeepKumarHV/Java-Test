package org.example.oops;

public class UncheckedException {
    public static int unchecked(int a,int b) {

        int c = 0;
        try {
            c = a/b;
            System.out.println("result is " + c);

        }
        catch (Exception e) {
            System.out.println(e);
        }
        return c;
    }

    public static void main(String[] args) {
        unchecked(20,0);
    }
}
