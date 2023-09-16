package week3;
//import Scanner package before constructing scanner
 import java.util.Scanner;
public class InteractiveProgram {
	//Scanners are objects used to read input from different resources
	public static void main(String[] args) {
		//define scanner in main before using it
		Scanner testScanner = new Scanner (System.in);
		
		//Int Test
		System.out.println("How Old Are You?");
		//integer is constructed based on what is typed
		int age = testScanner.nextInt();
		System.out.println("You are " + age + " Years old");
		
		//String Test
		System.out.println("Enter Your Name");
		String name = testScanner.next();
		System.out.println("Your Name is " + name);
		
		//Multi-Scan  test
		System.out.println("Enter x, y, z:");
		int x = testScanner.nextInt();
		int y = testScanner.nextInt();
		int z = testScanner.nextInt();
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("z: " + z);
		/* Scanners read integers every other space, skipping commas. However, say someone puts the input
		 * "3 , 5 , 7", due to the spacing between the commas and numbers, the scanner will mistakenly select a comma
		 * in place of a number and cause an error as a result		 *
		 */
		//To rectify this, using scan.Next() commands between each int scan should help with the formatting
		
		String s = testScanner.next();
		int a = testScanner.nextInt();
		int b = testScanner.nextInt();
		double c = testScanner.nextDouble();
		
		System.out.println(s);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//Another thing to note is that scanners will only scan one word for a String
		//Take "Hello World" for example, a scanner will only scan "Hello, so two scanners are needed for it
		String h = testScanner.next();
		String w = testScanner.next();
		int r = testScanner.nextInt();
		
		System.out.println(h + w + r);
		
		
		
		
		
		
	}
}
