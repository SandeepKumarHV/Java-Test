package org.example.basicprograms;

import java.util.Scanner;

public class Charecterindex {
    public int charecterindex(String str,String str1){
        int index=str.indexOf(str1);
        //System.out.println("The index of"+str1+" is "+index);
        return index;
    }

    public static void main(String[] args) {
        Charecterindex obj=new Charecterindex();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String");
        String str=scanner.nextLine();
        System.out.println("Enter the charecter to find index");
        String str1=scanner.nextLine();
        int result=obj.charecterindex(str,str1);
        System.out.println("The Index of the given Charecter is"+result);
        /*
        * input=sandeep
        * input2=d
        * */
    }
}
