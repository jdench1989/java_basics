/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 * @author jackdench
 * @email: jdench1989@gmail.com
 * @date: 20 Sep 2024
 * purpose: Traditional FizzBuzz program using Java
 */
public class FizzBuzz {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int userInput;
        int fizzBuzzCount = 0;
        
        System.out.println("How many units of fizzing and buzzing do you need?");
        
        userInput = Integer.parseInt(scanner.nextLine());
        
        for (int i=0; fizzBuzzCount < userInput; i++) {
            if (i == 0) {
                System.out.println(i);
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
                fizzBuzzCount++;
            } else if (i % 3 == 0) {
                System.out.println("fizz");
                fizzBuzzCount++;
            } else if (i % 5 == 0) {
                System.out.println("buzz");
                fizzBuzzCount++;
            } else {
                System.out.println(i);
            }
        }
        
        System.out.println("TRADITION!");
    }
}
