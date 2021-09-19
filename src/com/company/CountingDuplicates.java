package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        List list = new ArrayList();
        text = text.toLowerCase();
       for(int x=0;x<text.length();x++){
           list.add(text.charAt(x));
       }
        System.out.println(list);
      int count = (int) list.stream()
              .filter(i->Collections
              .frequency(list,i)>1)
              .distinct().count();
        return count;
    }
}