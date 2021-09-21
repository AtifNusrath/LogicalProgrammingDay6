package com.company;

public class StopWatch {

    public static void stopwatchSimulator() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {

        }
        long stopTime = System.currentTimeMillis();
        long Time = stopTime - startTime;
        System.out.println("Total time required: " + Time);
    }
    public static void main(String args[]){
        stopwatchSimulator();
    }

}
