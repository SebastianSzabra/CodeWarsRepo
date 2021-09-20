package com.company;

public class Line {
    public static String Tickets(int[] peopleInLine) {
        int deposit= 0;
        for (int cash : peopleInLine) {
           if (cash>25){
               deposit = deposit +25 -cash;
           }
           else if (cash==25){
               deposit = deposit+cash;
           }
        }
        if (deposit>=0){
            return "YES";
        }
        else {
            return  "NO";
        }
    }
}