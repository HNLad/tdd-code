package tdd.code.maven.calculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

	public int add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		}

		// Extract delimiter from numbers string
		String delimiter = getDelimiter(numbers);

		// Get Proper Format Number String from the custom delimiter
		String properNumbersWithDelimiter = properFormatInput(numbers, delimiter);

		// Split numbers by delimiter and calculate sum
		return calculateSum(properNumbersWithDelimiter, delimiter);
	}

	private String getDelimiter(String numbers) {
		if (numbers.startsWith("//")) {
			int delimiterIndex = numbers.indexOf("\n");
			return numbers.substring(2, delimiterIndex);
		}
		// Default delimiter
		return ",";
	}

	private String properFormatInput(String numbers, String delimiter) {
		if (numbers.startsWith("//")) {
			int delimiterIndex = numbers.indexOf("\n");
			return numbers.substring(delimiterIndex + 1).replace("\n", delimiter);
		}
		return numbers.replace("\n", delimiter);
	}

	private int calculateSum(String numbers, String delimiter) {

		String[] numArray = numbers.split(delimiter);
		List<Integer> negativeNumList = new ArrayList<>();

		int sum = 0;

		for (String num : numArray) {
			int value = Integer.parseInt(num);
			if (value < 0) {
				negativeNumList.add(value);
			} else {
				sum += value;
			}
		}

		// Handle the calculation and exception for negative numbers
		if (!negativeNumList.isEmpty()) {
			throw new RuntimeException(formatExceptionMessage(negativeNumList));
		}

		return sum;
	}

	private static String formatExceptionMessage(List<Integer> negativeNumbers) {
		//build exception message
		StringBuilder message = new StringBuilder("Negative numbers not allowed: ");
		for (int i = 0; i < negativeNumbers.size(); i++) {
			message.append("[").append(negativeNumbers.get(i)).append("]");
			if (i < negativeNumbers.size() - 1) {
				message.append(",");
			}
		}
		return message.toString();
	}
}
