package com.display_bus;

public class DisplayBus {
	public String busName;
	public String busFrom;
	public String busTo;
	public String busDate;
	public String busTiming;
	public Integer busId;
public DisplayBus(Integer busId,String busName, String busFrom, String busTo, String busTiming) {
		this.busId=busId;
		this.busName = busName;
		this.busFrom = busFrom;
		this.busTo = busTo;
	    this.busDate = busDate;
		this.busTiming = busTiming;
		
	}


public DisplayBus(String busName, String busFrom, String busTo, String busTiming) {
	super();
	this.busName = busName;
	this.busFrom = busFrom;
	this.busTo = busTo;
	this.busTiming = busTiming;
}






/**
 * @param busName
 * @param busFrom
 * @param busTo
 */
public DisplayBus(String busName, String busFrom, String busTo) {
	super();
	this.busName = busName;
	this.busFrom = busFrom;
	this.busTo = busTo;
}


/**
 * @param busFrom
 */
public DisplayBus(String busFrom) {
	super();
	this.busFrom = busFrom;
}



/**
 * @param busTo
 */



public DisplayBus(String busName, String busFrom) {
	super();
	this.busName = busName;
	this.busFrom = busFrom;
}

	

@Override
public String toString() {
	return '\n'+ busId +"     "+ busName + "      "+ busFrom +"       "+ busTo +"      "+ busDate+"      "+ busTiming ;
	}

}