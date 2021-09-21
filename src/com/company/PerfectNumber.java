package com.company;
import java.util.*;

public class PerfectNumber {

      static long isPerfect(long num)
        {
            long sum=0;
            for(int i=1; i <= num/2; i++)
            {
                if(num % i == 0)
                {
                    sum=sum + i;
                }
            }
            return sum;
        }
        public static void main(String args[])
        {
            long number, s;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number: ");
            number=sc.nextLong();
            s = isPerfect(number);

            if(s==number)
                System.out.println(number+" is a perfect number");
            else
                System.out.println(number+" is not a perfect number");
        }


    }



