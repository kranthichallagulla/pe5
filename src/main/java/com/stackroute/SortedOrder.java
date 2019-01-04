package com.stackroute;
import java.lang.String;
import java.util.*;

public class SortedOrder {
    public ArrayList<String> sorted(String[] str) {
        TreeSet<String> treeSet = new TreeSet<String>();

        for (String s : str) {
            treeSet.add(s);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(treeSet);
        System.out.println(arrayList);
        return arrayList;
    }

}