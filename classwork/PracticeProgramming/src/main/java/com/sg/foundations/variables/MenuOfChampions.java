/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.variables;

/**
 * @author jackdench
 * @email: jdench1989@gmail.com
 * @date: 6 Sep 2024
 * purpose: practice using variables and outputting to console
 */
public class MenuOfChampions {
    public static void main(String[] args) {
        String menuItem1Name, menuItem2Name, menuItem3Name;
        double menuItem1Price, menuItem2Price, menuItem3Price;
    
        menuItem1Name = "Slice of Big Rocco Pizza";
        menuItem1Price = 500.00;
        
        menuItem2Name = "Invisible Strawberry Pie";
        menuItem2Price = 2.00;
        
        menuItem3Name = "Denver Omelette";
        menuItem3Price = 1.50;
        
        System.out.println("Welcome to the restaurant!");
        System.out.println("Today's menu is...");
        System.out.println("$" + menuItem1Price + " " + menuItem1Name);
        System.out.println("$" + menuItem2Price + " " + menuItem2Name);
        System.out.println("$" + menuItem3Price + " " + menuItem3Name);
    }
}
