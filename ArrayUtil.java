package Week10;

import java.util.Arrays;

public class ArrayUtil {
	public static int findMax(int[] array) {
		if(array.length == 0) {
			return -1;
		}
		Arrays.sort(array);
		return array[array.length-1];
	
	}
}
