package Week9;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] array = new int[4];
		array[0] = 4;
		array[1] = 5;
		array[2] = 7;
		array[3] = 8;
		
		int[] array2 = {4, 5 ,7 ,8};
		
		//prints out the value of the array itself (the address)
		System.out.println(array);
		System.out.println(array2);
		
		//traverses the length of the array and prints out individual values of an array
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//boolean isEqual = compareArrays(array, array2);
		
		//array  lengths are not equal
		/*if(array.length != array2.length) {
			isEqual = false;
		}
		
		//array lengths are equal
		else {
			for(int i = 0; i < array.length; i++) {
				if(array[i] != array2[i]) {
					isEqual = false;
					break;
				}
			}
		}
		
		
		//boolean is false because only values of the arrays themselves are compared (the addresses), which are different
		//rather than actually comparing the values in each array itself		
		if(isEqual) { 
			System.out.println("Equal");
		}else { 
			System.out.println("Not Equal");
		}
		
		/*public static boolean compareArrays(int[] a1, int[] a2) {
			//array  lengths are not equal
					if(a1.length != a2.length) {
						return false;
					}
		
					//array lengths are equal
					else {
						for(int i = 0; i < a1.length; i++) {
							if(a1[i] != a2[i]) {
								return false;
								
							}
						}
					}
					
					return true;
		}*/
	
	}
	
}
		

