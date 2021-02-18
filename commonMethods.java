package TWC;



	

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;


public class commonMethods extends validations {


	public void deductAmount() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Sachin\\eclipse-workspace\\Jackpot\\Jackpot\\src\\TWC\\businesschecks.properties");
		prop.load(fis);


		String deductAmount = prop.getProperty("deductAmount");
		int deductAmount1 = Integer.parseInt(deductAmount);
		validations.winningPrize -= deductAmount1;
		


	}


	public void printmessage(int i, String message) {


		if (i == 5) {
			System.out.println("You lost");


		} else {
			System.out.println("Guess Again!! " + message + " than the actual");


		}
	}








}
