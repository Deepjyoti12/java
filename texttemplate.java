package com.company;
//import java.util.Scanner;
public class texttemplate {
    public static void main(String args[]){
       // Scanner sc = new Scanner(System.in);
       // System.out.println("Enter a String ");
       // String str = sc.nextLine();
        String string = "Dear <|Name|>,Thank a LOT";
        string = string.replace("<|Name|>","Deepjyoti");

        System.out.println(" "+string);

    }
}
