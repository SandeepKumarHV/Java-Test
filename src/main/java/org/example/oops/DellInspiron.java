package org.example.oops;

public class DellInspiron extends Dell{
    private int tax=5500;

    public int totalPriceInspiron() {
        int totalPrice=totalPrice()+tax;
        System.out.println("Total Price is :::"+totalPrice);
        return super.totalPrice();
    }

    @Override
    public int getSpecifications() {
        int ramSize=8;
        int screenSize=16;
        int inbuiltMemory=150000000;
        System.out.println("Ram size is:::"+ramSize+"\nScreen Size is:::"+screenSize+"\nInbuiltMemory:::"+inbuiltMemory);
        return super.getSpecifications();
    }

    public static void main(String[] args) {
        DellInspiron obj=new DellInspiron();
        obj.getSpecifications();
        obj.totalPriceInspiron();
    }
}
