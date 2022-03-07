package org.example.basicprograms;

public class MathOperation {

    MathOperation obj = new MathOperation();

    public double circumference(double r) {
        double c = 2 * 3.14 * r;
        System.out.println("Circumference of a circle is::::" + c);
        return c;
    }

    public double squareRoot(double a) {
        double sqrt = Math.sqrt(a);
        System.out.println("Square root of given number is::::" + sqrt);
        return sqrt;
    }

    protected double compoundInterest(int p, int r, int n, int t) {
        double ci = (p * (1 + (r / n)) * Math.pow(n, t));
        System.out.println("Compound interest is::::" + ci);
        return ci;
    }

    int addition(double a) {
        int c = (int) (a + a);
        return c;
    }

}
