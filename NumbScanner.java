package Week5;
import java.util.Scanner;
public class NumbScanner {
	public static void m (int a) {
		if (a >= 10) {
			System.out.println(a + " has multiple digits");
		}
		
		else if (a < 10 && a > 0) {
				System.out.println(a + " has one digit");
		}
		
		else if (a < 0) {
			System.out.println(a + " is negative");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three numbers:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		m(n1);
		m(n2);
		m(n3);
	}

}
