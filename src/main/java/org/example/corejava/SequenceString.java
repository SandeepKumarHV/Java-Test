package org.example.corejava;

import java.util.HashMap;
import java.util.Map;

public class SequenceString {
    public static void main(String[] args) {

        String str = "I like java and I don't like java";
        Map<String,Integer> result = new HashMap<>();
        String[] array = str.split(" ");
        System.out.println(str);
        for(String word : array){
            Integer integer = result.get(word);
            if(integer==null){
                result.put(word,1);

            }
            else {
                result.put(word,integer + 1);
            }
        }

        for(Map.Entry<String,Integer> entry:result.entrySet()) {
            System.out.println(entry);
        }
    }
}
