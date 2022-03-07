package org.example.demoprograms;

import java.util.Scanner;

public class ForLoop {
    public void multiplication(int n){

        for(int i=1; i<=n; i++){
            if(i%i==0 && i%1==0){
                System.out.println("It is a Prime number"+i);
            }
        }
      /*  for(int i=1; i<=n; i++){
            System.out.println(i*i);
            for(int j=10; j>=1; j--){

                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }*/
    }

    public static void main(String[] args) {
       ForLoop obj=new ForLoop();
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= scanner.nextInt();
        obj.multiplication(n);
    }
}
