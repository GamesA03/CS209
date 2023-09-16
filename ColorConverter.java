/* Name: Arturo Games
 * 
 * Date: 5 / 1 / 2023
 * 
 * Course: CS209
 * 
 * Description: This is a program which takes in the RGB values from a user's input and performs
 * calculations to set the values to CMYK format as well as calculating the black value as well
 * 
 */

package Week4;

import java.util.Scanner;
public class ColorConverter {
	public static void convertFromRGBtoCMYK (int r, int g, int b) {
		
		double red = (double) r / 255;
		double green = (double) g / 255;
		double blue = (double) b / 255; 
		
		double black = 1 - Math.max(Math.max(red, green), blue);
		double cyan = ((1-red-black) / (1-black));
		double magenta = ((1-green-black) / (1-black));
		double yellow = ((1-blue-black) / (1-black));
		
		System.out.println("Red: " + (double)r);
		System.out.println("Green: " + (double)g);
		System.out.println("Blue " + (double)b);
		System.out.println();
		System.out.println("Cyan: " + cyan);
		System.out.println("Magenta: " + magenta);
		System.out.println("Yellow: " + yellow);
		System.out.println("Black: " + black);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter red, green, blue: ");
		int r = scan.nextInt();
		int g = scan.nextInt();
		int b = scan.nextInt();
		
		convertFromRGBtoCMYK(r, g, b);
		
	}

}
