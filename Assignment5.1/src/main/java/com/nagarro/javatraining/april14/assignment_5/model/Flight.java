/**
 * 
 */
package com.nagarro.javatraining.april14.assignment_5.model;
import java.util.Date;
/**
 * class- Flight
 * @author sanjanajat
 * description - Model class for storing flight details.
 */

public class Flight implements Constants {
	String flightNo ;
	String depLoc ;
	String arrLoc;
	Date validTill ;
	String flightTime ;
	Double flightDuration ;
	int fare ;
	boolean seatAvailability;
	String flightClass ;
	/**
	 * 
	 * @param flightNo
	 * @param depLoc
	 * @param arrLoc
	 * @param fare
	 * @param validTill
	 * @param flightTime
	 * @param flightDuration
	 * @param seatAvailability
	 * @param flightClass
	 */
	
	
	public Flight( String flightNo, String depLoc, String arrLoc, int fare,
			Date validTill, String flightTime, Double flightDuration,
			boolean seatAvailability, String flightClass) {
		super();
		this.flightNo = flightNo;
		this.depLoc = depLoc;
		this.arrLoc = arrLoc;
		this.validTill = validTill;
		this.flightTime = flightTime;
		this.flightDuration = flightDuration;
		this.seatAvailability = seatAvailability;
		this.flightClass = flightClass;
		if (flightClass.equalsIgnoreCase("EB"))
			fare = 140 * fare / 100;
		this.fare = fare;
	}

	/**
	 * 
	 * @return the flightNo - available flights            
	 */
	public String getFlightNo() {
		return flightNo;
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
	 * @return the validTill - flight validity date
	 */
	public Date getValidTill() {
		return validTill;
	}



	/**
	 * @return the flightTime - scheduled time for flight
	 */
	public String getFlightTime() {
		return flightTime;
	}



	/**
	 * @return the flightDuration - duration of flight
	 */
	public Double getFlightDuration() {
		return flightDuration;
	}



	/**
	 * @return the fare - total price for flight
	 */
	public int getFare() {
		return fare;
	}



	/**
	 * @return the seatAvailability - availability of seats
	 */
	public boolean isSeatAvailability() {
		return seatAvailability;
	}



	/**
	 * @return the flightClass - travel class of flight
	 */
	public String getFlightClass() {
		return flightClass;
	}
	
	@Override
	//Display Flight details.
	public String toString() {
		return "flightNo=" + flightNo + ", depLoc=" + depLoc
				+ ", arrLoc=" + arrLoc + ", validTill=" + dateformat.format(validTill)
				+ ", flightTime=" + flightTime + ", flightDuration="
				+ String.format("%.2f", flightDuration) + ", fare=" + fare + ", seatAvailability="
				+ seatAvailability + ", flightClass=" + flightClass ;
	}

	
	/*
	public boolean equals(Flight f) {
		if(this.flightNo.equalsIgnoreCase(f.getFlightNo())&&
				(this.validTill.compareTo(f.getValidTill())==0) &&
				this.flightTime.equalsIgnoreCase(f.getFlightTime())&&
				this.flightClass.equalsIgnoreCase(f.getFlightClass())&&
				this.depLoc.equalsIgnoreCase(f.getDepLoc())&&
				this.arrLoc.equalsIgnoreCase(f.getArrLoc())
				)
			return true;
		else
			return false;
	}
*/
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((flightNo == null) ? 0 : flightNo.hashCode());
		return result;
	}

	//Method to return false if any of the details missed else return true.
	public boolean equals(Object obj) {
		Flight other = (Flight) obj;
		if (arrLoc == null) {
			if (other.arrLoc != null)
				return false;
		} else if (!arrLoc.equals(other.arrLoc))
			return false;
		if (depLoc == null) {
			if (other.depLoc != null)
				return false;
		} else if (!depLoc.equals(other.depLoc))
			return false;
		if (flightNo == null) {
			if (other.flightNo != null)
				return false;
		} else if (!flightNo.equals(other.flightNo))
			return false;
		if (flightTime == null) {
			if (other.flightTime != null)
				return false;
		} else if (!flightTime.equals(other.flightTime))
			return false;
		if (seatAvailability != other.seatAvailability)
			return false;
		if (validTill == null) {
			if (other.validTill != null)
				return false;
		} else if (!validTill.equals(other.validTill))
			return false;
		return true;
	}


	
	
}
