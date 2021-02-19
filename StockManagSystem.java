package TWC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StockManagSystem {
	static Scanner input = new Scanner(System.in);

	public void uploadProductFile() throws IOException {
		System.out.println("Welcome Sachin\nPlease provide the location of the stock file ");
		Scanner inScanner = new Scanner(System.in);
		// inScanner.useDelimiter("\n");
		// System.out.print("Enter input file path and name:");
		String inFile = inScanner.next();
		System.out.println("You entered: " + inFile);
		FileInputStream fs = new FileInputStream(inFile);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheetAt(0);
		System.out.println(sheet);
	}

	public Object customerDetails() {
		System.out.println("Do you have any customer? (Y/N)\nPress Q if you want to Quit.");
		String customerInput = input.nextLine();
		if (customerInput.equalsIgnoreCase("yes") || customerInput.equalsIgnoreCase("Y")) {
			
			
		} else if (customerInput.equalsIgnoreCase("No") || customerInput.equalsIgnoreCase("N")
				|| customerInput.equalsIgnoreCase("Q")) {
			System.out.println("Thanks for your time.");
		} else {
			return customerDetails();
		}
		return customerInput;
	}
	public void customernamecheck() {
		System.out.println("What’s your customer name?");
		String customername = input.nextLine();
		customername=customername.substring(0,1).toUpperCase() + customername.substring(1).toLowerCase();
		System.out.println("Hello ‘" +customername+ "’, from which category do you want to buy the product?");
	}
	
	
	public void orderPurchase() {
		
	}

}
