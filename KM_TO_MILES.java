package com.company;
import java.util.Scanner;
public class KM_TO_MILES {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        double km = 0.0;
        System.out.println("Enter the distance in km to be converted to miles ");
        km=sc.nextDouble();
        double miles = km*0.621371;
        System.out.println("Miles:"+miles);
    }
}
