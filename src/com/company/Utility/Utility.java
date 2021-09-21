package com.company.Utility;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;

public class Utility {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);




    public static int dayOfWeek(int day, int month, int year) {
        int m0, y0, d0, x;

        y0 = year - (14 - month) / month;
        x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        m0 = month + 12 * ((14 - month) / 12) - 2;
        d0 = (day + x + (31 * m0) / 12) % 7;
        return d0;
    }

    public static float convertTemperature(float temperature, char currentUnit) {
        float conversion = 0.0f;
        if (currentUnit == 'f' || currentUnit == 'F') {
            conversion = (temperature - 32) * ((float) 5 / 9);
        } else if (currentUnit == 'c' || currentUnit == 'C') {
            conversion = (temperature * ((float) 9 / 5)) + 32;
        }
        return conversion;
    }

    public static float monthlyPayment(float payment, float rate, float year) {
        float monthlyPay = 0.0f;
        int months = (int) (12 * year);
        float r = rate * ((float) rate / 12 * 100);
        monthlyPay = (float) ((payment * r) / (1 - Math.pow(1 + r, -months)));
        return monthlyPay;
    }

    public static double sqrt(int number) {
        double epslion = 1e-15;
        double t = number;

        while (Math.abs(t - number / t) > epslion * t) {
            t = (number / t + t) / 2;
        }
        return t;
    }

    public static String toBinary(int number) {
        int rem;
        String bin[] ={ "0", "1" };
        String binary = "";
        int padding = 0;
        while (number > 0 || padding % 8 != 0) {
            rem = number % 2;
            binary = bin[rem] + binary;
            number = number / 2;
            padding++;
            if (padding % 4 == 0 && number != 0) {
                binary = " " + binary;

            }
        }
        return binary;
    }

    public static String swappedNibbles(String binary) {
        binary = binary.replaceAll(" ", "");
        String lowerNibble = binary.substring(0, 4);
        String upperNibble = binary.substring(4, 8);
        String swappedBinary = upperNibble + lowerNibble;
        return swappedBinary;
    }

    public static boolean isPowerOfTwo(int number) {
        int power = 0;
        int division = number;
        while (division > 1) {
            division = division / 2;
            power++;
        }
        return number == (int) Math.pow(2, power);
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0, power = 0;
        binary = binary.replaceAll(" ", "");
        int index = binary.length() - 1;
        while (index >= 0) {
            decimal = (int) (Integer.parseInt(binary.charAt(index) + "") * Math.pow(2, power));
            power++;
            index--;
        }
        return decimal;

    }

    public static void returnNotes(int noteCounts[], int change, int pos) {
        int notes[] = { 1000, 500, 100, 50, 10, 2, 1 };
        if (pos < notes.length) {
            if (change < notes[pos]) {
                returnNotes(noteCounts, change, ++pos);
            } else {
                change = change - notes[pos];
                noteCounts[pos]++;
                returnNotes(noteCounts, change, pos);
            }
        }
    }


}

