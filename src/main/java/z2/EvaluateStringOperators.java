package z2;

import java.util.ArrayList;
import java.util.List;

public class EvaluateStringOperators {

	public static void main(String[] args) {
		String input = "98574*/+-";
		evaluateString(input);
	}
	private static void evaluateString(String input) {
		List<Integer> integers = new ArrayList<>();
		List<Character> operators = new ArrayList<>();

		for (char c : input.toCharArray()) {
			if (Character.isDigit(c)) {
				integers.add(Character.getNumericValue(c));
			} else {
				operators.add(c);
			}
		}
		int result = integers.get(0);
		for (int i = 0; i < integers.size() - 1; i++) {
			char op = operators.get(i);
			int nextInt = integers.get(i + 1);
			switch (op) {
			case '+':
				result += nextInt;
				break;
			case '-':
				result -= nextInt;
				break;
			case '/':
				result /= nextInt;
				break;
			case '*':
				result *= nextInt;
				break;
			default:
				System.out.println("Invalid Operator");
			}
		}
		System.out.println(result);
	}

}
