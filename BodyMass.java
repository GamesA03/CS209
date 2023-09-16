package Week5;
import java.util.Scanner;
public class BodyMass {
	public static double BmiOne (double heightOne, double weightOne) {
		double bmiOne = (weightOne / (heightOne*heightOne)) * 703;
		return bmiOne;
		
	}
	
	public static double BmiTwo (double heightTwo, double weightTwo) {
		double bmiTwo = (weightTwo / (heightTwo * heightTwo)) * 703;
		return bmiTwo;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter next person's information: ");
		System.out.print("height (in inches)? ");
		double heightO = scan.nextDouble();
		System.out.print("weight (in pounds)? ");
		double weightO = scan.nextDouble();
		System.out.println("Enter next person's information: ");
		System.out.print("height (in inches)?");
		double heightT = scan.nextDouble();
		System.out.print("weight (in pounds)?");
		double weightT = scan.nextDouble();
		
		System.out.println(BmiOne(heightO, weightO));
		if(BmiOne(heightO, weightO) >= 30.0 ) {
			System.out.println("obese");
			
		}
		
		else if(BmiOne(heightO, weightO) >= 25.0 && BmiOne(heightO, weightO) <= 29.9) {
			System.out.println("overweight");
		}
		
		
		else if(BmiOne(heightO, weightO) >= 18.5 && BmiOne(heightO, weightO) <= 24.9) {
			System.out.println("normal");
			
		}
		
		else {
			System.out.println("underwieght");
		}
		
		
		System.out.println(BmiTwo(heightT, weightT));
		if(BmiTwo(heightT, weightT) >= 30.0 ) {
			System.out.println("obese");
			
		}
		
		else if(BmiTwo(heightT, weightT) >= 25.0 && BmiTwo(heightT, weightT) <= 29.9) {
			System.out.println("overweight");
		}
		
		
		else if(BmiTwo(heightT, weightT) >= 18.5 && BmiTwo(heightT, weightT) <= 24.9) {
			System.out.println("normal");
			
		}
		
		else {
			System.out.println("underwieght");
		}
		
		
		
		
	}

}
