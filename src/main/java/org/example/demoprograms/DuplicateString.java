package org.example.demoprograms;

import java.util.Scanner;

public class DuplicateString {
    //public String name[];

    /*public DuplicateString(String Name[]) {
        name = Name;
    }*/
    //String(strings);
    public static void String(String[] stringnames) {
        for (int i = 0; i <= stringnames.length - 1; i++) {
            for (int j =i+1; j <= stringnames.length-1; j++) {
                if (stringnames[i] == stringnames[j]) {
                    System.out.println("The String Is Duplicate"+stringnames[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] strings;
        int MAX;
        //DuplicateString duplicateString=new DuplicateString();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        MAX= scanner.nextInt();
        strings=new String[MAX];
        String names;
        for(int i=0; i< strings.length;i++){
            System.out.println("Enter the String Names");
            names= scanner.next();
            strings[i]=names;
        }
        String(strings);
    }
}
