package TWC;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;

import java.util.Random;

import java.util.Scanner;

public class validations {

	static int winningPrize;

	static int attempt;

	public static final String ageRegexInt = "^[(1[89]|[2-9]\\d)]+$";

	static boolean flag = false;

	static Scanner input = new Scanner(System.in);

	public static int ageValidation() {

		int user_age;

		String input_number;

		while (true) {

			System.out.println("What’s your age?");

			input_number = input.nextLine();

			if (!input_number.matches(ageRegexInt)) {

				System.out.println("Invalid age");

				continue;

			}

			user_age = Integer.parseInt(input_number);

			if (user_age >= 20)

			{

				return user_age;

			} else {

				System.out.println("You are not eligible to play this game. Minimum age is 20");

				System.exit(0);

			}

		}

	}

	public static int enteredNumValidation(int user_age) {

		int enterednumber;

		String i_number;

		while (true) {

			System.out.println("Choose a number greater than " + user_age);

			i_number = input.nextLine();

			if (!i_number.matches(ageRegexInt)) {

				System.out.println("Incorrect input");

				continue;

			}

			enterednumber = Integer.parseInt(i_number);

			if (enterednumber > user_age) {

				return enterednumber;

			}

		}

	}

	public static int guessNumber(int inputNumber) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Guess a number between 1 and " + inputNumber);

		try {

			int guessNum = sc.nextInt();

			sc.nextLine();

			return guessNum;

		}

		catch (Exception e) {

			System.out.println("invalid");

		}

		return guessNumber(inputNumber);

	}

	public static int guessVal(int age) throws IOException {

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Sachin\\eclipse-workspace\\Jackpot\\Jackpot\\src\\TWC\\businesschecks.properties");

		prop.load(fis);

		String prizeamount = prop.getProperty("prizeAmount");

		winningPrize = Integer.parseInt(prizeamount);

		int num = enteredNumValidation(age);

		commonMethods deduct = new commonMethods();

		int min = 1;

		int max = num;

		Random random = new Random();

		int randomnumber = random.nextInt(max - min) + min;

		System.out.println("system generated number is " + randomnumber);

		String attemptsCount = prop.getProperty("attemptsCount");

		attempt = Integer.parseInt(attemptsCount);

		for (int i = 1; i <= attempt; i++) {

			int guessnumber;

			String newinput;

			int guessNo = guessNumber(num);

			if (guessNo == randomnumber) {

				System.out.println("Congrats you won $" + winningPrize + " for choosing number " + guessNo);

				break;

			} else if (guessNo > randomnumber) {

				deduct.printmessage(i, "higher");

				deduct.deductAmount();

			} else if (guessNo < randomnumber) {

				deduct.printmessage(i, "lower");

				deduct.deductAmount();

			}

		}

		return winningPrize;

	}

}
