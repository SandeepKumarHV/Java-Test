package org.example.basicprograms;

import java.util.Scanner;

public class GetSubString {
    public int subString(String str,String str1){
        int index=str.indexOf(str1);
        return index;
    }
    public String getSubString(String input,String subString){
        int indexOfSubString=input.indexOf(subString);
        int endIndex=subString.length()+indexOfSubString;
        String substring=input.substring(indexOfSubString,endIndex);
        System.out.println("result"+substring);
        return subString;
    }
    public static void main(String[] args) {
        GetSubString obj=new GetSubString();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the Complete String");
        String input= scanner.nextLine();
        System.out.println("Please Enter the SubString");
        String substring= scanner.nextLine();
        obj.getSubString(input,substring);
    }
}