/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 * @author jackdench
 * @email: jdench1989@gmail.com
 * @date: 6 Sep 2024
 * purpose: Using scanner to get user input
 */
public class QuestForUserInput {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        String yourName;
        String yourQuest;
        double velocityOfSwallow;
        
        // We can use scanners readline to assign a value to our strings because
        // it's return type is string
        
       System.out.println("What is your name?");
       yourName = inputReader.nextLine();
       
       System.out.println("What is your quest?");
       yourQuest = inputReader.nextLine();
       
       // When we get to our double data type, we can use Scanner's nextDouble method
       // or we can use the Double.parseDouble to convert the nextLine's String
       
       System.out.println("What is the airspeed velocity of an unladen swallow?");
       velocityOfSwallow = Double.parseDouble(inputReader.nextLine());
       
       System.out.println();
       
       System.out.println("How do you know " + velocityOfSwallow + " is correct, " + yourName + "?");
       System.out.println("You didn't even know if the swallow was African or European!");
       System.out.println("Maybe skip answering things about birds and instead go " + yourQuest + ".");
    }
}
