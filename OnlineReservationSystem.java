package com.taskone.onlinereservationsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineReservationSystem {
	public static void main(String[] args) {
		  // Create a database object
		  Database db = new Database();
		  // Create a scanner object for user input
		  Scanner sc = new Scanner(System.in);
		  // Display a welcome message
		  System.out.println("Welcome to the Online Reservation System");
		  // Ask the user to enter their login id and password
		  System.out.println("Please enter your login id and password");
		  String loginId = sc.nextLine();
		  String password = sc.nextLine();
		  // Check if the user is valid
		  if (db.isValidUser(loginId, password)) {
		    // Display a menu of options
		    System.out.println("Please choose an option:");
		    System.out.println("1. Make a reservation");
		    System.out.println("2. Cancel a reservation");
		    System.out.println("3. Exit");
		    int choice = sc.nextInt();
		    // Perform the corresponding action based on the user's choice
		    switch (choice) {
		      case 1: // Make a reservation
		    	// Print the list of trains
		    	  System.out.println("Here are the available trains:");
		    	  ArrayList<Train> trains = db.getTrains(); // assign the result to a variable
		    	  for (Train train : trains) { // use the variable in a loop
		    	    System.out.println(train.getNumber() + " - " + train.getName());
		    	  }
		        // Ask the user to enter the train number
		        System.out.println("Please enter the train number:");
		        int trainNumber = sc.nextInt();
		        // Find the matching train object from the list
		        Train train = null;
		        for (Train t : db.getTrains()) {
		          if (t.getNumber() == trainNumber) {
		            train = t;
		            break;
		          }
		        }
		        // If no matching train is found, print an error message and exit
		        if (train == null) {
		          System.out.println("Invalid train number. No train found.");
		          return;
		        }
		        // Display the list of class types for the selected train
		        System.out.println("Here are the available class types for " + train.getName() + ":");
		        for (String classType : train.getClasses()) {
		          System.out.println(classType);
		        }
		        // Ask the user to enter the class type
		        System.out.println("Please enter the class type:");
		        sc.nextLine(); // consume the newline character from previous input
		        String classType = sc.nextLine();
		        // Check if the class type is valid for the selected train
		        boolean validClassType = false;
		        for (String ct : train.getClasses()) {
		          if (ct.equals(classType)) {
		            validClassType = true;
		            break;
		          }
		        }
		        // If not valid, print an error message and exit
		        if (!validClassType) {
		          System.out.println("Invalid class type. No class found.");
		          return;
		        }
		        // Ask the user to enter the date of journey
		        System.out.println("Please enter the date of journey (dd/mm/yyyy):");
		        String date = sc.nextLine();
		        // Ask the user to enter the from place
		        System.out.println("Please enter the from place:");
		        String from = sc.nextLine();
		        // Ask the user to enter the destination
		        System.out.println("Please enter the destination:");
		        String to =sc.nextLine();


               }
		  }
	}
}
