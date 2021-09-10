package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;




public class Solution1 {
    public static String whoLikesIt(String... names) {
        String resolution="";
        int count =names.length;
            if (count ==0){resolution= "no one likes this";}
            else if(count==1){resolution= names[0]+" likes this";}
            else if (count==2){ resolution=names[0]+" and "+names[1]+" like this";}
            else if (count==3){resolution=names[0]+", "+names[1]+" and "+names[2]+" like this";}
            else if (count>=4){resolution=names[0]+", "+names[1]+" and "+(count-2)+" others like this";}




                return resolution ;
    }}

