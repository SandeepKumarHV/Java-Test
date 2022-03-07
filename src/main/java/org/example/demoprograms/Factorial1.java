package org.example.demoprograms;

import java.util.Scanner;
public class Factorial1 {
    public void factorial(int num) {
        int result = 1;
        for (int i = num; i >= 1; i--) {
            System.out.println("Iteration"+result+"is"+i);
            result=result*i;
            System.out.println("Factorial is"+result);
        }

    }

    public static void main(String[] args) {
        Factorial1 obj=new Factorial1();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The number");
        int num= scanner.nextInt();
        obj.factorial(num);
    }
}
