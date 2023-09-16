package Week6;
import java.util.Scanner;
public class EnglishToMetricConverter {
	
	public static double optA (int valA) {
		double centimeter = (double)valA * 2.54;
		return centimeter;
	}
	
	public static double optB (int valB) {
		double kilogram = (double)valB / 2.205;
		return kilogram;
	}
	
	public static double optC (int valC) {
		double kilometer = (double)valC * 1.609;
		return kilometer;
	}
	
	public static double optD (int valD) {
		double liter = (double)valD * 3.785;
		return liter;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to English-Metric Converter program");
		System.out.println("A: Inches -> Centimeters");
		System.out.println("B: Pounds -> Kilograms");
		System.out.println("C: Miles -> Kilometers");
		System.out.println("D: Gallons -> Liters");
		System.out.print("Your Choice:");
		String option = scan.next();
		if(option.equals("A") || option.equals("B") || option.equals("C") || option.equals("D")) {
			if(option.equals("A")) {
				System.out.print("enter value:");
				int valA = scan.nextInt();
				System.out.println((double)valA + " inches is equal to " + optA(valA) + " centimeters");
			}
			else if(option.equals("B")) {
				System.out.print("enter value:");
				int valB = scan.nextInt();
				System.out.println((double)valB + " pounds is equal to " + optB(valB) + " kilograms");
			}
			else if(option.equals("C")){
				System.out.print("enter value:");
				int valC = scan.nextInt();
				System.out.println((double) valC + " miles is equal to " + optC(valC)+ " kilometers");
			}
			
			else if(option.equals("D")) {
				System.out.print("enter value: ");
				int valD = scan.nextInt();
				System.out.println((double)valD +" gallons is equal to " + optD(valD) + " liters");
			}
			
		}
		else {
			System.out.println("You entered an invalid input!");
		}
	}

}
