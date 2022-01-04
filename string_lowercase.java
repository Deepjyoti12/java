package com.company;
import java.util.Locale;
import java.util.Scanner;
public class string_lowercase {
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String to convert it into lowercase");
        String s = sc.nextLine();
        System.out.println("The Converted String becomes:\n"+s.toLowerCase());
    }
}
