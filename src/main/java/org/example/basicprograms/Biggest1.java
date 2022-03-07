package org.example.basicprograms;

import java.util.Scanner;

public class Biggest1 {
    public double biggest1(double a,double b,double c){
        int result=0;
        if (a>b && a>c) {
            System.out.println("The Biggest number is:" + a);
        }
        else if (b > c) {
            System.out.println("The Biggest number is:" + b);
        }
        else {
            System.out.println("The Biggest number is:" + c);
        }
        return result;
    }
    public static void main(String[] args) {
    Biggest1 obj=new Biggest1();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter value for first number");
        double number1=scanner.nextDouble();
        System.out.println("Please enter value for second number");
        double number2=scanner.nextDouble();
        System.out.println("Please enter value for third number");
        double number3=scanner.nextDouble();
        obj.biggest1(number1,number2,number3);
        //obj.biggest1(10,20,30);
        //biggest1(10,20,30);
    }
}
