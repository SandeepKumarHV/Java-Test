package org.example.demoprograms;

import sun.misc.GC;

import java.util.Scanner;

public class ArrayMaxDouble {

    private static int GC = 0;
    private static int MAX=2;
    private static int[] array=new int[MAX];

    static{
        System.out.println("The Initial Counter MAX = "+MAX+" GC = "+GC);
    }
    public static void addElement( int element){
        if(GC<MAX){
            array[GC]=element;
            GC++;
            System.out.println("New Element "+element+" added , GC is "+GC);
        }
       else{
            System.out.println("Array size reaching Max so Doubling the Array");
            int[] temp=new int[MAX];
            temp=array;
            MAX=MAX*2;
            System.out.println("Array Max is "+MAX);
            array=new int[MAX];
            System.out.println("Array Length is "+array.length);
            for(int i=0;i<=temp.length-1;i++){
                array[i]=temp[i];
            }
            //GC++;
            array[GC]=element;
            GC++;
            System.out.println("New Element "+element+" added , GC is "+GC);
        }

        /*for(int i=0;i<= array.length-1;i++){
            int[] temp=new int[MAX];
            temp=array;
            System.out.println("Iteration"+temp+"is"+i);
            if(GC==MAX){
                System.out.println("Array reaches to Maximum"+MAX);
                MAX=MAX*2;
            }
        }*/
    }

    public static void main(String[] args) {
       /* int[] array;
        int MAX=2;
        array = new int[MAX];
        Scanner scanner = new Scanner(System.in);
      *//*  System.out.println("Enter The Size Of The Array");
        MAX = scanner.nextInt();*//*


        int number;
        for (int i = 0; i <=array.length - 1; i++) {
            System.out.println("Enter The Number");
            number = scanner.nextInt();
            array[i] = number;
        }*/
        /*addElement(10);
        addElement(20);
        addElement(30);*/
        for (int i = 0; i <=5; i++) {
            addElement(i+10);
        }
        System.out.println("Array is");
        for(int i=0;i<= array.length-1;i++){
            System.out.println("Index is "+i+" Value is "+array[i]);
        }
    }
}
//1)WAP to sort the names ALPHABETICALLY in an Array...
//input=[LAN,VAN,MAN]
//output=[LAN,MAN,VAN]
//2)WAP to replace the string in a string of Arrays...
//ip=[LAN,VAN,MAN]
//an is replaced by am
//op=[LAM,VAM,MAM]