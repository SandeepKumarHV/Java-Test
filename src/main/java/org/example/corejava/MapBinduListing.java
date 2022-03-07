package org.example.corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapBinduListing {
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

        //Iterate
        //10 , {10,10,10,10,10,10}
        //20, {20,20,20}
        //30, {30,30,30}


        Map<Integer, List<Integer>> results = new HashMap<>();
        // 10 , {10,10,10,10,10,10}
        //20, {20,20,20}
        //30, {30,30,30}

        List<Integer> integerList;

        for(int i=0;i<arrayList.size();i++){
            //10,20
            int input = arrayList.get(i);
            System.out.println("Values:::"+input);
            //20
            if(results.containsKey(input)){
                //taken value by sending key
                integerList = results.get(input);
                //10, {10}
                //{10}
                integerList.add(input);
                //{10,10}
                results.put(input,integerList);

            }else{
                integerList = new ArrayList<>();
                //empty arrayList
                integerList.add(input);
                //one time 20 added
                results.put(input,integerList);
            }
            //1st iteration , 10, {10}
            //
        }

        for(Map.Entry<Integer,List<Integer>> integerListEntry:results.entrySet()){
            System.out.println("Key :::"+integerListEntry.getKey()+"::::: Value ::: "+integerListEntry.getValue().toString());
        }


    }
}
