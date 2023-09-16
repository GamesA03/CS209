package Week5;
import java.util.Scanner;
public class PasswordVerification {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	/*System.out.println("Enter the password: ");
	String FirstAttempt = scan.next();
	String password = "secret123";*/
	
	/*if (FirstAttempt.equals(password)) {
		System.out.println("Access granted!");
	} else {
		System.out.println("Access denied! You have 2 attempts remaining");
		System.out.print("Enter the password: ");
		String SecondAttempt = scan.next();
		if (SecondAttempt.equals(password)) {
			System.out.println("Access granted!");
		} else  {
			System.out.println("Access denied! You have 1 attempts remaining");
			System.out.print("Enter the password: ");
			String ThirdAttempt = scan.next();
			if (ThirdAttempt.equals(password)) {
				System.out.println("Access granted!");
			} else {
				System.out.println("Access denied! You have 0 attempts remaining");
				System.out.print("Access locked . Contact an administrator to unlock your account");
			}
			
		}
		
	}*/
	
	boolean grantAccess = false;
	for(int i  = 1; i <=3; i++) {
		System.out.println("Enter the password: ");
		String password = scan.next();
		 
		if (password.equals("secret123")) {
			System.out.println("access granted!");
			grantAccess = true;
			 break;
		}
		
		else {
			System.out.println("Access denied! You have " + (3-i) + " attempts remaining");
		}
		
	}
	
	if(!grantAccess) {
		System.out.println("Access locked. Contact the administrator to unlock your account");
	}
	
	}
}
