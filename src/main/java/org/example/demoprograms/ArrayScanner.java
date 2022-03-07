package org.example.demoprograms;

import sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ArrayScanner {
    public static void checkArrayIsPositiveOrNegative(int[] arrays) {
        for (int i = 0; i <= arrays.length - 1; i++) {
            if (arrays[i] >= 0) {
                System.out.println("Its a +ve Number" + arrays[i]);
            }
            else if(arrays[i]<=0){
                System.out.println("Its a -ve Number" + arrays[i]);
            }
            else{
                System.out.println("Its zero"+arrays[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] inputArray;
        int MAX;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        MAX = scanner.nextInt();
        inputArray = new int[MAX];

        int number;
        for (int i = 0; i <= inputArray.length - 1; i++) {
            System.out.println("Enter The Number");
            number = scanner.nextInt();
            inputArray[i] = number;
        }
        checkArrayIsPositiveOrNegative(inputArray);
    }
}