package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class replace_function {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str= sc.nextLine();
        System.out.println("After replacing spaces with underscores\n"+str.replace(' ','_'));

    }
}
