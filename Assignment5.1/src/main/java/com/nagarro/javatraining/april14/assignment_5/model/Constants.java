package com.nagarro.javatraining.april14.assignment_5.model;

import java.io.File;
import java.text.SimpleDateFormat;
/**
 * Interface name - Constants
 * @author sanjanajat
 * Class responsible for storing CSV file and date format.
 */
public interface Constants
{
	//CSV file-"CSV1" which contains flights info.
	public static final File file = new File("CSV1/");
	public static final SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
}