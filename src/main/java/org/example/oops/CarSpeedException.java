package org.example.oops;

public class CarSpeedException {

    public static void carSpeed(int speed) throws CustomException {
        if(speed>=120){
            throw  new CustomException(speed);
        }else{
            System.out.printf("Car speed is Normal "+speed);
        }
    }

    public static void main(String[] args) throws CustomException {
        carSpeed(150);
    }
}
