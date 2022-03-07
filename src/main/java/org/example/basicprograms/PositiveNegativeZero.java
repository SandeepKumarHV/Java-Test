package org.example.basicprograms;

import java.util.Scanner;

public class PositiveNegativeZero {
    public double positivenegativezero(double number){

        if(number>0){
            System.out.println("It is a Postive number:::"+number);
        }
        else if(number<0){
            System.out.println("It is a Negative number:::"+number);
        }
        else{
            System.out.println("It is Zero:::"+number);
        }
        return number;
    }

    public static void main(String[] args) {
        PositiveNegativeZero obj=new PositiveNegativeZero();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number");
        double number=scanner.nextDouble();
        obj.positivenegativezero(number);
    }
}
