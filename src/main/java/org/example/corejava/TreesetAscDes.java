package org.example.corejava;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetAscDes {
    public static void main(String[] args) {
        TreeSet<Integer> test = new TreeSet<>();
        test.add(20);
        test.add(30);
        test.add(40);
        test.add(10);
        test.add(20);
        test.add(30);
        test.add(40);
        test.add(10);
        test.add(20);
        test.add(30);
        test.add(40);
        test.add(10);
        System.out.println("");
        Iterator<Integer> iterator = test.iterator();
        while (iterator.hasNext()){
            System.out.println("Elemenet is :::"+iterator.next());
        }



    }
}
