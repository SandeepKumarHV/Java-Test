package org.example.basicprograms;

import java.util.Scanner;

public class MatOperation {
    public double matoperation(int number,double x, double y){
        double z=0;
        switch (number){
            case 1: z=x+y;
                System.out.println("Addition is:::"+z);
                break;
            case 2: z=x-y;
                System.out.println("Substraction is:::"+z);
                break;
            case 3: z=x*y;
                System.out.println("Multiplication is:::"+z);
                break;
            case 4: z=x/y;
                System.out.println("Division is:::"+z);
                break;
            case 5: z=x%y;
                System.out.println("Modulus is:::"+z);
                break;
            default:
                System.out.println("Invalid choice");
        }
        return z;
    }

    public static void main(String[] args) {
        MatOperation obj=new MatOperation();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter value for number");
        int number=scanner.nextInt();
        System.out.println("Please enter value for x");
        double x=scanner.nextDouble();
        System.out.println("Please enter value for y");
        double y=scanner.nextDouble();
        obj.matoperation(number,x,y);
    }
}
