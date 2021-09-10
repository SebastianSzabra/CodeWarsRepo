package com.company;

import java.math.BigInteger;
public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        int b = n.intValue();
        BigInteger n1,n2,n3;

        n1= BigInteger.valueOf(0);
        n2= BigInteger.valueOf(1);
        BigInteger sum = n1.add(n2);

        for(int i=0;i < b;i++)
        {
            n3=n1.add(n2);
            n1=n2;
            n2=n3;
            sum =sum.add(n3);
        }
        return (sum.multiply(BigInteger.valueOf(4)));
    }}