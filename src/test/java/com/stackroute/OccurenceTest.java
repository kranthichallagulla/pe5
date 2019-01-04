package com.stackroute;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;
public class OccurenceTest {

    @Test
    public void test()
    {
        Occurence occurence = new Occurence();
        HashMap<String,Boolean> map = new HashMap<String,Boolean>();
        map.put("a",true);
        map.put("b",false);
        map.put("c",true);
        map.put("d",false);
        assertEquals(map,occurence.stringOccurence(new String[]{"a","b","c","d","a","c","c"}));

    }


    @Test
    public void fail()
    {
        Occurence occurence = new Occurence();
        HashMap<String,Boolean> map = new HashMap<String,Boolean>();
        map.put("a",false);
        map.put("b",true);
        map.put("c",true);
        map.put("d",false);
        assertNotEquals(map,occurence.stringOccurence(new String[]{"a","b","c","d","a","c","c"}));

    }
}
