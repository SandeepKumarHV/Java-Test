package org.example.oops;

public class Dell extends Laptop{
    private int tax=5000;
    public int totalPrice(){
        int totalPrice=getPrice()+tax;
        System.out.println("Total Price is :::"+totalPrice);
        return totalPrice;
    }
    public int getSpecifications(){
        int ramSize=4;
        int screenSize=15;
        int inbuiltMemory=100000000;
        System.out.println("Ram size is:::"+ramSize+"\nScreen Size is:::"+screenSize+"\nInbuiltMemory:::"+inbuiltMemory);
        return 0;
    }

    public static void main(String[] args) {
        Dell obj=new Dell();
        obj.totalPrice();
        obj.getSpecifications();
    }
}
