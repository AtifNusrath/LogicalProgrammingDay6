package com.company.JunitTesting;

import com.company.Utility.Utility;

public class DayofWeek {


    public static void main(String args[]) {

        int month=Integer.parseInt(args[0]);
        int day=Integer.parseInt(args[1]);
        int year=Integer.parseInt(args[2]);

        System.out.println(Utility.dayOfWeek(day, month, year));

    }
    }
