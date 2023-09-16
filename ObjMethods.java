package Week4;
import java.util.Scanner;
public class ObjMethods {
	
	public static void printSum(int x, int y) {
	//If method has more than four parameters the program will slow down
	//void means method does not have a specific type or does not directly return anything
		System.out.println(x+y);
	}
	
	public static int sum(int x, int y) {
		//Method has an int type, meaning it must return an int value
		//If method type is anything other than void, a return command must be used inside the method
	
		return x + y;
	}
	
	
	public static int newSum(int x, int y) {
		int total = x + y;
		return total;
		
	}
	
	public static double multiply (int x, double y) {
		double result = x * y;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		printSum(4,3);
		
		int total = sum(4,5);
		System.out.println(total);
		
		//You can only call a method in a println statement (or anything else really) if a method returns something (isn't void)
		System.out.println(multiply(4, 6.3));
		
		int randomNumber =(int)(Math.random()*100);
		System.out.println(randomNumber);
		
		
		
		
		
		
		
	}

}
