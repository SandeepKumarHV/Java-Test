package org.example.oops;

public class HDFC implements iBanking{
    private int loan=100000;
    private int term=5;
    private int rateOfIntereset=10;

    @Override
    public int getLoanAmount() {
        System.out.println("Loan Amount is :::"+loan);
        return loan;
    }

    @Override
    public int getInterest() {
        int getInterest=(loan*term*rateOfIntereset)/100;
        System.out.println("Interest accumulated is :::"+getInterest);
        return getInterest;
    }

    @Override
    public int totalAmountToPay() {
        int total=loan+getInterest();
        System.out.println("Total Amount to be paid to Bank :::"+total);
        return total;
    }

    @Override
    public String getAddress() {
        String address="Jigani Bengaluru";
        System.out.println("Address of the given bank is :::"+address);
        return null;
    }

    public static void main(String[] args) {
        HDFC obj=new HDFC();
        obj.getLoanAmount();
        obj.getInterest();
        obj.totalAmountToPay();
        obj.getAddress();
    }
}
