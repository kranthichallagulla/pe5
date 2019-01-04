package com.stackroute;

import java.util.ArrayList;
import java.util.List;


public class UpdateList {


      public List<String> add(List<String> list)

      {
      int i;
          System.out.println("Initial list");
         for (i = 0; i < list.size(); i++) {

             System.out.println(list.get(i));
            }

            return list;
        }

    public List<String> set(List<String> list)

    {
        int i;
        System.out.println("\n After updating");
        list.set(1,"Banana");
        for (i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }

        return list;
    }
    public List<String> remove(List<String> list)

    {
        int i;
       list.clear();
        System.out.println("After Removing");
        for (i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }

        return list;
    }


    }
