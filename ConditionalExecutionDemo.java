package Week5;

import java.util.Scanner;
public class ConditionalExecutionDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int grade = scan.nextInt();
		String username = scan.next();
		int x = 4;
		
		
		if (grade >= 90) {
			System.out.println("A");
		}
		
		else if (grade >= 85) {
			System.out.println("B");
		}
		
		else if (grade >= 75) {
			System.out.println("C");
		}
		
		else {
			System.out.println("D");
		}
		
		if (username == "CS209") {
			String password = scan.next();
			if (password == "1234") {
				System.out.println("valid");
			} else {
				System.out.println("invalid");
			  }
			
		} 
		
		else {
			
			System.out.println("invalid");
		  }
		
		
	}
}
