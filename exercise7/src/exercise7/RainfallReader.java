package exercise7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RainfallReader {

	   public static void main(String[] args) {
		   
		 //identify the source
       	String inputFile = "rainfall.txt";
       	String line;
		   
	        try {
	        	
	        	//construct Reader object
	            BufferedReader brRainfall = new BufferedReader(new FileReader(inputFile));

	            //read data
	            while ((line = brRainfall.readLine()) != null) {
	                System.out.println(line);
	            }

	            //close the Reader
	            brRainfall.close();
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}