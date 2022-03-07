package org.example.demoprograms;

public class Constructor {
    private double length;
    private double breadth;
    public Constructor(double lh, double bh){
        length=lh;
        breadth=bh;
    }
    public void displayAreaOfRect(){
        System.out.println("Length value is:::" +length+ "Breadt value is:::" +breadth);
        double area=length*breadth;
        System.out.println("Area of Rectangle is"+area);
    }

    public static void main(String[] args) {
        Constructor constructor=new Constructor(10,20);
        constructor.displayAreaOfRect();
    }
}
