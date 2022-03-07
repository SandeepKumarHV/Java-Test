package org.example.demoprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    private int arrays[];
    private int MAX;
    public  Array(int arraySize){
        MAX=arraySize;
        arrays=new int[MAX];
        System.out.println("Array Size:::"+ arrays.length);
    }
    public void insertEvenToArray(){
        System.out.println(arrays.length);
        for(int i=0;i<=arrays.length-1;i++){
            System.out.println(i);
        if(i%2==0){
            System.out.println("Even Value in the Index:::"+(i*i)+"is"+i);
            arrays[i]=i*i;
        }
        }
    }
    public static void initialArray(int arrays[]){
        int arrayLength= arrays.length;
        System.out.println("Size of Array is:::"+arrayLength);
    }
   /* public void insert(int arrayLenth){
        for(int i=0;i< arrays.length-1;i++){
            arrays[i]=i*i;
        }
    }*/

    public static void main(String[] args) {
        Array obj=new Array(5);
        obj.insertEvenToArray();
    }
 /*  public static void main(String[] args) {
       Array arrays=new Array(5);
       Scanner scanner=new Scanner(System.in);
       System.out.println("Size of the Array:::");
       int arralLength= scanner.nextInt();
       arrays.insert(arralLength);
   }*/
}
