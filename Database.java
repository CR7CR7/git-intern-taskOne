package com.taskone.onlinereservationsystem;

import java.util.ArrayList;
class Database {

private ArrayList<Train> trains; // list of trains
private ArrayList<Reservation> reservations; // list of reservations

// Constructor
public Database() {
  trains = new ArrayList<Train>();
  reservations = new ArrayList<Reservation>();
  // Add some sample trains here
  trains.add(new Train(101, "Express", new String[]{"AC", "Sleeper", "General"}));
  trains.add(new Train(102, "Shatabdi", new String[]{"AC Chair Car", "Executive Chair Car"}));
  trains.add(new Train(103, "Rajdhani", new String[]{"AC First Class", "AC Two Tier", "AC Three Tier"}));
}

// A method to check if a user has a valid login id and password
public boolean isValidUser(String loginId, String password) {
  // For simplicity, assume that the login id and password are both "admin"
  if (loginId.equals("majorTom") && password.equals("root")) {
    return true;
  } else {
    return false;
  }
}

// A method to generate a unique PRN for a reservation
public int generatePrn() {
  // For simplicity, assume that the PRN is the size of the reservations list plus one
  return reservations.size() + 1;
}

// A method to insert a reservation into the database
public void insertReservation(Train train, String classType, String date, String from, String to) {
  // Generate a PRN for the reservation
  int prn = generatePrn();
  // Create a reservation object
  Reservation reservation = new Reservation(prn, train, classType, date, from, to);
  // Add the reservation to the list
  reservations.add(reservation);
  // Print a confirmation message
  System.out.println("Reservation successful. Your PRN is: " + prn);
}

// A method to cancel a reservation from the database
public void cancelReservation(int prn) {
  // Loop through the reservations list to find the matching PRN
  for (int i = 0; i < reservations.size(); i++) {
    Reservation reservation = reservations.get(i);
    if (reservation.getPrn() == prn) {
      // Remove the reservation from the list
      reservations.remove(i);
      // Print a confirmation message
      System.out.println("Cancellation successful. Your PRN was: " + prn);
      return; // exit the loop and method
    }
  }
  // If no matching PRN is found, print an error message
  System.out.println("Invalid PRN. No reservation found.");
}
//A method to get the list of trains
public ArrayList<Train> getTrains() {
// Return the trains field
return trains;
}

}