package com.company;

import java.util.Scanner;


public class rockpaperscissor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter your Move in caps (Rock,Paper & scissors)");
            String Mymove = sc.next();

             if (Mymove.equalsIgnoreCase("ROCK")){
                 System.out.println("Valid move");
             }
             else if( Mymove.equalsIgnoreCase("PAPER")){
                 System.out.println("Valid move ");
             }
             else if(Mymove.equalsIgnoreCase("SCISSORS")) {
                System.out.println("A Valid Move");
            }
            else {
                 System.out.println("An Invalid Move ");
             }
            int count = 0;
            int loss = 0;
            int rand = (int) (Math.random() * 3);
            String oppMove = "";
            if (rand == 0)
                oppMove = "ROCK";

            else if (rand == 1)
                oppMove = "PAPER";
            else
                oppMove = "SCISSORS";
            System.out.println("OPPONENT MOVE : " + oppMove);

            if (Mymove.equals(oppMove)) {
                System.out.println("Its a Tie");
            }
            else if (Mymove.equals("ROCK") && oppMove.equals("SCISSORS") || Mymove.equals("PAPER") && oppMove.equals("ROCK") || Mymove.equals("SCISSORS") && oppMove.equals("PAPER")) {
                System.out.println("YOU WIN ");
                count++;
            }
            else {
                System.out.println("YOU LOST");
                loss++;
            }

            if (count > loss) {
                System.out.println("You ARE a champion");
            } else
                System.out.println("YOU SUCK!!!!!XDXD");

        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////