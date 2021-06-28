/**
 * 
 */
package com.nagarro.javatraining.april14.assignment_5.model;

import java.util.Comparator;

/**
 * class - FlightPriceComparator
 * @author sanjanajat
 * Description : Class responsible sorting based on Fare/price.
 */
public class FlightPriceComparator implements Comparator<Flight>
{
	public int compare(Flight arg0, Flight arg1) {
		return arg0.getFare()-arg1.getFare();
	}
}
