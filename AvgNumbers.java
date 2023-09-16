package Week4;
import java.util.Scanner; 
public class AvgNumbers {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int x = scan.nextInt();
		System.out.println("Enter number2: ");
		int y = scan.nextInt();
		System.out.println("Enter number3: ");
		int z = scan.nextInt();
		
		getAvg(x, y, z);
		getAvg(11, 23, 63);
	}
	
	public static void getAvg(int x, int y, int z) {
		double avg = ((x + y + z)/3);
		System.out.println("Average = " + avg);
		
	}
}
