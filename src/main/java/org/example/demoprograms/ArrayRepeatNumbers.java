package org.example.demoprograms;

import java.util.Scanner;

public class ArrayRepeatNumbers {

    public static void main(String[] args) {
        int array[]=new int[]{2,8,6,7,9,2,5,8};
        for(int i=0;i<= array.length-1;i++){
            for(int j=i+1;j<= array.length-1;j++){
                if(array[i]==array[j]){
                    System.out.println(+array[j]);
                }
            }
        }
    }
}
