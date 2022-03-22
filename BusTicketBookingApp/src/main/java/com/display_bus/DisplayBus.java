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
@Override
public String toString() {
	return "DisplayBus [busName=" + busName + ", busFrom=" + busFrom + ", busTo=" + busTo + ", busDate=" + busDate
			+ ", busTiming=" + busTiming + ", busId=" + busId + "]";
}



	

}
/*bus_ticket_booking_app_display
(
bus_id INT
bus_name VARCHAR(100)
bus_from VARCHAR(100)
bus_to VARCHAR(100)
bus_date DATE
bus_timing 
INSERT INTO bus_ticket_booking_app_display (bus_name,bus_from,bus_to,bus_date,bus_timing )VALUES('kumaran bus services','chengalpattu','mathurantagam',NOW(),'7:00'),
*/