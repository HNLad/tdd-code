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
	public int add(String numbers) {
	    if (numbers.isEmpty()) {
	        return 0;
	    }
	    //split string
	    String[] numArray = numbers.split(",");
	    int sum = 0;
	    for (String num : numArray) {
	        sum += Integer.parseInt(num);
	    }
	    return sum;
	}
}
