package Week11;
/*
 * Arturo Games
 * 
 * 6 / 15 / 2023
 * 
 * CS209
 * 
 * Desc: This program works with a CSV file which lists the magnitude, time, and location of an Earthquake
 * It uses delimiters to divide each info piece on an Earthquake, of which are put into certain arrays for 
 * each info type. The main method then takes the input from a user on what Earthquake they're searching for
 * and traverses each array until they find that particular Earthquake's info
 * */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

	public class EarthquakeQueryApp {
		public static int countEarthquakes(String fileName) {
			int count = 0;
			try {
				Scanner fileScanner = new Scanner(new File(fileName));
				fileScanner.nextLine();
				while (fileScanner.hasNextLine()) {
					fileScanner.nextLine();
					
					//count is repeated for each line to create the space necessary for each array
					count++;
					
					
					
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return count;
		}
	
	
	
	public static void loadArray(String fileName, String[] time, double[] mag, String[] place) {
		try {
			Scanner fileScanner = new Scanner(new File(fileName));
			fileScanner.nextLine();
			int i = 0;
			while(fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				
				Scanner lineScanner = new Scanner(line);
				lineScanner.useDelimiter(",");
				String times = lineScanner.next();
				double mags = lineScanner.nextDouble();
				String places = lineScanner.nextLine();
				
				//delimiter replaces the " within the location section with , for easier traversal
				places = places.replace("\"","");
				
				
				
				//after each variable is declared for each type, they're put in the previously-declared arrays
				time[i] = times;
				mag[i] = mags;
				place[i] = places;
				
	
		
			
				i++;
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void returnEarthquakes(String place, double magnitude, int count, double [] mags, String[] places, String[] times) {
		int number = 0;
		for(int i = 0; i < count; i++) {
			//if statement allows for either selecting a location, or both a magnitude and location
			if(place.equals("-")) {
				if(magnitude <= mags[i]) {
					System.out.println("Magnitude: " + mags[i]);
					System.out.println("Place: " + places[i]);
					System.out.println("Time: " + times[i]);
					System.out.println("------");
					System.out.println();
					System.out.println();
					number++;
				}
			}
			else if(places[i].contains(place) && magnitude <= mags[i]) {
				System.out.println("Magnitude: " + mags[i]);
				System.out.println("Place: " + places[i]);
				System.out.println("Time: " + times[i]);
				System.out.println("------");
				System.out.println();
				System.out.println();
				number++;
			}
			

			
			
		}
		
		System.out.print(number + " Earthquakes... ");
	}
	
	
	
	public static void main(String[] args) {
		String fileName = "all_month.csv";
		int count = countEarthquakes(fileName);
		Scanner scan = new Scanner(System.in);
		
		//arrays are constructed from the count integer which creates the correct size for each array
		String[] times = new String[count];
		double[] mags = new double[count];
		String[] places = new String[count];
		
	
		
		loadArray(fileName, times, mags, places);
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Place: ");
		String place = scanner.next();
		System.out.print("Magnitude: ");
		double magnitude = scanner.nextDouble();
		returnEarthquakes(place, magnitude, count, mags, places, times);
	
		
		
	}
}
