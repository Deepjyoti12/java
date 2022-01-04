//Write a program to convert from marks to percentage
package com.company;
import java .util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("Welcome To CBSE Results 2021");
        System.out.println("Enter Your Marks in English");
        float eng = sc.nextFloat();
        System.out.println("Enter Your Marks in Physics ");
        float phy = sc.nextFloat();
        System.out.println("Enter Your Marks IN Chemistry");
        float chem = sc.nextFloat();;
        System.out.println("Enter YOUR Marks in Mathematics ");
        float maths = sc.nextFloat();
        System.out.println("Enter Your Marks in Biology");
        float bio= sc.nextFloat();
        float sum = eng+phy+chem+maths+bio;
        System.out.println("Marks Obtained :"+sum);
        float percent = sum*0.2f;
        System.out.println("Percentage:"+percent);
        float cgpa = percent/9.5f;
        System.out.println("Cumulative Graded Percentage Assesment:"+cgpa);
    }

}
