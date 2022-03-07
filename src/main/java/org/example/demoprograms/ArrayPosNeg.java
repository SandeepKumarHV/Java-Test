package org.example.demoprograms;

public class ArrayPosNeg {
     private int[] arrays;
     private int MAX;
     public ArrayPosNeg(int arraySize){
         MAX=arraySize;
         arrays=new int[MAX];
         System.out.println("array size"+arrays.length);
     }
     public void inertArray(){
         for(int i=0;i< arrays.length-1;i++){
             System.out.println("added value"+(i*i)+"to the index"+i);
             arrays[i]=i*i;
         }
     }
     public void fetchValues(){
         for(int i=0;i< arrays.length-1;i++){
             if(i>=0){
                 System.out.println("Given number is postive"+i);
             }
             else{
                 System.out.println("Given number is negative"+i);
             }
         }
     }
     public static void initialArray(int [] array){
         int arrayLength= array.length;
         System.out.println("size of the array"+arrayLength);
     }

    public static void main(String[] args) {
        ArrayPosNeg arrayPosNeg=new ArrayPosNeg(5);
        arrayPosNeg.inertArray();
        arrayPosNeg.fetchValues();
    }
}
