package org.example.demoprograms;

import java.util.Scanner;

public class ArrayThanus {
        public void addition(int array[]) {
            int evensum = 0;
            int oddsum=0;
            int temp=0;
            int average=0;
            for (int i = 0; i <= array.length - 1; i++) {
                if(array[i]>i+1){
                    System.out.println("the the largest number is "+array[i]);
                }
                temp = temp + array[i];
                System.out.println("print addtion result" +temp);
                if(array[i]%2==0){
                    evensum=evensum+array[i];
                    System.out.println("the sum of even numbers is " +evensum);
                }
                else
                {
                    oddsum=oddsum+array[i];
                    System.out.println("the sum of odd numbers is "+oddsum);
                }
            }
            average=temp/ array.length;
            System.out.println("the average of given idex is" +average);

        }

        public static void main(String[] args) {
            int inputarray[];
            int max;

            ArrayThanus obj = new ArrayThanus();
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the range of the array");
            max = scan.nextInt();
            inputarray=new int[max];
            int number;
            for (int i = 0; i <= inputarray.length - 1; i++) {
                System.out.printf("enter the index::::::::::" + i+":::::");
                number = scan.nextInt();
                inputarray[i] = number;

            }
            obj.addition(inputarray);
        }

    }
//wap to count sum even and odd numbers in a given array
//input=10,5,20,15,30,25
//1+2+3+4+5


