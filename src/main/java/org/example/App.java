package org.example;
import java.text.DecimalFormat;
import java.util.*;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App 
{
    public static void main( String[] args )
    {
        DecimalFormat df = new DecimalFormat("###.##");
        Scanner input = new Scanner(System.in);
        double p, r, end;
        int t, n;
        System.out.println("What is the principal amount?");
        p = input.nextDouble();
        System.out.println("What is the rate?");
        r = input.nextDouble();
        System.out.println("What is the number of years?");
        t = input.nextInt();
        System.out.println("What is the number of times the interest is compounded per year?");
        n = input.nextInt();

        String rate = String.format("%.2f%%", r);
        r = r / 100.0;
        end = (1+r/n);
        end = Math.pow(end, (n*t));
        end = end * p;
        String principal = String.format("$" + df.format(p));
        String ends = String.format("$" + df.format(end));

        System.out.println(principal + " invested " + rate + " for " + t + " years compounded " + n + " times per years is " + ends + ".");

    }
}
