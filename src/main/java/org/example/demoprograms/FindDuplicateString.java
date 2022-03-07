package org.example.demoprograms;

import java.util.Scanner;

public class FindDuplicateString {
    static String[] results=new String[100];
    static int GC=0;
    static int i=0;

    public static void findStringDuplicate(String[] names){
        System.out.println("The Array names are");
        for(i=0;i<=names.length-1;i++){
            System.out.println(names[i]);
        }
        int counter=0;
        String[] results=new String[names.length];
        for(int i=0;i<= names.length-1;i++){
            for(int j=0;j<= names.length-1;j++){
                if(names[i].equals(names[j])){
                    counter++;
                    if(counter>+2){
                        checkAndAdd(names[i]);
                        break;
                    }
                }
            }
            counter=0;
        }
        /*for(int j=i+1;j<= names.length-1;j++){
            if(names[i].equals(names[j])){
                System.out.println("The Given String is Duplicate:::"+names[i]);
            }
        }
        System.out.println("The Duplicate string is:::"+results[i]);*/
    }
    public static void checkAndAdd(String name){
        boolean status= false;
        for(int i=0;i< results.length-1;i++);
        String value=results[i];
        if(value!=null){
            if(results[i].equals(name)){
                status=true;
            }
        }
        if(status==false){
            results[GC]=name;
            System.out.println("results:::"+results[GC]);
            GC++;
        }
    }

    public static void main(String[] args) {
        String[] array;
        int MAX;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the size of the array");
        int number= scanner.nextInt();
        MAX=number;
        array=new String[MAX];
        String name;
        for(int i=0;i<array.length-1;i++){
            System.out.println("Enter the number");
            name= scanner.next();
            array[i]=name;
        }
        findStringDuplicate(array);
    }
}

