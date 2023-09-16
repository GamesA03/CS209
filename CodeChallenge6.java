package Week8;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class CodeChallenge6 {
	public static void main(String[] args) {
		
	       int [ ] b = new int [5];
	       b[0] = 5;
	       b[1] = 4;
	       b[2] = 3;
	       System.out.println(b[0] + b[1] + b[4]);
	       
	       
	       int[] nums = new int[3];
	       nums[0] = 10;
	       nums[1] = 2;
	       nums[2] = 5;
	       int testsum = 0;
	       for(int i = 0; i < nums.length; i++) {
	    	   testsum+=nums[i];
	       }
	       System.out.println(testsum);
	       
	       
	       int [ ] fun = new int [5];
	       fun[0] = 1;
	       fun[1] = 2;
	       fun[2] = 3;
	       fun[3] = 4;
	       fun[4] = 5;
	       int j = 3;
	       System.out.println(fun[ j-1]);
	       
	       
		int[] newArray = new int[5];
		
		newArray[0] = 30;
		newArray[1] = 40;
		newArray[2] = 89;
		newArray[3] = 87;
		newArray[4] = 20;
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		int[] checkArray = {1, 7, 8, 10, 5, 7, 30};
		
		for(int i = 0; i < checkArray.length-1; i++) {
			if(checkArray[i] > checkArray[i+1]) {
				checkArray[i] = checkArray[i] *2;
			}
		}
		
		int[] randomArray = new int[10];
		/*randomArray[0] = (int) (Math.random() * 50) + 1;
		randomArray[1] = (int) (Math.random() * 50) + 1;
		randomArray[2] = (int) (Math.random() * 50) + 1;
		randomArray[3] = (int) (Math.random() * 50) + 1;
		randomArray[4] = (int) (Math.random() * 50) + 1;
		randomArray[5] = (int) (Math.random() * 50) + 1;
		randomArray[6] = (int) (Math.random() * 50) + 1;
		randomArray[7] = (int) (Math.random() * 50) + 1;
		randomArray[8] = (int) (Math.random() * 50) + 1;
		randomArray[9] = (int) (Math.random() * 50) + 1;*/
		
		for(int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int) (Math.random() * 50) + 1;
			
		}
			
		
		for(int i = 0; i  < randomArray.length; i++) {
			System.out.print(randomArray[i] + " ");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		System.out.print("Enter an Array Size: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] inputArray = new int[a];
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = (int) (Math.random() * 100) + 1; 
		    System.out.print(inputArray[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		try {
			Scanner fileScan = new Scanner(new File("scores.txt"));
			int count = 0;
			while(fileScan.hasNextInt()) {
				count++;
				fileScan.nextInt();
				
			}
			
			
			int[] scores = new int[count];
			
			
			fileScan = new Scanner(new File("scores.txt"));
			while(fileScan.hasNextInt()) {
				for(int i = 0; i < scores.length; i++) {
					scores[i] = fileScan.nextInt();
					
				}
				
			}
			
			fileScan = new Scanner(new File("scores.txt"));
			double sum = fileScan.nextInt();
			while(fileScan.hasNextInt()){
				
				sum+=(double)fileScan.nextInt();
			}
			
				System.out.println(sum / count);
				
				
			Arrays.sort(scores);
			for (int i = 0; i < scores.length; i++) {
				System.out.println(scores[i]);
			}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		System.out.print("Enter an Array Size: ");
		int c = scan.nextInt();
		int[] array= new int[c];
		for (int i = 0; i <= inputArray.length; i++) {
			System.out.print("Enter Array values: ");
			array[i] = scan.nextInt();
			System.out.println(array[i] + " ");
		}
				
	}
}
