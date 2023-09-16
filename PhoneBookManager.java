package Week10;
import java.util.Scanner;
import java.io.*;

public class PhoneBookManager {
	public static int countContacts(String fileName) {
		int count = 0;
		try {
			Scanner fileScanner = new Scanner(new File(fileName));
			fileScanner.nextLine();
			while (fileScanner.hasNextLine()) {
				fileScanner.nextLine();
				count++;
				
				
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	
	public static void loadArray(String fileName, String[] names, String[] phones, String[] addresses) {
		try {
			Scanner fileScanner = new Scanner(new File(fileName));
			fileScanner.nextLine();
			int i = 0;
			while(fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				
				Scanner lineScanner = new Scanner(line);
				lineScanner.useDelimiter(",");
				String name = lineScanner.next();
				String phone = lineScanner.next();
				String address = lineScanner.next();
				
				names[i] = name;
				phones[i] = phone;
				addresses[i] = address;
				i++;
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		String fileName = "phonebook.csv";
		int count = countContacts(fileName);
		Scanner scan = new Scanner(System.in);
		String[] names = new String[count];
		String[] phones = new String[count];
		String[]addresses = new String[count];
		
		loadArray(fileName, names, phones, addresses);
		
		System.out.println("Phonebook Application");
		System.out.println("1. Search contact by name");
		System.out.println("2. Search contact by phone");
		System.out.println("3. Display all contacts");
		System.out.println("4. Quit");
		
		int response = scan.nextInt();
		scan.nextLine();
		if (response == 1) {
			System.out.print("Enter Name:");
			String name = scan.nextLine();
			for(int i = 0; i < count; i++) {
				if(names[i].equals(name)) {
					System.out.println(names[i]);
					System.out.println(phones[i]);
					System.out.println(addresses[i]);
					return;
				} 
			}
			System.out.print("contact not found");
		} 
		else if(response == 2) {
			System.out.print("Enter Phone number:");
			String phone = scan.nextLine();
			for(int i = 0; i < count; i++) {
				if(phones[i].equals(phone)) {
					System.out.println(names[i]);
					System.out.println(phones[i]);
					System.out.println(addresses[i]);
					return;
				}
			}
			System.out.print("contact not found");
		}
		
		else if(response == 3) {
			System.out.print("Enter Address:");	
			String address = scan.nextLine();
			for(int i = 0; i < count; i++) {
				if(addresses[i].equals(address)) {
					System.out.println(names[i]);
					System.out.println(phones[i]);
					System.out.println(addresses[i]);
					//returns values from loop if contact is found
					return;
				}
			}
			System.out.print("contact not found");
		}
		
		else if(response == 4) {
			System.out.print("Goodbye");
		}
		
		else {
			System.out.print("invalid input");
		}
		
	}
}
