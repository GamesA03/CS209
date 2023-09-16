/* Name: Arturo Games
 * 
 * Date: 1 / 5 / 2023
 * 
 * Course: CS209
 * 
 * Description: This is a Java program which takes in several Strings from the user 
 * and forms a password based on those inputs via substrings
 * */
package Week4;
import java.util.Scanner;
public class PasswordGenerator {
	public static String generatePassword(String firstName, String lastName, String age, String city) {
		String firstChars= firstName.substring(0,2);
		String nextChars = lastName.substring(lastName.length()-2, lastName.length());
		String intChar = age.substring(age.length()-1);
		String cityChar = city.toUpperCase();
		cityChar = cityChar.substring(0, 1);
		int random = (int)(Math.random()*99 + 10);
		String password = firstChars + nextChars + intChar + cityChar + random;
		return password;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your First Name: ");
		String fName = scan.next();
		System.out.print("Enter Your Last Name: ");
		String lName = scan.next();
		System.out.print("Enter Your Age: ");
		String cAge = scan.next();
		System.out.print("Enter Your Curreny City of Residence: ");
		String cCity = scan.next();
		System.out.println(generatePassword(fName, lName, cAge, cCity));
		
		
	}
}
