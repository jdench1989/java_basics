/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 * @author jackdench
 * @email: jdench1989@gmail.com
 * @date: 19 Sep 2024
 * purpose: A mini version of the popular text based game Zork.
 */
public class MiniZork {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("with a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("Go to the house, or open the mailbox?");
        
        String action = userInput.nextLine();
        
        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in?");
            
            action = userInput.nextLine();
            
            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really dark. So...so very dark.");
                System.out.println("Run away or keep looking?");
                
                action = userInput.nextLine();
                
                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you are alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) {
                System.out.println("You reach inside the mailbox an dfind something hard.");
                System.out.println("It's a giant diamond! Great! Now you're rich!");
            }
        } else if (action.equals("go to the house")) {
            System.out.println("You approach the house.");
            System.out.println("As you get closer, the house slowly fades away. ");
            System.out.println("The house has disappeared!");
        }
    }
}
