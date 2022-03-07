package org.example.demoprograms;

import java.util.Scanner;

public class DuplicateArray {
    public static void duplicatenum(int[] array){
        for(int i=0; i<array.length-1; i++){
            int count=1;
            for(int j=i+1; j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                    System.out.println("Duplicate element is "+array[j]);
                }
                if(count>1){
                    System.out.println("Duplicate element "+array[i]+" is occured " +count+" times ");

                }
            }
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
        duplicatenum(arrays);
        /*
         * 10,20,30,40,10*/
    }
}
