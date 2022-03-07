package org.example.demoprograms;

import java.util.Scanner;

public class ArraysCopy {
    public static void arraysCopy(int[] array1, int[] array2) {
        int[] array3;
        array3 = new int[array2.length];
        for (int i = 0; i <=array1.length - 1; i++) {
            array3[i] = array1[i];
        }
        System.out.println("Copied array elements are");
        for (int i = 0; i <=array3.length-1; i++) {
            System.out.println(array3[i] + "");
        }
    }

    public static void copyAtoB(int[] array1) {
        int[] array2;
        array2 = new int[array1.length];
        for (int i = 0; i < array1.length - 1; i++) {
            array2[i] = array2[i] + array1[i];
        }
        System.out.println("copying a to b");
        for (int i = 0; i < array1.length; i++) {
            System.out.printf(array2[i] + "" + array1[i] + "");
        }
    }

    public static void main(String[] args) {
        int[] arrays1;
        int[] arrays2;
        int MAX;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Size of an array");
        MAX = scanner.nextInt();
        arrays1 = new int[MAX];
        arrays2 = new int[MAX];
        int numbers;
        for (int i = 0; i <= arrays1.length - 1; i++) {
            System.out.println("Enter the first array Elements");
            numbers = scanner.nextInt();
            arrays1[i] = numbers;
        }
        for (int i = 0; i <= arrays2.length - 1; i++) {
            System.out.println("Enter the Second array Elements");
            numbers = scanner.nextInt();
            arrays2[i] = numbers;
        }
        arraysCopy(arrays1,arrays2);
        copyAtoB(arrays1);
    }
}