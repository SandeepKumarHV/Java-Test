package org.example.basicprograms;

import java.util.Scanner;

public class ReplaceString {
    public String replaceString(String fullstring, String replacablestring, String replacingstring){

        fullstring=fullstring.replace(replacablestring,replacingstring);
        System.out.println("fullstring is"+fullstring);
        return replacingstring;
    }

    public static void main(String[] args) {

        ReplaceString obj=new ReplaceString();

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter String");
        String string1=scanner.nextLine();

        System.out.println("Enter Replacable String");
        String string2= scanner.nextLine();

        System.out.println("Enter Replacing String");
        String string3=scanner.nextLine();

        obj.replaceString(string1,string2,string3);
    }
}
