package main;

import java.util.ArrayList;
import java.util.List;

/**
 * This program has logic to generate the number sequence based on the given
 * input
 */
public class NumberSequenceGenerator {

	/**
	 * The method has the logic to generate the number sequence
	 * 
	 * @param input
	 * @return
	 */
	public String generateNumberSequence(int input) {

		char[] digits = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		List<String> result = new ArrayList<>();
		generateCombinations(digits, "", input, 0, result);
		return String.join(",", result);
	}

	/**
	 * This method has the logic generate number sequence combination excluding the
	 * number passed by the user.
	 * 
	 * @param digits
	 * @param current
	 * @param input
	 * @param start
	 * @param result
	 */
	private void generateCombinations(char[] digits, String current, int input, int start, List<String> result) {

		if (current.length() == input) {
			result.add(current);
			return;
		}
		for (int i = start; i < digits.length; i++) {
			generateCombinations(digits, current + digits[i], input, i, result);
		}
	}

}
