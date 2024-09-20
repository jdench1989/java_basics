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
 * purpose: 
 */
public class DontForgetToStoreIt {
    public static void main(String[] args) {
        int meaningOfLifeAndEverything;
        double pi;
        String cheese, color;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Give me pi to at least 5 decimals: ");
        pi = Double.parseDouble(inputReader.nextLine());
        
        // We've used Double.parseDouble but meaningOfLifeAndEverything is an INT
        // so we'll have to use Integer.parseInt
        System.out.println("What is the meaining of life, the universe and everything?");
        meaningOfLifeAndEverything = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("What is your favourite kind of cheese?");
        cheese = inputReader.nextLine();
        
        System.out.println("Do you like the color red or blue most?");
        color = inputReader.nextLine();
        
        System.out.println("Ooh, " + color + " " + cheese + " sounds delicious!");
        
        System.out.println("The circumference of life is " + (2 * pi * meaningOfLifeAndEverything));
        
    }
}
