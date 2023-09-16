package Week5;
import java.util.Scanner;
public class GradeCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter midterm 1 grade: ");
		int midOne = scan.nextInt();
		System.out.print("Enter midterm 2 grade: ");
		int midTwo = scan.nextInt();
		System.out.print("Enter final exam grade: ");
		int finalExam = scan.nextInt();
		
		double finalGrade = ((midOne * 0.20) + (midTwo * 0.20) + (finalExam * 0.60));
		 
		
		if (finalGrade >= 90) {
			System.out.println("Your final grade is: " + finalGrade + " and your letter grade is A");
		}
		
		else if (finalGrade >= 80) {
			System.out.println("Your final grade is: " + finalGrade + " and your letter grade is B");
		}
		
		else if (finalGrade >= 70) {
			System.out.println("Your final grade is: " + finalGrade + " and your letter grade is C");
		}
		
		else if (finalGrade >= 60) {
			System.out.println("Your final grade is: " + finalGrade + " and your letter grade is D");
		}
		
		else {
			System.out.println("Your final grade is: " + finalGrade + " and your letter grade is F");
		}
		
		
	}

}
