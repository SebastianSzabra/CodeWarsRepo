package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.LongStream;

/**
 *
 * A task in which one should check whether the individual digits
 * of the number raised to the power
 * depending on its position are equal to the starting number
 *
 */
public class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> list =new ArrayList<>();
        long[] arr = LongStream.rangeClosed(a, b).toArray();
            for (Long number:arr){
                String temp =number.toString();
                if(powerChecker(temp)!=0){
                    list.add(powerChecker(temp));
                }
            }
        return list;
        }

    /**
     *
     * Method for checking if digits power are equal to an number
     *
     */

public static long powerChecker(String s){
       long res=0;
        int count=s.length();
        long orginal =Long.parseLong(s);
        switch (count){
            case 1:
                res=orginal;
                break;
            case 2:
                if (orginal==(Math.pow(Long.parseLong(String.valueOf(s.charAt(0))),1)
                             +Math.pow(Long.parseLong(String.valueOf(s.charAt(1))),2))){
                    res =orginal;
                }
                break;
            case 3:
                if (orginal==(Math.pow(Long.parseLong(String.valueOf(s.charAt(0))),1)
                             +Math.pow(Long.parseLong(String.valueOf(s.charAt(1))),2)
                             +Math.pow(Long.parseLong(String.valueOf(s.charAt(2))),3))){
                     res =orginal;
                }
                break;
            case 4:
                if (orginal==(Math.pow(Long.parseLong(String.valueOf(s.charAt(0))),1)
                              +Math.pow(Long.parseLong(String.valueOf(s.charAt(1))),2)
                              +Math.pow(Long.parseLong(String.valueOf(s.charAt(2))),3))
                              +Math.pow(Long.parseLong(String.valueOf(s.charAt(3))),4)){
                    res =orginal;
                }
                break;

        }


    return res;
}
    }
