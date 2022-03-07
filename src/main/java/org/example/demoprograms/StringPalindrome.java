package org.example.demoprograms;

import java.util.Scanner;
public class StringPalindrome {
    public void palindrome(String name){
        String reversename="";
        int length=name.length();
        for(int i=name.length()-1;i>=0;i--){
            reversename=reversename+name.charAt(i);
        }
        if(name.equals(reversename)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }

    public static void main(String[] args) {
      StringPalindrome obj=new StringPalindrome();
      Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String");
        String name= scanner.next();
        obj.palindrome(name);
    }
}
