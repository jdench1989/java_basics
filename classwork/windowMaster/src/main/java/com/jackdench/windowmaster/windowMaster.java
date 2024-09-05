package com.jackdench.windowmaster;

import java.util.Scanner;

/**
 * @author jackdench
 * email: jdench1989@gmail.com
 * date: 28/08/2024
 * purpose: My first Hello World program in an IDE
 */
public class windowMaster {
    public static void main(String [] args) {
        // declare variables
        float height;
        float width;
        float areaCost;
        float perimeterCost;
        int numberOfWindows;
        
        // declare and initialise scanner
        Scanner myScanner = new Scanner(System.in);
        
        // get input from user and parse input to variables
        while (true) {
            try {
                System.out.println("Please enter the window height: ");
                String stringHeight = myScanner.nextLine();
                if (stringHeight == null || stringHeight.isEmpty()) {
                    System.out.println("You did not enter anything!");
                } else {
                    height = Float.parseFloat(stringHeight);
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Input value must be a number!");
            }
        }
        while (true) {
            try {
                System.out.println("Please enter the window width: ");
                String stringWidth = myScanner.nextLine();
                if (stringWidth == null || stringWidth.isEmpty()) {
                    System.out.println("You did not enter anything!");
                } else {
                    width = Float.parseFloat(stringWidth);
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Input value must be a number!");
            }
        }
                while (true) {
            try {
                System.out.println("Please enter the cost per unit area: ");
                String stringAreaCost = myScanner.nextLine();
                if (stringAreaCost == null || stringAreaCost.isEmpty()) {
                    System.out.println("You did not enter anything!");
                } else {
                    areaCost = Float.parseFloat(stringAreaCost);
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Input value must be a number!");
            }
        }
        while (true) {
            try {
                System.out.println("Please enter the cost per unit perimeter: ");
                String stringPerimeterCost = myScanner.nextLine();
                if (stringPerimeterCost == null || stringPerimeterCost.isEmpty()) {
                    System.out.println("You did not enter anything!");
                } else {
                    perimeterCost = Float.parseFloat(stringPerimeterCost);
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Input value must be a number!");
            }
        }
        while (true) {
            try {
                System.out.println("Enter the number of windows fitting these specifications: ");
                String stringNumberOfWindows = myScanner.nextLine();
                if (stringNumberOfWindows == null || stringNumberOfWindows.isEmpty()) {
                    System.out.println("You did not enter anything!");
                } else {
                    numberOfWindows = Integer.parseInt(stringNumberOfWindows);
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Input value must be a number!");
            }
        }
        
        // calculate area of the window
        float areaOfWindow = height * width;
        
        // calculate the perimeter of the window
        float perimeterOfWindow = 2 * (height + width);
        
        // calculate the total cost using hard coded values for material costs
        float cost = numberOfWindows * (((areaCost * areaOfWindow) + (perimeterCost * perimeterOfWindow)));
        
        // display the results to the user
        System.out.println("Window height: " + height);
        System.out.println("Window width: " + width);
        System.out.println("Window area: " + areaOfWindow);
        System.out.println("Window perimeter: " + perimeterOfWindow);
        System.out.println("Number of windows: " + numberOfWindows);
        System.out.println("Total cost: $" + cost);
        
    }

}
