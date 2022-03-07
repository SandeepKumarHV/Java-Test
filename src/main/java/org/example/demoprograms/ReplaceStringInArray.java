package org.example.demoprograms;

public class ReplaceStringInArray {
    private static int max;
    private static String array[];

    public static void main(String[] args) {
        String temp;
        String array1[]={"LAN","VAN","MAN"};
        for(int i=0;i<= array1.length-1;i++){
            for(int j=i;j<= array1.length-1;j++){
                if(array1[i].equals(array1[j])){
                    temp=array1[i];
                    String temp1=temp.replace('N','M');
                    array1[i]=temp1;
                    System.out.println("Sorted array "+array1[i]);
                }
            }
        }
    }
}
