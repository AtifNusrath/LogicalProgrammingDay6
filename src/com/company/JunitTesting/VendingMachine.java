package com.company.JunitTesting;

import com.company.Utility.Utility;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int change=sc.nextInt();

        int notes[]={1000,500,100,50,10,2,1};
        int noteCount[]=new int[notes.length];
        Utility.returnNotes(noteCount,change,0);

        for(int i=0;i<notes.length;i++){
            if(noteCount[i]!=0)
                System.out.println(notes[i]+" Rs note= "+noteCount[i]);
        }

    }
}
