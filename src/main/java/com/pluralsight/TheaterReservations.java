package com.pluralsight;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class TheaterReservations {
    public static void main(String[] args) {

        // created scanner for input
        Scanner scanner = new Scanner(System.in);

        // ask for customers name
        System.out.print("Who is watching Frankenstein? ");

        // Save name
        String movieFan = scanner.nextLine();

        // ask for reservation date
        System.out.println("Enter your movie date (MM/dd/yyyy): ");

        // store movie date as text
        String movieDateInput = scanner.nextLine();

        // ask for ticket quantity
        System.out.println("How many tickets would you like? ");

        // convert input to integer
        int ticketCount = Integer.parseInt(scanner.nextLine());






    }
}
