package com.BookingTicket;

public class BookingModel {
	//public Integer bookingId;
	public String  pickUpLocation;
	public String  dropOfflocation;
	public String busName;
	public String busFrom;
	public String busTo;

	public BookingModel( String pickUpLocation, String dropOfflocation, String busName,
			String busFrom, String busTo) {
		super();
	//	this.bookingId = bookingId;
		this.pickUpLocation = pickUpLocation;
		this.dropOfflocation = dropOfflocation;
		this.busName = busName;
		this.busFrom = busFrom;
		this.busTo = busTo;
	}

	@Override
	public String toString() {
		return "BookingModel [pickUpLocation=" + pickUpLocation + ", dropOfflocation="
				+ dropOfflocation + ", busName=" + busName + ", busFrom=" + busFrom + ", busTo=" + busTo + "]";
	}


}
