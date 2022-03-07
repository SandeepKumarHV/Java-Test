package org.example.demoprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void arrayInAscending(int[] arrays){
        System.out.println("Unsorted Array Is");
        for(int i=0;i<=arrays.length-1;i++){
            //Arrays.sort(arrays);
            System.out.println(arrays[i]);
        }
        Arrays.sort(arrays);
        System.out.println("sorted Array Is");
        for(int i=0;i<=arrays.length-1;i++){
            //Arrays.sort(arrays);
            System.out.println(arrays[i]);
        }
    }

    public static void main(String[] args) {
        int[] inputArray;
        int MAX;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        MAX= scanner.nextInt();
        inputArray=new int[MAX];
        int number;
        for (int i =0; i <=inputArray.length - 1; i++){
            System.out.println("Enter The Number");
            number = scanner.nextInt();
            inputArray[i] = number;
        }
         arrayInAscending(inputArray);
    }
}
