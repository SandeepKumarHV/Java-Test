package org.example.demoprograms;

import java.util.Scanner;

public class ArraysSortPosNegZero {
    public static void checkArrayIsPosOrNegOrZero(int[] arrays){
        int[] arrays1=new int[arrays.length];
        int[] arrays2=new int[arrays.length];
        int[] arrays3=new int[arrays.length];
        int postiveCounter=0;
        int negativeCounter=0;
        int zeroCounter=0;
        for (int i = 0; i <= arrays.length - 1; i++) {
            //i=1
            if (arrays[i] > 0) {
                System.out.println("+ve Numbers are" + arrays1[i]);
                arrays1[postiveCounter]=arrays[i];
                postiveCounter++;
            }
            else if(arrays[i]<0){
                System.out.println("-ve Numbers are" + arrays2[i]);
                arrays2[negativeCounter]=arrays[i];
                negativeCounter++;
            }
            else{
                System.out.println("zero"+arrays3[i]);
                arrays3[zeroCounter]=arrays[i];
                zeroCounter++;
            }
        }
       arrayDisplay(arrays1,false);
        arrayDisplay(arrays2,false);
        arrayDisplay(arrays3,true);
    }
    public static void arrayDisplay(int[] arrays,boolean flag) {
        System.out.println("*********Start***********");
        if (flag == false) {
            for (int i = 0; i <= arrays.length - 1; i++) {
                if (arrays[i] != 0) {
                    System.out.println(arrays[i]);
                }
            }
            System.out.println("*********End***********");
        }
        else {
            for(int i=0;i<= arrays.length-1;i++){
                System.out.println(arrays[i]);
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
        checkArrayIsPosOrNegOrZero(inputArray);
        /*
        * input=[2,-2,3,-3,0]
        * display=[2,3,0,0,0]
        * display2=[-2,-3,0,0,0]
        * display3=[0,0,0,0,0]
        * */
    }
}
