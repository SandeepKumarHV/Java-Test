package org.example.oops;

public class CustomException extends Exception {
    private int speed;

    public CustomException(int speed) {
        System.out.printf("Car speed reaches Exception "+speed);
        this.speed=speed;
    }
}
