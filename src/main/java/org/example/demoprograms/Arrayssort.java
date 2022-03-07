package org.example.demoprograms;

import java.util.Scanner;

public class Arrayssort {
    private static int i;
    private static int temp;

    public static void Arraysorting(int[] arrays) {
       /* for (int i = 0; i <= arrays.length - 1; i++) {
            //System.out.println(arrays[i] + " ");
        }*/
        for (int i = 0; i <= arrays.length - 1; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[i] > arrays[j]) {
                    temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
        System.out.println("Sorted array elements : ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arrays;
        int MAX;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        MAX = scanner.nextInt();
        arrays = new int[MAX];
        int numbers;
        for (int i = 0; i <= arrays.length - 1; i++) {
            System.out.println("Enter the array elements");
            numbers = scanner.nextInt();
            arrays[i] = numbers;
        }
        Arraysorting(arrays);
    }
}