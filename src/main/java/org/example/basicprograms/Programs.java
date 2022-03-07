package org.example.basicprograms;

import java.util.Date;
import java.util.Scanner;

public class Programs {
    public static void main(String[] args) {

        MathOperation sandeep=new MathOperation();

        double c=sandeep.circumference(4);
        System.out.println(c);

        double sqrt=sandeep.squareRoot(64);
        System.out.println(sqrt);

        double ci=sandeep.compoundInterest(1000,5,1,3);
        System.out.println(ci);
       /* Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Radius(cm)");
        double number1= scanner.nextDouble();

        System.out.println("Enter Value");
        double number2=scanner.nextDouble();

        System.out.println("Enter the values of Principal, rate of interest, time period and Number of Installments Respectively");
        double number3=scanner.nextDouble();

        sandeep.circumference(number1);
        sandeep.squareRoot(number2);
*/



    }
}
