package Week7;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CodeChallenge5 {
	public static int countLines(String fileName) throws FileNotFoundException {
		Scanner scan = new Scanner(new File(fileName));
		int count = 0;
	
			while(scan.hasNextLine()) {
				count++;
				scan.nextLine();
				
			}
		
		return count;
	}
	
	public static int countWords(String fileName) throws FileNotFoundException {
		Scanner console = new Scanner(new File(fileName));
		int count = 0;
		
		while(console.hasNext()) {
			count++;
			console.next();
			
		}
	
	return count;
	}
	
	public static int characterWithoutSpaces(String fileName) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(fileName));
		int count = 0;
		while(sc.hasNext()) {
			String word = sc.next();
			count += word.length();
		}
		
		return count;
	}
	
	public static int countCharactersWithSpaces(String fileName) throws FileNotFoundException {
		Scanner scan = new Scanner(new File(fileName));
		int count = 0;
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			for(int i = 0; i < line.length(); i++) {
				if (i == ' ' || i!= ' ');
				count++;
			}
		}
		
		return count;
		
	}
	
	public static void generateReport(String fileName) throws FileNotFoundException {
		System.out.println("Number of lines: " + countLines(fileName));
		System.out.println("Number of words: " + countWords(fileName));
		System.out.println("Number of characters without spaces: " + characterWithoutSpaces(fileName));
		System.out.println("Number of characters with spaces: " + countCharactersWithSpaces(fileName));
	}
	
	public static int countWord(String fileName, String word) {
		int count = 0;
		try{
		Scanner fileScanner = new Scanner(new File(fileName));
		//loops through each line in the file
		while(fileScanner.hasNextLine()) {
		String wordStr = fileScanner.next(); 
		if(wordStr.toLowerCase().contains(word.toLowerCase())) //if
		count++;
		}
		}catch(FileNotFoundException e){
		System.out.println("File not found");
		}
		return count;
	}
	
	
	public static void main (String[] args) throws FileNotFoundException {
		int lineCount = countLines("newInput.txt"); 
		int wordCount = countWords("newInput.txt");
		int charCount = characterWithoutSpaces("newInput.txt");
		int charCountWithSpaces = countCharactersWithSpaces("newInput.txt");
		System.out.println(lineCount + " " + charCount + " " + wordCount + " " + charCountWithSpaces);
		generateReport("newInput.txt");
		System.out.println(countWord("newInput.txt", "influencer"));
	}

}
