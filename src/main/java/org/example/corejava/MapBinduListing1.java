package org.example.corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapBinduListing1 {
    public static void main(String[] args) {

        String str;
        str = "I like java and I don't like java";
        Map<String, Integer> result = new HashMap<>();
        List<String> stringList;
        String[] array = str.split("");
        System.out.println(str);
        for (String word : array) {
            System.out.println(word);
            if (result.containsKey(word)) {
                int temp = result.get(word);
                temp= temp+1;
                result.put(word, temp);
            } else {
                stringList = new ArrayList<>();
                stringList.add((word));
                result.put(word,1);
            }
        }
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry);

        }
    }
}
