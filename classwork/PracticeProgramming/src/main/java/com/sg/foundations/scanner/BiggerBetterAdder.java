/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 * @author jackdench
 * @email: jdench1989@gmail.com
 * @date: 9 Sep 2024
 * purpose: An improved version of the adder programming utilising Scanner for user input
 */
public class BiggerBetterAdder {
    public static void main(String[] args) {
        // declare variables
        int num1, num2, num3;
        int result;
        
        //instantiate Scanner
        Scanner scanner = new Scanner(System.in);
        
        // get user input and assign values to variables
        System.out.println("Enter the first number: ");
        num1 = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Enter the second number: ");
        num2 = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Enter the third number: ");
        num3 = Integer.parseInt(scanner.nextLine());
        
        result = num1 + num2 + num3;
        
        // print output
        System.out.println(num1 + "+" + num2 + "+" + num3 + "=" + result);
    }
}
