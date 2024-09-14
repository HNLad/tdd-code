package tdd.code.maven.calculator;

public class StringCalculator {

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
		for (String num : numArray) {
			sum += Integer.parseInt(num);
		}
		return sum;
	}
}
