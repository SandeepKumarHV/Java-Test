package org.example.springs;

public class StudentInfo {
    private int rollNo;
    private String name;
    private Address address;

    public StudentInfo(){
        address = new Address();
        address.setArea("Valmiki Nagar");
        address.setHouseName("Shiva Sankalpa");
        address.setPincode(577522);
    }


    public StudentInfo(Address address){
        this.address=address;
    }


    public static void main(String[] args) {
        /*StudentInfo s1=new StudentInfo();*/

    }

}
