package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**Given two arrays of strings a1 and a2
 * return a sorted array r in lexicographical order of
 * the strings of a1 which are substrings of strings of a2.
 * **/



public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        List list = new ArrayList();

        for (String template:array1
             ) {
            for (String word:array2
                 ) {
                if(word.contains(template))
                {
                    if(!list.contains(template))
                    {
                    list.add(template);
                     }
                }


            }

        }
        String[] res  =new String[list.size()];
        list.toArray(res);
        Arrays.sort(res);
        return res;
    }
}

