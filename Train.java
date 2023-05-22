package com.taskone.onlinereservationsystem;

public class Train {
	 private int number; // train number
	  private String name; // train name
	  private String[] classes; // available class types

	  // Constructor
	  public Train(int number, String name, String[] classes) {
	    this.number = number;
	    this.name = name;
	    this.classes = classes;
	  }

	  // Getters
	  public int getNumber() {
	    return number;
	  }

	  public String getName() {
	    return name;
	  }

	  public String[] getClasses() {
	    return classes;
	  }
	

}
