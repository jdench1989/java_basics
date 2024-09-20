/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.flowcontrol.fors;

/**
 * @author jackdench
 * @email: jdench1989@gmail.com
 * @date: 20 Sep 2024
 * purpose: practice for loops
 */
public class ForAndTwentyBlackbirds {
    public static void main(String[] args) {
        int birdsInPie = 0;
        for (int i=1; i < 25; i++) {
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }
        System.out.println("There are " + birdsInPie + " birds in the pie!");
        System.out.println("Quite the pie full!");
    }
}
