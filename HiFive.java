/* Name: Arturo Games
 * 
 * Date: 5 / 1 / 2023
 * 
 * Course: CS209
 * 
 * Description: This is a program which takes five name strings from a user's input
 * and prints out those names in reverse order than how the user put them in
 *
 */
package Week4;

import java.util.Scanner;

public class HiFive {
	
	public static void reverseNames(String a, String b, String c, String d, String e) {
		
		System.out.println("Hi " + e + " " + d + " " + c + " " + b + " " + a);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Names: ");
		String nameOne = scan.next();
		String nameTwo = scan.next();
		String nameThree = scan.next();
		String nameFour = scan.next();
		String nameFive = scan.next();
		
		reverseNames(nameOne, nameTwo, nameThree, nameFour, nameFive);
		
		
	}

}
