/*
 * Name: Arturo Games
 * Date: 5 / 30 / 2023
 * CS209
 * Description: This program takes in a file with a list of integers
 * and computes the minimum, maximum, average, and amount of numbers within 
 * the file, then uses a printStream object to print out those statistics onto
 * a new output file
 * 
 */

package Week8;

//imports use different objects from the java catalog and applies them to this program
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
public class FileIOApp {
	public static void main(String[] args) {
		  
		  try {
	            Scanner file = new Scanner(new File("nextInput.txt"));
	            
	            //PrintStream establishes a new file destination for the computed values
	            PrintStream out = new PrintStream(new File("nextInput_out.txt"));
	            int smallest = file.nextInt();
	            
	            //while loop is used to compare int values while there are still integers in the file
	            while(file.hasNextInt()) {
	                int number = file.nextInt();
	                
	                //if statement compares the each scanned number to the previous scanned number to determine which is less
	                if(number < smallest) {
	                	
	                	smallest = number;
	                }

	                
	            }
	            
	            
	            
	          
	          file= new Scanner(new File("nextInput.txt"));
	          int largest = file.nextInt();
	          
	          while(file.hasNext()) {
	        	  int number = file.nextInt();
	        	  
	        	  //if statement compares the each scanned number to the previous scanned number to determine which is greater
	        	  if (number > largest) {
	        		  
	        		  largest = number;
	        	  }
	          }
	          
	          
	          
	          
	          file = new Scanner(new File("nextInput.txt"));
	          int sum = file.nextInt();
	          
	          while(file.hasNextInt()) {
	        	  
	        	  //sum takes the next scanned integer value and adds it to the previous while integers are still in a file
	        	  sum += file.nextInt(); 
	        	  
	          }
	          
	          
	          
	          
	          file = new Scanner(new File("nextInput.txt"));
	          int avgSum = file.nextInt();
	          
	          int count = 1;
	          
	          while(file.hasNextInt()) {
	        	  
	        	  //Similar to the previous function, avgSum takes the next integer and adds it to the previous one
	        	  avgSum += file.nextInt();
	        	  
	        	  //count increases in increments for each integer scanned so the sum can be divide by it
	        	  count++;
	        	  
	          }
	          
	          //println features directly connect to the PrintStream object so the info can be printed on the new file
	          out.println("Min: " + smallest);
	          out.println("Max: " + largest);
	          out.println("Count: " + count);
	          out.println("Sum: " + sum); 
	          out.println("Average: "+ avgSum / count);
	          
	          
	          
	          

	            
		} catch (FileNotFoundException e) {
			//Automatic response if no file is found
			System.out.print("File Not Found");
		}

			
		
		
	}

}
