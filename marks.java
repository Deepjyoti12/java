package com.company;
import java.util.Scanner;
public class marks {
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks in Physics ");
        float phy = sc.nextFloat();
        System.out.println("Enter the marks in Chemistry");
        float chem = sc.nextFloat();
        System.out.println("Enter the marks in Computer applications ");
        float ca=sc.nextFloat();
        float total = phy+chem+ca;
        float percent ;
         percent = total*0.33f;
         if(phy>33&&chem>33&&ca>33){
             System.out.println("YOU HAVE BEEN PROMOTED ");
         }
         if(percent>=40){
             System.out.println("Pass");
         }
         else
             System.out.println("Fail");

    }
}
