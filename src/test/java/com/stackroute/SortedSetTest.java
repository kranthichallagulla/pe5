package com.stackroute;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import static org.junit.Assert.*;


public class SortedSetTest {
    SortedOrder sortedOrder=new SortedOrder();
    @Test
    public void sortedOrderOne(){
        String[] s={"Harry","Olive","Alice","Bluto","Eugene"};
        TreeSet expected=new TreeSet();
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");
        assertEquals(expected,sortedOrder.sorted(s));

    }

}