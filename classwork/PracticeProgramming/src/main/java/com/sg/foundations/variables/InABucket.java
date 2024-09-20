/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.variables;

/**
 * @author jackdench
 * @email: jdench1989@gmail.com
 * @date: 6 Sep 2024
 * purpose: practice declaring variables, assigning a value and using them later
 */
public class InABucket {
    public static void main(String[] args) {
        // You can declare all kinds of variables
        String walrus;
        double piesEaten;
        float weightOfTeacupPig;
        int grainsOfSand;
        
        // But declaring them just sets up the space for data
        // to use the variable, you have to put data in it first
        walrus = "Sir Leroy Jenkins III";
        piesEaten = 42.1;
        System.out.println("Meet my pet walrus, " + walrus);
        System.out.print("He was a bit hungry today, and ate this many pies: ");
        System.out.println(piesEaten);
        
    }
}
