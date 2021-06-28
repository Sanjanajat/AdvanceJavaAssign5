package com.nagarro.javatraining.april14.assignment_5.controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.nagarro.javatraining.april14.assignment_5.input.InputAcceptor;
import com.nagarro.javatraining.april14.assignment_5.model.Flight;
import com.nagarro.javatraining.april14.assignment_5.model.FlightDurationComparator;
import com.nagarro.javatraining.april14.assignment_5.model.FlightPriceComparator;
import com.nagarro.javatraining.april14.assignment_5.model.UserInput;
/**
 * Class - Utility
 * @author sanjanajat
 * Description - Main class
 */
public class Utility {
	public static HashMap<String,HashSet<Flight>> flightsInfo = new HashMap<String,HashSet<Flight>>();

	public static void main(String[] args) throws IOException {

		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Flight> result = new ArrayList<Flight>();
		String choice = null  ;
		UserInput  uiObj ;

		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleAtFixedRate(new ModificationWatcher(), 0, 3, TimeUnit.SECONDS);

		do {
			uiObj= InputAcceptor.enterInput() ;
			result.clear();
			synchronized(Utility.flightsInfo) 
			{
				for (HashSet<Flight> set : flightsInfo.values()) {
					for (Flight f : set) {
						if (f.getDepLoc().equalsIgnoreCase(uiObj.getDepLoc())
								&& f.getArrLoc().equalsIgnoreCase(uiObj.getArrLoc())
								&& f.getFlightClass().equalsIgnoreCase(uiObj.getFlightClass())
								&& (uiObj.getFlightDate().compareTo(f.getValidTill()) <= 0)
								&& f.isSeatAvailability())
							result.add(f);
					}
				}
			}
			
			//sorting on the basis of Fare and Duration.
			if (uiObj.getOutputPreference()==1)
				Collections.sort(result, new FlightPriceComparator());
			else
				Collections.sort(result, new FlightDurationComparator());
			
			//Show all the flights available.
			System.out.println("\nResult:");
			for (Flight f : result) {
				System.out.println(f);
			}
			
			System.out.print("\nWant to Exit (Enter Y/N)");
			while(!((choice = br.readLine()).equalsIgnoreCase("y")||choice.equalsIgnoreCase("n")))
				System.out.print("I could not Understand Enter Again:");
		} while (choice.equalsIgnoreCase("n"));
		service.shutdown();
	}
}
