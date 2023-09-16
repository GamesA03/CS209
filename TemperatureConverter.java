package Week5;
import java.util.Scanner;
public class TemperatureConverter {
	
	public static double fahrenheit (int temp) {
		double celsius = ((temp - 32) * 5 / 9);
		return celsius;
	}
	
	public static double celsius (int temp) {
		double fahrenheit = ((temp * 9 / 5) + 32);
		return fahrenheit;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Temperature: ");
		int temp = scan.nextInt();
		System.out.print("Is the temperature in fahrenheit or celsius? ");
		String CorF = scan.next();
		
		if (CorF.equals("C")) {
			System.out.println("The temperature in Celsius is: " + fahrenheit(temp));
		}
		
		else if (CorF.equals("F")) {
			System.out.println("The temperature in Fahrenheit is: " + celsius(temp));
		}
		
		else {
			System.out.println("temperature type invalid");
		}
	}

}
