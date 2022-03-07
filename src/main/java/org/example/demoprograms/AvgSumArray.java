package org.example.demoprograms;

import java.util.Scanner;

public class AvgSumArray {
    public static void avgSumArray(int[]arrays){
        int sum=0;
        int avg;
        for(int i=0;i<= arrays.length-1;i++){
            sum=sum+arrays[i];
        }
        avg=sum/ arrays.length;
        System.out.println("Average of array element is"+avg);
        System.out.println("Sum of array element is"+sum);
    }


    public static void main(String[] args) {
        int[] arrays;
        int MAX;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        MAX= scanner.nextInt();
        arrays=new int[MAX];
        int numbers;
        for(int i=0;i<= arrays.length-1;i++){
            System.out.println("Enter The Array Elements");
            numbers=scanner.nextInt();
            arrays[i]=numbers;
        }
        avgSumArray(arrays);
    }
    /*int []
    input=0,20,30,-6,-10
    * */
}
