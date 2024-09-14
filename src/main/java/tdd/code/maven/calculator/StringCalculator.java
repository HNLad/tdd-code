package tdd.code.maven.calculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

	public int add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		}

		String delimiter = ",";
		if (numbers.startsWith("//")) {
			int delimiterIndex = numbers.indexOf("\n");
			delimiter = numbers.substring(2, delimiterIndex);
			numbers = numbers.substring(delimiterIndex + 1);
		}
		
		// replace \n by delimiter
		numbers = numbers.replace("\n", delimiter);
		
		// split string
		String[] numArray = numbers.split(delimiter);
		int sum = 0;

		// handling any negative number in the number string
		List<Integer> negativeNumbers = new ArrayList<>();
		for (String num : numArray) {
			int value = Integer.parseInt(num);
			if (value < 0) {
				negativeNumbers.add(value);
			} else {
				sum += value;
			}
		}

		// if negative found throw error
		if (!negativeNumbers.isEmpty()) {

			// handled multiple negative numbers
			StringBuilder exceptionMessage = new StringBuilder("Negative numbers not allowed: ");
			for (int i = 0; i < negativeNumbers.size(); i++) {
				exceptionMessage.append("[").append(negativeNumbers.get(i)).append("]");
				if (i < negativeNumbers.size() - 1) {
					exceptionMessage.append(",");
				}
			}
			throw new RuntimeException(exceptionMessage.toString());
		}
		return sum;
	}
	

//	public int add(String numbers) {
//        return 0;
//    }

//	public int add(String numbers) {
//	    if (numbers.isEmpty()) {
//	        return 0;
//	    }
//	    return Integer.parseInt(numbers);
//	}

	/**
	 * Add Two Numbers
	 */
//	public int add(String numbers) {
//	    if (numbers.isEmpty()) {
//	        return 0;
//	    }
//	    //split string
//	    String[] numArray = numbers.split(",");
//	    int sum = 0;
//	    for (String num : numArray) {
//	        sum += Integer.parseInt(num);
//	    }
//	    return sum;
//	}

	/**
	 * Test for Newline Delimiters
	 */
//	public int add(String numbers) {
//	    if (numbers.isEmpty()) {
//	        return 0;
//	    }
//	    //replace \n by ,
//	    numbers = numbers.replace("\n", ",");
//	    //split string
//	    String[] numArray = numbers.split(",");
//	    int sum = 0;
//	    for (String num : numArray) {
//	        sum += Integer.parseInt(num);
//	    }
//	    return sum;
//	}

	/**
	 * Test for Custom Delimiters
	 */
//	public int add(String numbers) {
//		if (numbers.isEmpty()) {
//			return 0;
//		}
//		
//		String delimiter = ",";
//		if (numbers.startsWith("//")) {
//			int delimiterIndex = numbers.indexOf("\n");
//			delimiter = numbers.substring(2, delimiterIndex);
//			numbers = numbers.substring(delimiterIndex + 1);
//		}
//		// replace \n by delimiter
//		numbers = numbers.replace("\n", delimiter);
//		// split string
//		String[] numArray = numbers.split(delimiter);
//		int sum = 0;
//		for (String num : numArray) {
//			sum += Integer.parseInt(num);
//		}
//		return sum;
//	}

	/**
	 * Test for Negative Numbers
	 */
//	public int add(String numbers) {
//		if (numbers.isEmpty()) {
//			return 0;
//		}
//
//		String delimiter = ",";
//		if (numbers.startsWith("//")) {
//			int delimiterIndex = numbers.indexOf("\n");
//			delimiter = numbers.substring(2, delimiterIndex);
//			numbers = numbers.substring(delimiterIndex + 1);
//		}
//		// replace \n by delimiter
//		numbers = numbers.replace("\n", delimiter);
//		// split string
//		String[] numArray = numbers.split(delimiter);
//		int sum = 0;
//		
//		//handling any negative number in the number string
//		List<Integer> negativeNumbers = new ArrayList<>();
//		for (String num : numArray) {
//			int value = Integer.parseInt(num);
//			if (value < 0) {
//				negativeNumbers.add(value);
//			} else {
//				sum += value;
//			}
//		}
//
//		//if negative found throw error
//		if (!negativeNumbers.isEmpty()) {
//			throw new RuntimeException("Negative numbers not allowed: " + negativeNumbers);
//		}
//
//		return sum;
//	}
}
