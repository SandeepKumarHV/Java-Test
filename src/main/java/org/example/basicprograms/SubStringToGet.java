package org.example.basicprograms;

import java.util.Scanner;

public class SubStringToGet {
    public void getSubString(String str,String str1){
        String result=str1;
        System.out.println("Substring is"+result);
    }
    public static void main(String[] args) {
        SubStringToGet obj=new SubStringToGet();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Complete String");
        String str= scanner.nextLine();
        System.out.println("Enter the substring");
        String str1= scanner.nextLine();
        obj.getSubString(str,str1);
    }
}
