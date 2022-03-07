package org.example.demoprograms;

import java.util.Scanner;

public class Largest {
    public static int largest(int[] array) {
        int lar = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println("Iteration"+lar+"is"+i);
            if (lar < array[i]) {
                lar = array[i];
            }
        }
        System.out.println("Largest number is" + lar);
        return lar;
    }

    public static int smallest(int[] array){
        int min = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println("Iteration"+min+"is"+i);
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Smallest number is"+min);
        return min;
    }

    public static void main(String[] args) {
        int[] arrays;
        int MAX;
        Largest obj = new Largest();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Size of the array");
        MAX = scanner.nextInt();
        arrays = new int[MAX];
        int numbers;
        for (int i = 0; i <= arrays.length - 1; i++) {
            System.out.println("Enter The Array Elements");
            numbers = scanner.nextInt();
            arrays[i] = numbers;
        }
        largest(arrays);
        smallest(arrays);
    }
}