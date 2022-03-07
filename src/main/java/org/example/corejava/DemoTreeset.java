package org.example.corejava;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoTreeset {
    public static void main(String[] args) {
        TreeSet<Integer> test=new TreeSet<>();
        test.add(10);
        test.add(20);
        test.add(5);
        test.add(40);
        test.add(30);
        System.out.println("Ascending order");
        Iterator<Integer> iterator = test.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
        System.out.println("Descending order ");
        Iterator iterator1=test.descendingIterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
