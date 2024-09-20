/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 * @author jackdench
 * @email: jdench1989@gmail.com
 * @date: 20 Sep 2024
 * purpose: Simulated random coin flip, without using .nextInt()
 */
public class CoinFlipper {
    public static void main(String[] args) {
        
        System.out.println("Ready, set, Flip...!!");
        
        Random flipper = new Random();
        
        boolean result = flipper.nextBoolean();
        
        if (result == true) {
            System.out.println("You got HEADS!");
        } else {
            System.out.println("You got TAILS!");
        }
    }
}
