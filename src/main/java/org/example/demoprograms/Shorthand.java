package org.example.demoprograms;

import java.util.Scanner;

public class Shorthand {

    public int shorthand(int a, int b){
        int min;
        min=(a==b)? a :b;
        System.out.println("Minimum Value is::::"+min);
        return min;
    }

    public static void main(String[] args) {

        /*Shorthand shorthand=new Shorthand();
        Scanner scanner=new Scanner(System.in);*//*

        System.out.println("Enter 'A' Value:::");
        int a= scanner.nextInt();
        System.out.println("Enter 'B' Value:::");
        int b= scanner.nextInt();
        shorthand.shorthand(a,b);*/
        String test="Sandeep";
        System.out.println(test);
        test="Test";
        System.out.println(test);
    }
}
