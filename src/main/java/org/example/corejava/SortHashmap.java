package org.example.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SortHashmap {
    static HashMap<Integer, String> test = new HashMap<>();

    public static void sortMap()
    {
        ArrayList<String> sortValues = new ArrayList<String>(test.values());
        Collections.sort(sortValues);
        for (String Value : sortValues)
            System.out.println(Value);
    }

    public static void main(String args[])
    {
        test.put(1, "Thanushree");
        test.put(2, "Praveen");
        test.put(3, "Bindushree");
        test.put(4, "Sandeep");
        System.out.println(test);
        sortMap();

    }
}
