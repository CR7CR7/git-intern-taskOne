package com.taskone.onlinereservationsystem;

public class Reservation {
	private int prn; // passenger reservation number
	  private Train train; // train object
	  private String classType; // class type
	  private String date; // date of journey
	  private String from; // from place
	  private String to; // destination

	  // Constructor
	  public Reservation(int prn, Train train, String classType, String date, String from, String to) {
	    this.prn = prn;
	    this.train = train;
	    this.classType = classType;
	    this.date = date;
	    this.from = from;
	    this.to = to;
	  }

	  // Getters
	  public int getPrn() {
	    return prn;
	  }

	  public Train getTrain() {
	    return train;
	  }

	  public String getClassType() {
	    return classType;
	  }

	  public String getDate() {
	    return date;
	  }

	  public String getFrom() {
	    return from;
	  }

	  public String getTo() {
	    return to;
	  }
	

}
