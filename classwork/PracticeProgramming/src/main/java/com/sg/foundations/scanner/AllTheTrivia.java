/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 * @author jackdench
 * @email: jdench1989@gmail.com
 * @date: 6 Sep 2024
 * purpose: A basic trivia program to practice using variables and comparisons
 */
public class AllTheTrivia {
    public static void main(String[] args) {
        // Declare variables and assign values for expected questions and answers
        String question1 = "What unit is equivalent to 1,024 Gigabytes?";
        String answer1 = "Terabyte";
        String question2 = "What planet is the only one that rotates clockwise in our solar system?";
        String answer2 = "Venus";
        String question3 = "The largest volcano ever discovered in the solar system is on which planet?";
        String answer3 = "Mars";
        String question4 = "What is the most abundant element in Earth's atmosphere?";
        String answer4 = "Nitrogen";
        
        // Instantiate scanner
        Scanner scanner = new Scanner(System.in);
        
        // Pose the questions to the user and collect their responses
        System.out.println(question1);
        String userAnswer1 = scanner.nextLine();
        
        System.out.println(question2);
        String userAnswer2 = scanner.nextLine();
        
        System.out.println(question3);
        String userAnswer3 = scanner.nextLine();
        
        System.out.println(question4);
        String userAnswer4 = scanner.nextLine();
        
        // compare userAnswers to answers and track the suers score
        int score = 0;
        
        System.out.println(question1);
        System.out.println("Your answer: " + userAnswer1);
        System.out.println("Correct answer: " + answer1);
        if (answer1.equals(userAnswer1)) {
            System.out.println("Correct!");
            score ++;
        } else {
            System.out.println("Incorrect");
        }
        
        System.out.println(question2);
        System.out.println("Your answer: " + userAnswer2);
        System.out.println("Correct answer: " + answer2);
        if (answer2.equals(userAnswer2)) {
            System.out.println("Correct!");
            score ++;
        } else {
            System.out.println("Incorrect");
        }
        
        System.out.println(question3);
        System.out.println("Your answer: " + userAnswer3);
        System.out.println("Correct answer: " + answer3);
        if (answer3.equals(userAnswer3)) {
            System.out.println("Correct!");
            score ++;
        } else {
            System.out.println("Incorrect");
        }
        
        System.out.println(question4);
        System.out.println("Your answer: " + userAnswer4);
        System.out.println("Correct answer: " + answer4);
        if (answer4.equals(userAnswer4)) {
            System.out.println("Correct!");
            score ++;
        } else {
            System.out.println("Incorrect");
        }
        
        // print user's score
        System.out.println("Total score: " + score + "/4");
    }
}
