package com.company;

import java.util.Scanner;

public class CouponNumber {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();

        int randomCount=1,randomNo,flag=0,index=1;
        int a[]=new int[n];
        a[0]= (int)(n*Math.random());
        for(int i=0;index<n;i++)
        {
            randomNo=(int)(Math.random()*n);
            randomCount++;
            for(int j=0;j<index;j++)
            {
                if(a[j]==randomNo)
                {
                    flag=1;
                }
            }
            if(flag==0)
            {
                a[index]=randomNo;
                index++;
            }
            flag=0;
        }
        System.out.println(randomCount);
        for(int i:a){
            System.out.println(i);
        }
    }
}
