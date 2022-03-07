package org.example.corejava;

import java.util.HashMap;
import java.util.Map;

public class DemoHashmap {
    public static void main(String[] args) {
        Map<Integer,String> studentMap = new HashMap<>();
        studentMap.put(56,"BinduShree");
        studentMap.put(57,"Sandeep");
        studentMap.put(58,"ThanuShree");
        //Duplicate key added
        studentMap.put(56,"Praveen");
        //EntrySet having both key value pairs
        for(Map.Entry<Integer,String> testMap:studentMap.entrySet()){
            System.out.println("Key ::::"+testMap.getKey()+"::::: Value :::::"+testMap.getValue());
        }
    }
}
