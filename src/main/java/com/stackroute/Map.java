package com.stackroute;
import java.util.HashMap;
import java.lang.String;
import java.lang.Integer;

public class Map {

    HashMap<String,Integer> map=new HashMap<String,Integer>();
    public HashMap<String, Integer> count(String st) {

        String[] array = st.split("\\s+|-+|\\?+|,+|\\*|_+|@+|___+");
        HashMap<String, Integer> mp = new HashMap<String, Integer>();
        int count;

        for (int i = 0; i < array.length; i++) {
        count=0;

            for (int j = array.length-1; j >=0; j--) {
                if (array[i].equals(array[j])) {
                    count++;

                }

            }
            mp.put(array[i],count);

        }

     //   System.out.println(mp);
        return mp;

    }
}