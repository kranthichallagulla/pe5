
package com.stackroute;

import java.util.HashMap;
import java.util.Map;

public class Occurence {
    public Map<String,Boolean> stringOccurence(String[] s) {
        HashMap<String, Boolean> wordCounts = new HashMap<String,Boolean>();
        int count;

            for (int i = 0; i < s.length; i++)
            {
                count = 0;
                for (int j = s.length-1; j >= 0; j--)
                {
                    if (s[i].equals(s[j]))
                    {
                        count++;
                    }
                    if (count >= 2) {
                        wordCounts.put(s[i], true);
                    }
                    else
                    {
                        wordCounts.put(s[i], false);
                    }

                }

            }
        return wordCounts;
    }
}
