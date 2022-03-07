package org.example.demoprograms;

import java.util.Scanner;

public class ReturnIndex {
    public int returnIndex(String str,String str1){
        int index=str.indexOf(str1);
        return index;
    }

    public static void main(String[] args) {
        ReturnIndex sandeep=new ReturnIndex();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String");
        String string=scanner.nextLine();
        System.out.println("Enter the charecter to find index");
        String charc=scanner.nextLine();
        int result=sandeep.returnIndex(string,charc);
        System.out.println(result);
    }
}
