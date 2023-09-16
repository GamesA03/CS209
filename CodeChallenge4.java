package Week4;

public class CodeChallenge4 {
	public static int sum (int x, int y) {
		int sum = x + y;
		return sum;
		
	}
	
	public static double average (int x, int y, int z, int a) {
		double average = ((double)(x + y + z + a) / 4);
		return average;
		
	}
	
	public static int minOfThree (int x, int y ,int z) {
		int min = Math.min(Math.min(x, y), z);
		return min;
		
	}
	
	public static void printNumbers (int a) {
		for(a = 1; a <= 5; a++) {
			System.out.print(a);
		}
		
	}
	
	/*public static void printChars(String word) {
		
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		
	}*/
	
	public static String merge (String a, String b) {
		String subA = a.substring(0,3);
		String subB = b.substring(0,3);
		String newString = subA + subB;
		return newString;
	}
	
	public static int getShortestStringLength(String a, String b) {
		int aLength = a.length();
		int bLength = b.length();
		int minLength = Math.min(aLength, bLength);
		return minLength;
		
	}
	
	public static String toSnakeCase(String a) {
		String SnakeStr = "";
		for( int i = 0; i < a.length(); i++) {
			SnakeStr += a.charAt(i) + "_";
		}
		
		return SnakeStr;
	}
	public static void main(String[] args) {
		System.out.println(sum(4,6));
		System.out.println(average(1,2,3,4));
		System.out.println(minOfThree(3, 5, 1));
		printNumbers(5);
		System.out.println();
		//printChars("java");
		System.out.println(merge("Computer", "Science"));
		System.out.println(getShortestStringLength("Arturo", "Games"));
		System.out.println(toSnakeCase("java"));
		String text = "Hello World";
		System.out.println(text.substring(6));
	}

}
