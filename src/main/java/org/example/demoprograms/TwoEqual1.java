package org.example.demoprograms;

import java.util.Scanner;

public class TwoEqual1 {

    public static void main(String[] args) {
        TwoEqual obj =new TwoEqual();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the First Number");
        double a=scanner.nextDouble();
        System.out.println("Enter the Second Number");
        double b=scanner.nextDouble();
        obj.twoEqual(a,b);

    }
}
