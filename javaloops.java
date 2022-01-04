package com.company;
import java.util.Scanner;
public class javaloops {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int s;
        int N = sc.nextInt();
        for (i = 1; i <= 10; i++) {
            s = N * i;

            System.out.println(" " + N +"X"+" " +  i+"=" + s);
        }
    }
}

