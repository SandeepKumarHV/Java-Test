package org.example.demoprograms;

import java.util.Scanner;

public class ForLoopStar {
    public static void printStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //printStar(3);
        ForLoopStar obj=new ForLoopStar();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= scanner.nextInt();
        obj.printStar(n);
    }
}