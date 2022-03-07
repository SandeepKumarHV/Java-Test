package org.example.demoprograms;

import java.util.Scanner;

public class Factorial {
    public void factorial(int num){
        int result=1;
        for(int i=num;i>=1;i--){
            System.out.println("Iteration"+result+"is"+i);
            result=result*i;
            System.out.println(result);
            System.out.println();
        }
        System.out.println("Factorial is"+result);
    }

    public static void main(String[] args) {
        Factorial factor=new Factorial();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Number");
        int factorail= scanner.nextInt();
        factor.factorial(factorail);

    }
}
