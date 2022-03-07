package org.example.corejava;

import org.example.demoprograms.Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        LinkedList<Integer> test=new LinkedList<>();
        for(int i=0;i<5;i++){
            test.add(i*2);
        }
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the search element ");
        int number = scan.nextInt();
        boolean status=false;

        for(Integer value:test){
            System.out.println("array of I is   "+value);
            if(value == number){
                System.out.println("Search element found:::: " +value);
                status=true;
                break;
            }
        }

        if (!status){
            System.out.println("Search Element Not Found");
        }
    }
}

