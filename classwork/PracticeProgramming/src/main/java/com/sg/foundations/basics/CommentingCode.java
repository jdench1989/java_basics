/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.basics;

/**
 * @author jackdench
 * email: jdench1989@gmail.com
 * date: 06/09/2024
 * purpose: practice using different types of comments
 */
public class CommentingCode {
    public static void main(String[] args) {
        // Comments are written to explain code in easily understandable way
        // For single lines anything after '//' is considered a comment
        
        System.out.println("Normal code is compiled and runs ..");
        System.out.println("Comments however .."); // do not execute!
        
        // Comments can be on their own line
        System.out.println("..."); // or they cna share like this
        
        // However, if you put the '//' before a line of code...
        // System.out.println("then it is considered a comment");
        // System.out.println("and will not execute");
        
        /*
        This is an example of a multi-line comment, which is sueful if you want
        to comment out multiple lines of code quickly.
        Console.writeLine("Java ignores everything inside the comment markers.");
        */
    }
}
