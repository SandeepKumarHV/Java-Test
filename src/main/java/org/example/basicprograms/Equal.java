package org.example.basicprograms;

import java.util.Scanner;

public class Equal {
    public void equal(double a,double b,double c){
        if(a==b && b==c && a==c){
            System.out.println("All Numbers are Equal");
        }
        else{
            System.out.println("All Numbers are not Equal");
        }
    }

    public static void main(String[] args) {
        Equal obj=new Equal();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter value for first number");
        double number1=scanner.nextDouble();
        System.out.println("Please enter value for second number");
        double number2=scanner.nextDouble();
        System.out.println("Please enter value for third number");
        double number3=scanner.nextDouble();
        obj.equal(number1,number2,number3);
    }
}
