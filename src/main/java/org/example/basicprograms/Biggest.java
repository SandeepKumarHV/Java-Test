package org.example.basicprograms;

public class Biggest {
    public int biggest(int a,int b,int c){
        if(b>c){
            if(b>a)
                System.out.println("The Biggest number is"+b);
            else
                System.out.println("The Biggest number is"+a);
        }
        else{
            if(c>=a)
                System.out.println("The Biggest number is"+c);
            else
                System.out.println("The Biggest number is"+a);
        }
        return a;
    }

    public static void main(String[] args) {
        Biggest obj=new Biggest();
        int result=obj.biggest(10,20,30);
    }
}
