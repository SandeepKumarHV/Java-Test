package org.example.oops;

public class ICICI implements iBanking{
    private int getLoanAmount=100000;
    private int term=5;
    private int rateOfIntereset=11;

    @Override
    public int getLoanAmount() {
        System.out.println("Loan Amount is :::"+getLoanAmount);
        return getLoanAmount;
    }

    @Override
    public int getInterest() {
        int getInterest=(getLoanAmount*term*rateOfIntereset)/100;
        System.out.println("Interest accumulated is :::"+getInterest);
        return getInterest;
    }

    @Override
    public int totalAmountToPay() {
        int total=getLoanAmount+getInterest();
        System.out.println("Total Amount to be paid to Bank :::"+total);
        return total;
    }

    @Override
    public String getAddress() {
        String address="Shanthi Nagar Challakere";
        System.out.println("Address of the given bank is :::"+address);
        return null;
    }
    public static void main(String[] args) {
        ICICI obj=new ICICI();
        obj.getLoanAmount();
        obj.getInterest();
        obj.totalAmountToPay();
        obj.getAddress();
    }
}
