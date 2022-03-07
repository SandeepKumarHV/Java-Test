package org.example.corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchStringMap {
    public static void main(String[] args) {
        Map<String, String> studentMap = new HashMap<>();
        studentMap.put("Bindu", "Bindushree");
        studentMap.put("Sandeep", "Sandeep");
        studentMap.put("Thanu", "Thanushree");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Search String");
        String SearchString = scanner.next();
        for (Map.Entry<String, String> testMap : studentMap.entrySet()) {
            if (testMap.getValue().equals(SearchString)) {
                System.out.println("The string is equal   " + SearchString);
                if(SearchString == SearchString){
                    System.out.println(SearchString+"Kumar");
                    String key= testMap.getKey();
                    String value= testMap.getValue();
                    value=value+"kumar";
                    studentMap.put(key,value);
                }
            }
        }
        for (Map.Entry<String, String> testMap : studentMap.entrySet()) {
            System.out.println("Key:::"+testMap.getKey()+"   Value:::" +testMap.getValue());
        }
    }
}
