package org.example.corejava;

import java.util.HashSet;
import java.util.Iterator;

public class UniqueListExample {
    public static void main(String[] args) {
        HashSet<Integer> test = new HashSet<>();
        test.add(30);
        test.add(20);
        test.add(40);
        test.add(10);
        test.add(30);
        test.add(20);
        test.add(40);
        test.add(10);
        System.out.println("Elements are ");
        Iterator<Integer> iterator = test.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
