package Week5;
import java.util.Scanner;
public class AgeVerification {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Plase Enter Your Age: ");
		int age = scan.nextInt();
		
		if(age >= 18) {
			System.out.println("You are eligible to vote");
			
		} else {
			System.out.println("You are not eligible to vote");
			
		}
		
	}

}
