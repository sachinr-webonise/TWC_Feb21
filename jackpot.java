package TWC;

import java.io.IOException;
import java.util.Scanner;

public class jackpot extends validations {

	public static void main(String[] args) throws IOException {

		int user_age = ageValidation();
		guessVal(user_age);

	}

}
