/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 * @author jackdench
 * @email: jdench1989@gmail.com
 * @date: 20 Sep 2024
 * purpose: A simple number guessing game using a randomly generated number. 
 */
public class GuessMe {
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int targetNumber = random.nextInt(201) - 100;
        int userGuess;
        int guessCount = 0;
        
        System.out.println("I'm thinking of a number between -100 and 100.");
        System.out.println("Can you guess what it is?");
        
        do{
            System.out.println("Enter your guess: ");
            userGuess = Integer.parseInt(scanner.nextLine());
            
            guessCount += 1;
            
            if (userGuess > targetNumber) {
                System.out.println("Nice try! Too high. Try again.");
            } else if (userGuess < targetNumber) {
                System.out.println("Unlucky! Too low. Have another try.");
            }
        } while (userGuess != targetNumber);
        
        System.out.println("Congratulations! You correctly guessed the number was " + targetNumber + "!");
        System.out.println("You guessed the correct number in " + guessCount + " guesses. Well done!");
    }
}
