package org.example.demoprograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayAlphabetically {
    public static String array1[];
    public static int max;

    public static void sortarray(String array1[]) {
       //{lan,van,man}
        String temp;
        for (int i = 0; i < array1.length-1; i++) {//
           //lan,van
            //van,man
            // for (int j = i + 1; j <=array1.length-1; j++) {
            System.out.println(array1[i].compareTo(array1[i + 1]));
            if (array1[i].compareTo(array1[i + 1]) > 0) {
                temp = array1[i];
                array1[i] = array1[i + 1];
                array1[i + 1] = temp;
                i = -1;


            }

        }
        System.out.println("sorted array is " + Arrays.toString(array1));
    }
    //System.out.println("sorted array is " + Arrays.toString(array1));





    public static void main(String[]args){
        SortArrayAlphabetically obj=new SortArrayAlphabetically();
        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array");
        max = scanner.nextInt();
        array1 = new String[max];
        String name;
        for (int i = 0; i <= array1.length - 1; i++) {
            System.out.println("enter the string");
            name = scanner.next();
            array1[i] = name;
            //System.out.println("input array is" + array1[i]);
        }
        sortarray(array1);


    }
}
