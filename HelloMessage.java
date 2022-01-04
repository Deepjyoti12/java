package com.company;
import java.util.Scanner;
public class HelloMessage {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String str=" ";
        System.out.println("Enter the Name of the person for this message ");
        str = sc.nextLine();
        System.out.println("HELLO "+str+" GOOD MORNING HAVE A GOOD DAY ");

    }

}
