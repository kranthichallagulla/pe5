package com.stackroute;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class MapTest {
    Map map=new Map();
    @Test
    public void mapTest1(){
       String str= "one one___one-two,three,one@three*one?two";
        HashMap expected=new HashMap();
        expected.put("one",5);
        expected.put("two",2);
        expected.put("three",2);
        assertEquals(expected,map.count(str));

    }
}
