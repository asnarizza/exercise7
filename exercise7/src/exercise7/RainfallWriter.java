package exercise7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * This program demonstrate writing data using character-based stream
 * 
 * @author Rose Asnarizza Nahar
 *
 */

public class RainfallWriter {

	public static void main(String[] args) {
		
		//identify destination
		String fileName = "rainfall.txt";
        
		try {
        	
			//construct Writer object
            PrintWriter pwRainfall = new PrintWriter(fileName);

            //data of rainfall for Station Simpang Ampat
            pwRainfall.println("Station ID: 2421003");
            pwRainfall.println("Station Name: Simpang Ampat");
            pwRainfall.println("District: Alor Gajah");
            pwRainfall.println("Rainfall Data:");

            int[] rainfallReadings = {5, 0, 0, 4, 1, 0};

            //print data
            for (int i = 0; i < rainfallReadings.length; i++) {
                
            	pwRainfall.println("Day " + (i + 1) + ": " + rainfallReadings[i]);
            
            }

            pwRainfall.close();
            
            System.out.println("Data creation has ended.");
       
		} catch (IOException e) {
            e.printStackTrace();
        }
    }
}