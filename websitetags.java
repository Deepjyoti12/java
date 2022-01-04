package com.company;

import java.util.Scanner;

public class websitetags {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the website url");
        String website=sc.next();
        if(website.endsWith(".org"))
        System.out.println("Organuzation Website");
        else if (website.endsWith(".com"))
            System.out.println("Commercial Website");
        else if(website.endsWith(".in"))
            System.out.println("Indian website");
        else
            System.out.println("Wrong input please put proper url");


    }

}
