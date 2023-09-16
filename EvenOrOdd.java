package Week5;

import java.util.Scanner;
public class EvenOrOdd {
public static boolean isEven (int input) {
	return input % 2 ==0;
}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int input = scan.nextInt();
	
	if (isEven(input) == false) {
		System.out.println(input + " is odd");
		
	}
	
	else {
		System.out.println(input + " is even");
		
	}
	}
}
