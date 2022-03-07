package org.example.corejava;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashsetAndLinkedHashsetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> test = new LinkedHashSet<>();
        test.add(30);
        test.add(10);
        test.add(40);
        test.add(20);
        test.add(30);
        test.add(10);
        test.add(40);
        test.add(20);
        System.out.println("Elements are ");
        Iterator<Integer> iterator = test.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
