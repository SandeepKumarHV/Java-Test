package org.example.corejava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class DemoHashset {
    public static void main(String[] args) {
        HashSet<String> set =new HashSet();
        set.add("Sandeep");
        set.add("Kumar");
        set.add("Java");
        set.add("Sandeep");
        Iterator<String> i=set.iterator();
        while (i.hasNext()){
            System.out.println("hashset"+i.next());
        }
        LinkedHashSet<String> setnew =new LinkedHashSet<>();
        setnew.add("Sandeep");
        setnew.add("Kumar");
        setnew.add("Java");
        setnew.add("Sandeep");
        Iterator<String> n=setnew.iterator();
        while (n.hasNext()){
            System.out.println("linked hastset "+n.next());
        }
    }
}
