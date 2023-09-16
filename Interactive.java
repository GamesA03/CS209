package week3;
import java.util.Scanner;
public class Interactive {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int firstNum = scan.nextInt();
	System.out.println("Enter a number: ");
	int secondNum = scan.nextInt();
	 int sum = firstNum + secondNum;
	System.out.println("Sum: " + sum);
	
	
	System.out.println("Enter a double: ");
	double firstDouble = scan.nextDouble();
	System.out.println("Enter a double: ");
	double secondDouble = scan.nextDouble();
	System.out.println("enter a double: ");
	double thirdDouble = scan.nextDouble();
	
	double average = (firstDouble + secondDouble + thirdDouble) / 3;
	System.out.println("Average: " + average);
	
	
	
	}
}
