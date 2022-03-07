package org.example;

import java.util.Scanner;

public class TwoEqual {
    public int twoequal(int a,int b,int c,int d){
        if(a==b){
            System.out.println("Equal numbers are:::"+a+b);
        }
        if(b==c){
            System.out.println("Equal numbers are:::"+b+c);
        }
        if(c==d){
            System.out.println("Equal numbers are:::"+c+d);
        }
        else if(a==c){
            System.out.println("Equal numbers are:::"+a+c);
        }
        else if(a==d){
            System.out.println("Equal numbers are:::"+a+d);
        }
        else if(b==d){
            System.out.println("Equal numbers are:::"+b+d);
        }
        else{
            System.out.println("No numbers are Equal:::");
        }
        return a;
    }

    public static void main(String[] args) {
        TwoEqual obj=new TwoEqual();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int number1=scanner.nextInt();
        System.out.println("Please enter the second number");
        int number2=scanner.nextInt();
        System.out.println("Please enter the third number");
        int number3=scanner.nextInt();
        System.out.println("Please enter the fourth number");
        int number4=scanner.nextInt();
        obj.twoequal(number1,number2,number3,number4);
    }
}
