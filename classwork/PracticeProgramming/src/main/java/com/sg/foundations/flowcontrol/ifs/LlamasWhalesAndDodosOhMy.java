/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.flowcontrol.ifs;

/**
 * @author jackdench
 * @email: jdench1989@gmail.com
 * @date: 19 Sep 2024
 * purpose: Practice flow control with if statements
 */
public class LlamasWhalesAndDodosOhMy {
    public static void main(String[] args) {
        int llamas = 101;
        int whales = 15;
        int dodos = 0;
        
        if (dodos > 0) {
            System.out.println("I thought dodos were extinct!");
        }
        
        if (dodos < 0) {
            System.out.println("Hang on, how can we have negative dodos?");
        }
        
        if (llamas > whales) {
            System.out.println("Whales may be bigger, but llamas are better!");
        }
        
        if (llamas <= whales) {
            System.out.println("Brawn ove rbrains i guess. Whales beat llamas");
        }
        
        System.out.println("There's been an increase in dodos!");
        
        dodos += 100;
        
        if ((whales + llamas) < dodos) {
            System.out.println("I never thought I'd see the day when dodos ruled the earth.");
        }
        
        if (llamas > whales && llamas > dodos) {
            System.out.println("I don't know how, but the llamas have come out ahead!");
        }
    }
}
