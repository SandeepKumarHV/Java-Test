package org.example.corejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class DemoArrayList {

    public void iterateTheArrays(){
        ArrayList<Integer> test = new ArrayList<>();
        test.add(10);
        test.add(20);
        test.add(30);
        test.add(30);
        test.add(20);
        test.add(10);
        Iterator<Integer> i = test.iterator();
        while (i.hasNext()) {
            System.out.println("hashset" + i.next());
        }
        HashSet<Integer> test1 = new HashSet<>(test);
        for (Integer value : test1) {
            System.out.println("array of I is   " + value);
        }
    }
    public void Arrays(){
        ArrayList<Integer> test = new ArrayList<>();
        test.add(10);
        test.add(20);
        test.add(30);
        test.add(30);
        test.add(20);
        test.add(10);
        Iterator<Integer> i = test.iterator();
        while (i.hasNext()) {
            System.out.println("hashset" + i.next());
        }
        HashSet<Integer> test1 = new HashSet<>(test);
        for (Integer value : test1) {
            System.out.println("array of I is " + value);
        }
    }
    public static void main(String[] args) {

    }
}
