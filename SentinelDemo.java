package Week6;
import java.util.Scanner;
public class SentinelDemo {
	
	//constant variable
	public static final int SENTINEL = -999;	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a temperature: or (" + SENTINEL + " to quit");
		int number = scan.nextInt();
		int min = number;
		int max = number;
		while(number != SENTINEL) {
			if(number == SENTINEL) {
				break;
			} 
			if(number < min) {
				min = number;
			}
			
			else if(number > max) {
				max = number;
				
			}
			System.out.println("Enter a temperature: or (" + SENTINEL + " to quit");
			number = scan.nextInt();

		}
		
		System.out.println("min = " + min);
		System.out.println("max = " + max);
	}

}
