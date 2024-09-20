/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.variables;

/**
 * @author jackdench
 * @email: jdench1989@gmail.com
 * @date: 6 Sep 2024
 * purpose: string concatenation exercise
 */
public class TheOrderOfThings {
    public static void main(String[] args) {
        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;
        
        number = 5.0;
        opinion = "awesome";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        color = "yellow";
        origin = "martian";
        material = "platinum";
        purpose = "good";
        
        noun = "dragons";
        
        // Using + with strings doesn;t add, it concatenates (stickes them together)
        
        System.out.println(number + " " + opinion + " " + size + " " + age + " " 
        + shape + " " + color + " " + origin + " " + material + " " + purpose 
        + " " + noun);
    }
}
