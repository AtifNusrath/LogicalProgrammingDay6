package com.company.JunitTesting;
import com.company.Utility.Utility;

public class TemperatureConversion {
    public static void main(String args[]){
        float temperature=Integer.parseInt(args[0]);
        char currentUnit=args[1].charAt(0);
        System.out.println(Utility.convertTemperature(temperature, currentUnit));

    }
}
