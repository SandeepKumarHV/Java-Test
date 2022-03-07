package org.example.basicprograms;

import java.util.Scanner;

public class Swap {
    public void swap(int a,int b,int c){
        System.out.println("Before swapping:::a="+a+" b="+b+" c="+c+"");
        b=a+b+c;
        c=b-c-a;
        a=b-c-a;
        b=b-(a+c);
        System.out.println("After swapping:::a="+a+" b="+b+" c="+c+"");
    }
    public static void main(String[] args) {
     /*   int a= 10;
        int b= 20;
        int c= 30;
        System.out.printf("Before swapping:::a="+a+" b="+b+" c="+c+"");

        b=a+b+c;
        c=b-c-a;
        a=b-c-a;
        b=b-(a+c);*/

 /*       a=a+b+c;
        c=a-b-c;
        b=a-c-b;
        a=a-(b+c);*/
        /*System.out.printf("After swapping:::a="+a+" b="+b+" c="+c+"");*/
        Swap obj=new Swap();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num1= scanner.nextInt();
        System.out.println("Enter the 2nd number");
        int num2= scanner.nextInt();
        System.out.println("Enter the 3rd number");
        int num3= scanner.nextInt();
        obj.swap(num1,num2,num3);
    }
}
