package com.nagarro.javatraining.april14.assignment_5.model;

import java.util.Date;
/**
 * Class - UserInput
 * @author sanjanajat
 * Description - Class for storing inputs entered by users.
 */
public class UserInput implements Constants {
	String depLoc ;
	String arrLoc ;
	Date flightDate ;
	String flightClass ;
	int outputPreference ;
	
	public UserInput(String depLoc, String arrLoc, Date flightDate,
			String flightClass, int outputPreference) {
		super();
		this.depLoc = depLoc;
		this.arrLoc = arrLoc;
		this.flightDate = flightDate;
		this.flightClass = flightClass;
		this.outputPreference = outputPreference;
	}
	
	

	/**
	 * @return the depLoc - departure location
	 */
	public String getDepLoc() {
		return depLoc;
	}



	/**
	 * @return the arrLoc - arrival location
	 */
	public String getArrLoc() {
		return arrLoc;
	}



	/**
	 * @return the flightDate - date of flight
	 */
	public Date getFlightDate() {
		return flightDate;
	}



	/**
	 * @return the flightClass - travel class of flight
	 */
	public String getFlightClass() {
		return flightClass;
	}



	/**
	 * @return the outputPreference - output on the basis of preference (fare or duration).
	 */
	public int getOutputPreference() {
		return outputPreference;
	}



	@Override
	public String toString() {
		return "depLoc=" + depLoc + ", arrLoc=" + arrLoc
				+ ", flightDate=" + dateformat.format(flightDate) + ", flightClass=" + flightClass
				+ ", outputPreference=" + outputPreference ;
	}
	
	
	
	
}