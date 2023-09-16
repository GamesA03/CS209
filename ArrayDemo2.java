package Week9;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int[] a1 = {1, 2, 3};
		int[] a2 = {5, 6, 7, 8, 9};
		
		incrementArray(a1);
		//mergedArray = {1, 2, 3, 5, 6, 7, 8, 9}
		/*int[] mergedArray = merge(a1, a2);
		printArray(a1);
		printArray(a2);
		printArray(mergedArray);*/
	}
	
	public static void incrementArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i]+=1;
		}
		
	}
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[1] + " ");
		}
	}
	public static int[] merge(int[] a1, int[] a2) {
		int[] newArray = new int[a1.length + a2.length];
		
		for(int i = 0; i < a1.length; i++) {
			newArray [i] = a1[i];
		}
		
		for(int i = 0; i < a2.length; i++) {
			//moves the for loop increment up 3 values to avoid overwriting the previous for-loop
			newArray[a1.length + i] = a2[i];
		}
		return newArray;
	}
}
