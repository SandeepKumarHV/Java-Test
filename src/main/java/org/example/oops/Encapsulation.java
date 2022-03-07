package org.example.oops;

public class Encapsulation {
    private String enEmployeeName;
    private int enEmployeeId;
    private int enEmployeeLocation;
    private int enEmployeeContactNumber;

    public String getEnEmployeeName() {
        return enEmployeeName;
    }

    public void setEnEmployeeName(String enEmployeeName) {
        this.enEmployeeName = enEmployeeName;
    }

    public int getEnEmployeeId() {
        return enEmployeeId;
    }

    public void setEnEmployeeId(int enEmployeeId) {
        this.enEmployeeId = enEmployeeId;
    }

    public int getEnEmployeeLocation() {
        return enEmployeeLocation;
    }

    public void setEnEmployeeLocation(int enEmployeeLocation) {
        this.enEmployeeLocation = enEmployeeLocation;
    }

    public long getEnEmployeeContactNumber() {
        return enEmployeeContactNumber;
    }

    public void setEnEmployeeContactNumber(int enEmployeeContactNumber) {
        this.enEmployeeContactNumber = enEmployeeContactNumber;
    }

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setEnEmployeeName("Sandeep Kumar H V");
        encapsulation.setEnEmployeeId(51804061);
        encapsulation.setEnEmployeeLocation(577522);
        encapsulation.setEnEmployeeContactNumber(861831002);
        System.out.println("Name is ::::"+encapsulation.getEnEmployeeName());
        System.out.println("Id is ::::"+encapsulation.getEnEmployeeId());
        System.out.println("Location is ::::"+encapsulation.getEnEmployeeLocation());
        System.out.println("Contact Number ::::"+encapsulation.getEnEmployeeContactNumber());
    }

}
