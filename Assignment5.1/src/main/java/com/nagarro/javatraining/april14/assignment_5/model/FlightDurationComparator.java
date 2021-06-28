package com.nagarro.javatraining.april14.assignment_5.model;

import java.util.Comparator;

/**
 * class - FlightDurationComparator
 * @author sanjanajat
 * Description : Class responsible sorting based on Duration.
 */
public class FlightDurationComparator implements Comparator<Flight> {
/**
 * Compare two FlightDetails objects based on Duration.
 * @param Flight a
 * @param Flight b
 * @return return value of integer type.
 */
	public int compare(Flight a, Flight b) {
		Double x  = a.getFlightDuration()-b.getFlightDuration() ;
		if (x<0)
		return -1;
		else if (x>0)
			return 1 ;
		else
			return 0;
			
	}

}
