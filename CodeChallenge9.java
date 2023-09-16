package Week9;

public class CodeChallenge9 {
	public static int sum (int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	public static int count(int[] a, int number) {
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == number) {
				count++;
			}
		}
		
		return count;
	}
	
	public static int getIndex(int[] a, int number) {
		for(int i = 0; i < a.length; i++ ) {
			if(a[i] == number) {
				return i;
			} 
		}
		return -1;
	}
	
	public static boolean search(String[] a, String name) {
		for(int i = 0; i < a.length; i++) {
			if(a[i].equals(name)) {
				return true;
			} 
		}
		return false;
	}
	
	public static void replace(double[] a, double number) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] < 0) {
				a[i] = number;
			}
			System.out.println(a[i] + " ");
		}
		
	}
	
	public static boolean compare(String[] a, String[] b) {
			if(a.length != b.length) {
				return false;
			} else {
				for(int i = 0; i < a.length; i++) {
					if(a[i] != b[i]) {
						return false;
						
					}
				}
			}
			
			return true;
			
	}
	
	
	
	public static void main(String[] args) {
		int[] array1 = {1, 1, 2, 3, 4};
		System.out.println(sum(array1));
		System.out.println(count(array1, 1));
		
		int[] numbers = {1, 2, 4, 1, 6, 1};
		int index = getIndex(numbers , 1); //returns an index of 0 as the first occurrence of 1 in the array
		System.out.println(index);
		
		String[] names = {"Alice", "Bob" , "Charlie" , "Donna" , "Eric"};
		boolean isFound = search(names , "Bob");
		System.out.println(isFound);
		
		double[] values = {1.3, -2.4, 8.8, -3.8, 7.4};
		replace(values, 5.0);
		
		String[] names1 = {"Alice", "Bob" , "Charlie" , "Donna" , "Eric"};
		String[] names2 = {"Alice", "Bingus" , "Charlie" , "Donna" , "Eric"};
		boolean isEquals = compare(names1 , names2);
		System.out.println(isEquals);
	}
}
