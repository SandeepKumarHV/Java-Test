package org.example.corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchMap {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Bindushree");
        studentMap.put(2, "Sandeep");
        studentMap.put(3, "Thanushree");
        //String string ="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Search String");
        String SearchString = scanner.next();
        for (Map.Entry<Integer, String> testMap : studentMap.entrySet()) {
            if (testMap.getValue().equals(SearchString)) {
                System.out.println("The string is equal   " + SearchString);
            }
        }
    }
    //Sandeep,Sandeep
    //Sandeep,Sandeep Kumar
}
