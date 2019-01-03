package com.stackroute;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import static org.junit.Assert.*;
import java.lang.String;

import static org.junit.Assert.assertArrayEquals;
public class UpdateListTest {
    List<String> list=new ArrayList<>();
    UpdateList updateList=new UpdateList();
    @Test
    public void arrayTest(){
        list.add(0,"Apple");
        list.add(1,"Grape");
        list.add(2,"Melon");
        list.add(3,"Berry");
        List<String> expected=new ArrayList<>();
        expected.add("Apple");
        expected.add("Grape");
        expected.add("Melon");
        expected.add("Berry");

        //assertEquals("","Apple",list.get(0));

        assertEquals(expected,updateList.array(list));

        // assertEquals("Apple",list);
        //    assertEquals("Melon",updateList.array());
        //    assertEquals("Berry",updateList.array());


    }
    @Test
    public void update()
    {
        ArrayList<String> actual= new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape", "Melon","Berry"}));
        List<String>expected=new ArrayList<>();
        assertEquals(expected,updateList.updateArray(actual));
    }
/*   @Test
   public void Update(){

       assertEquals(Arrays.asList("Kiwi", "Grape", "Mango","Berry"), list.updateArray());
   }
*/


}