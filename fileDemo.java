package Week7;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class fileDemo {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("data.txt"));
    
		int sum = 0;
		int count = 0;
		
		while(scan.hasNextInt()) {
			sum = sum + scan.nextInt();
			count++;
		}
		
		System.out.println(sum / count);
	}
}
