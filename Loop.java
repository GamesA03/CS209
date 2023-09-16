package week3;
import java.util.Scanner;
public class Loop {
	public static void main(String[] args) {
		for(int i= 1; i<=5; i++) {
			System.out.println(i);
			
			
		}
		//Variables can be used as limits in a for loop
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		for(int i = 1; i<= n; i++ ) {
			System.out.print(i + " ");
			
		}
		
	}

}
