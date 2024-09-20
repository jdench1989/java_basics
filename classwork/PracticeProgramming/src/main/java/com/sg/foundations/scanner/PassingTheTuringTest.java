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
 * purpose: practising concatenation and scanner
 */
public class PassingTheTuringTest {
    public static void main(String[] args) {
        String userName;
        String myName = "Janice";
        String userFavColor;
        String myFavColor = "Sky blue";
        String userFavFood;
        String myFavFood = "Pineapple pizza";
        int userFavNumber;
        int myFavNumber = 128;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hi there! What's your name?");
        userName = scanner.nextLine();
        System.out.println("Hi, " + userName + "! I'm " + myName + "!");
        
        System.out.println("What is your favorite color?");
        userFavColor = scanner.nextLine();
        System.out.println("Huh, " + userFavColor + ". Mine is " + myFavColor + ".");
        
        System.out.println("I really like " + myFavFood + ". They're my favorite food.");
        System.out.println("What is your favorite food?");
        userFavFood = scanner.nextLine();
        System.out.println("Really?" + userFavFood + "? That's wild!");
        
        System.out.println("Speaking of favorites, What is your favourite number?");
        userFavNumber = Integer.parseInt(scanner.nextLine());
        System.out.println(userFavNumber + " is a cool number. Mine's " + myFavNumber + ".");
        System.out.println("Did you know that " + userFavNumber + " * " + myFavNumber + 
                " = " + (userFavNumber * myFavNumber) + ". That's a cool number too!");
        System.out.println("Well, thanks for talking to me " + userName + "! Bye!");
        
        
    }
}
