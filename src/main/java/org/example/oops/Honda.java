package org.example.oops;

public class Honda extends Bike{
    @Override
    String color() {
        String color="Blue";
        return color;
    }

    @Override
    String model() {
        String model="2017";
        return model;
    }

    @Override
    void calculateSpeed() {
        int speed=100;
    }

    @Override
    int calculateOverAllSize() {
        int size=70;
        return size;
    }

    @Override
    int showExShowRoomPrice() {
        int price=70000;
        return price;
    }

    @Override
    int getMileage() {
        int mileage=60;
        return mileage;
    }

    public static void main(String[] args) {
        //Bike hondaObj=new Honda();
        //What we call this and why
        System.out.println("Specifications of Bike");
        String color="Blue";
        String model="2017";
        int speed=100;
        int size=70;
        int price=70000;
        int mileage=60;
        System.out.println(color);
        System.out.println(model);
        System.out.println(speed);
        System.out.println(size);
        System.out.println(price);
        System.out.println(mileage);
    }
}
