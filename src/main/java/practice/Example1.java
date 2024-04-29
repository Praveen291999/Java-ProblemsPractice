package practice;

public class Example1 {

	public static void main(String[] args) throws Exception {
		String userInput = "N";

		if (isValidInput(userInput)) {
			System.out.println("valid");
		}
	}

	private static boolean isValidInput(String input) {
		// Check if the input consists of only 'Y' or 'N'
		return input.matches("[YNyn]");
	}

}
