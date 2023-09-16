package Week9;
import java.util.Scanner;
import java.io.*;
public class TemperatureReader {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(new File("temperatures.txt"));
			PrintStream out = new PrintStream(new File("temperatures_out.txt"));
			
			int count = 1;
			
			while (scan.hasNextDouble()) {
				if(scan.nextDouble() >= 0 || scan.nextDouble() <= 10) {
					count++;
				}
			}
			
			scan = new Scanner(new File("temperatures.txt"));
			
			int count2 = 1;
			
			while (scan.hasNextDouble()) {
				if(scan.nextDouble() >= 10 || scan.nextDouble() <= 20) {
					count2++;
				}
			}
			
			scan = new Scanner(new File("temperatures.txt"));
			
			int count3 = 1;
			
			while (scan.hasNextDouble()) {
				if(scan.nextDouble() >= 20 || scan.nextDouble() <= 30) {
					count3++;
				}
			}
			
			scan = new Scanner(new File("temperatures.txt"));
			
			int count4 = 1;
			
			while (scan.hasNextDouble()) {
				if(scan.nextDouble() >= 30 || scan.nextDouble() <= 40) {
					count4++;
				}
			}
			
			out.println("0 - 10 --------------" + count);
			out.println("10 - 20 --------------" + count2);
			out.println("20 - 30 --------------" + count3);
			out.println("30 - 40 --------------" + count4);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
