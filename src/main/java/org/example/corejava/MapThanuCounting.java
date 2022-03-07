package org.example.corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapThanuCounting {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(40);

        Map<Integer,Integer> result = new HashMap<>();
        //10, 1
        //20 , 1
        //30 , 1
        //40 , 1
        for(int i=0;i<arrayList.size();i++){
            //40
            int input = arrayList.get(i);
            System.out.println("Input :::"+input);
            //20
            if(result.containsKey(input)){
                int temp = result.get(input);
                temp = temp+1;
                //2
                result.put(input,temp);
            }else{
                //20,1
                result.put(input,1);
            }
        }

        for(Map.Entry<Integer, Integer> integerListEntry:result.entrySet()){
            System.out.println("Key :::"+integerListEntry.getKey()+"::::: Value ::: "+integerListEntry.getValue());
        }

    }
}
