/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 * @author jackdench
 * @email: jdench1989@gmail.com
 * @date: 20 Sep 2024
 * purpose: practice using do-while loops
 */
public class LazyTeenager {
    public static void main(String[] args) {
        Random rand = new Random();
        int attempts = 1;
        boolean roomClean = false;

        do {
            System.out.println("Clean your room!! (x" + attempts + ")");
            // Calculate the probability of cleaning the room
            int chance = rand.nextInt(100) + 1; // Generate a random number between 1 and 100
            if (chance <= attempts * 10) {
                roomClean = true;
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                break;
            }
            
            attempts++;
            
            if (attempts > 7) {
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
        } while (!roomClean);
    }
}