package org.example.corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListingOddEvenMap {
    private  static String even="Even";
    private  static String odd="Odd";
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(8);
        System.out.println(arrayList);
        
        Map<String, List<Integer>> results = new HashMap<>();

        List<Integer> integerList;

        for(int i=0;i<arrayList.size();i++){
            int input = arrayList.get(i);
            System.out.println("Values:::"+input);
            if(input%2==0){
                if(results.containsKey(even)){
                     integerList =results.get(even);
                     integerList.add(input);
                     results.put(even,integerList);
                }
                else{
                      integerList =new ArrayList<>();
                      integerList.add(input);
                      results.put(even,integerList);
                }
               


            }else{
                   if(results.containsKey(odd)){
                        integerList =results.get(odd);
                        integerList.add(input);
                        results.put(odd,integerList);
                   }
                   else{
                         integerList =new ArrayList<>();   
                         integerList.add(input);
                         results.put(odd,integerList);
                   }
            }
        }

        for(Map.Entry<String,List<Integer>> integerListEntry:results.entrySet()){
            System.out.println("Key :::"+integerListEntry.getKey()+"::::: Value ::: "+integerListEntry.getValue().toString());
        }
    }
}
