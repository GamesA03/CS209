package Week6;
import java.util.Scanner;
public class WhileDemo {
	public static void main(String[] args) {
		
		/*int i = 0;
		//works similar to a for loop but can be undefined in terms of length of looping
		while(i < 5) {
			System.out.println(i);
			//i++ function increments i by one, bringing it closer to the value of comparison inside the while loop
			i++;
		}*/
		Scanner scan = new Scanner(System.in);
		
		int numberToGuess = (int)(Math.random() * 10) + 1;
		int guess = 0;
		int attempts = 0;
		while(guess != numberToGuess) {
			System.out.println("Guess number: ");
			guess = scan.nextInt();
			attempts++;
			if (guess < numberToGuess) {
				System.out.println("Too low, try again");
			} else if (guess > numberToGuess) {
				System.out.println("Too high, try again");
			}
		}
		System.out.println("Congratualtions! You got the number after " + attempts + " attempts");
	}
}
