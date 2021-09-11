/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// This program converts a number from 1 to 12 to
// the corresponding month. Prompts for a number and display the
// corresponding calendar month, with 1 being January and 12 being December.
// For any value outside that range, displays an appropriate error message.

package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Initialize a scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // Variables declaration
        int ChoiceOfMonth;
        String month = "";

        // prompt the user for the number of the month
        System.out.print("Please enter the number of the month: ");
        ChoiceOfMonth = scanner.nextInt();

        // check if the number entered is valid or no
        // print an error message and ask for new input
        while (ChoiceOfMonth > 12 || ChoiceOfMonth < 1) {

            System.out.print("Try again! the value entered is not valid, chose from 1 to 12 : ");
            ChoiceOfMonth = scanner.nextInt();

        }

        // switch statement used to match the number entered with the corresponding month
        switch (ChoiceOfMonth) {

            case 1:
                month = "January";
                break;

            case 2:
                month = "February";
                break;

            case 3:
                month = "March";
                break;

            case 4:
                month = "April";
                break;

            case 5:
                month = "May";
                break;

            case 6:
                month = "June";
                break;

            case 7:
                month = "July";
                break;

            case 8:
                month = "August";
                break;

            case 9:
                month = "September";
                break;

            case 10:
                month = "October";
                break;

            case 11:
                month = "November";
                break;

            case 12:
                month = "December";
                break;

        }

        // output the name of the corresponding month to the screen
        // as described by the assignment
        System.out.print("The name of the month is " + month + ".");

    }

}