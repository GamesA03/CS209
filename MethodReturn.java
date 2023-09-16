package Week4;

public class MethodReturn {
	public static double average (double a, double b, double c, double d) {
		double avg = ((a + b + c + d) / 4);
		return avg;
	}
	
	public static double calculateHypotnuse(int a, int b) {
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return c;
		
	}
	public static void main(String[] args) {
		System.out.println(average(10,30,40,15));
		int a = 3;
		int b = 4;
		System.out.println(calculateHypotnuse(a,b));
	}

}
