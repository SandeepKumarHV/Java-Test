package org.example.corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DemoConcurrentHashmap {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

       Map<Integer, List<Integer>> results = new ConcurrentHashMap<>();
        List<Integer> integerList;

        for(int i=0; i< arrayList.size(); i++){
            int input = arrayList.get(i);
            System.out.println("Values  "+input);

            if(results.containsKey(input)){
                integerList = results.get(input);
                integerList.add(input);
                results.put(input,integerList);

            }else{
                integerList = new ArrayList<>();
                integerList.add(input);
                results.put(input,integerList);
            }
        }

        for(Map.Entry<Integer,List<Integer>> integerListEntry:results.entrySet()){
            System.out.println("Key "+integerListEntry.getKey()+" Value "+integerListEntry.getValue().toString());
            if(integerListEntry.getKey()==10){
                results.remove(integerListEntry.getKey());
            }
        }
        System.out.println(results);
        System.out.println("After modification ");

        for(Map.Entry<Integer,List<Integer>> integerListEntry:results.entrySet()) {
            System.out.println("Key " + integerListEntry.getKey() + " Value " + integerListEntry.getValue().toString());
        }
    }
}
