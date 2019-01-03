package com.stackroute;
// using HashMap.
import java.util.HashMap;
        import java.util.Map;
        import java.util.Map.Entry;
        import java.util.*;
public class StringCount
{
    public static Map<String,Integer> count(String s) {

        String[] s1 = s.split("\\s+|-+|\\?+|,+|,+|\\s+|\\*|_+|@+");
        HashMap<String,Integer> wordCounts = new HashMap<String, Integer>(50, 10);

        for (int i = 0; i < s1.length; i++)
        {
            int count=0;

            for (int j = s1.length-1 ; j >= 0 ; j--)
            {
                if (s1[i].equals(s1[j]))
                {
                    count++;
                }
            }
            wordCounts.put(s1[i], count);
        }
        return wordCounts;

    }

}