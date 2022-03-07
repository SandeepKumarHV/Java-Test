package org.example.demoprograms;

import java.util.Scanner;

public class Demo0 {
    public int sum(int a, int b) {
        int e = a + b ;
        return e;
    }

    public double multiplication(double c, double d) {
        double f = c * d ;
        return f;
    }

    public static void main(String[] args) {
        Demo0 result=new Demo0();
       /* int e = result.sum(10, 20);
        System.out.println(e);
        double f = result.multiplication(1.02, 3.02);
        System.out.println(f);*/
        Scanner scanner=new Scanner(System.in);

 /*       System.out.println("Enter Value of A in Natural Numbers");
        int a= scanner.nextInt();
        System.out.println("Enter Value of B in Natural Numbers");
        int b= scanner.nextInt();
        System.out.println("Addition of the numbers is::::");
        int e= scanner.nextInt();

        result.sum(a,b);*/

        System.out.println("Enter Value of C");
        double c= scanner.nextDouble();
        System.out.println("Enter Value of D");
        double d= scanner.nextDouble();

        System.out.println("Multiplication of the numbers is::::");

        double result1=result.multiplication(c,d);
        System.out.println(result1);




      /*  System.out.println("Enter Value of A");
        double c= scanner.nextDouble();
        System.out.println("Enter Value of B");
        double d= scanner.nextDouble();
        result.multiplication(c,d);*/


    }

}
