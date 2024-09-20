/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.variables;

/**
 * @author jackdench
 * @email: jdench1989@gmail.com
 * @date: 6 Sep 2024
 * purpose: practice combining variables and declaring multiple at once
 */
public class MoreBucketsMoreFun {
    public static void main(String[] args) {
        // Declare ALL THE THINGS
        // (Usually it's a good idea to declare them at the beginning of the program)
        int butterflies, beetles, bugs;
        
        // Now give a couple of them some values
        butterflies = 5;
        beetles = 9;
        
        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all.");
        System.out.println("Uh oh, my dog ate one.");
        butterflies --; // Unary decrement operator to show dog has eaten a bug
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        System.out.println("But there are still " + bugs + " bugs left ...");
        // Number of bugs is incorrect as variable 'bugs' was not reassigned after 
        // value of butterflies was decremented so 'bugs' retains original value
        // assigned on line 24
        System.out.println("Wait a minute!");
        System.out.println("... maybe the computer cant do maths afterall.");
        
    }
}
