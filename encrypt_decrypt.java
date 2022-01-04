package com.company;

import java.util.Scanner;
public class encrypt_decrypt {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        int a= 8;
        System.out.println("Enter the grade to be encrypted");
        char grade=sc.next().charAt(0);
        char encrypt = (char)(grade+a);
        System.out.println("The Encrypetd grade:"+ encrypt );
        //Decrypt
        char decrypt = (char)(encrypt-a);
        System.out.println("The decrypted grade: "+decrypt);
    }
}
