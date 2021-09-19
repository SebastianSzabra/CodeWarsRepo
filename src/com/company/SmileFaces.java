package com.company;

import java.util.*;

/**
 * Given an array (arr) as an argument complete
 * the function countSmileys that should return
 * the total number of smiling faces.
 */
public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        int count = 0;
        for (String string : arr
             ) {
            if(string.charAt(0)==':'||string.charAt(0) ==';'){
                if(string.length()==3) {
                    if (string.charAt(1) == '-' || string.charAt(1) == '~') {
                        if (string.charAt(2) == 'D' || string.charAt(2) == ')') {
                            count++;
                        }
                    }
                }
                else if (string.length()==2){
                    if (string.charAt(1)=='D'||string.charAt(1)==')'){
                        count++;
                    }
                }
            }
        }

        return count;
        }
}